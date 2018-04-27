import java.util.ArrayList;

public abstract class Couple implements Relationship{
    private Adults couple;
    private ArrayList<Children> children = new ArrayList<>();

    public Couple(Adults couple, ArrayList<Children> children) {
        this.couple = couple;
        this.children = children;
    }

    public Adults getCouple() {
        return couple;
    }

    public ArrayList<Children> getChildren() {
        return children;
    }

    @Override
    public void addRelation(Person person1,Person person2,String relation){
        person1.setGender('F');
        if(person2.getGender()=='M'){

        }
    }


    @Override
    public void addRelation(Person person, String relation) {
        boolean areCouple = false;
        if(person instanceof Adults && person.getAge() > 16) {
            for (Couple cp : couple) {
                if (cp.person.equals(person)) {
                    areCouple= true;
                }
            }

            if(!areFriends){
                addRelation(this.person,relation);
            }
        }

    }


}
