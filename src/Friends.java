import java.util.ArrayList;

public abstract class Friends implements Relationship {
    private Person person;
    private ArrayList<Friends>friends= new ArrayList<>();

    public Friends(Person person, ArrayList<Friends> friends) {
        this.person = person;
        this.friends = friends;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public void addRelation(Person person, String relation) {
        int maxAgeDif = person.getAge() + 3;
        int minAgeDif = person.getAge() - 3;

        if (person instanceof Children && person.getAge() > 2 && person.getAge() <= 16) {
            if (person.getAge() > minAgeDif && person.getAge() < maxAgeDif) {
                boolean areFriends = false;
                for (Friends friends : friends) {
                    if (friends.getPerson().equals(person)) {
                        areFriends = true;
                    } else if(!areFriends) {
                        addRelation(this.person, relation);
                    }
                }
            }else System.out.println("You are not allowed to be added as friends");
        }

        if(person instanceof Adults && person.getAge() >16){
            boolean areFriends = false;
            for (Friends friends : friends) {
                if (friends.getPerson().equals(person)) {
                    areFriends = true;
                    addRelation(this.person, relation);
                }else if(!areFriends){
                    addRelation(this.person,relation);
                }

            }
        }else System.out.println("You are not allowed to be added as friends");
    }


    @Override
    public void setRelation(String relation){
        setRelation("colleagues");

    }

    @Override
    public void getRelation(Person person, String relation) {

    }

    @Override
    public void printRelation() {

    }

    @Override
    public void deleteRelation() {

    }
}




