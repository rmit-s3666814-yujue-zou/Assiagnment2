import java.util.ArrayList;

public abstract class Colleagues implements Relationship {
    private Person person;
    private String relation;
    private ArrayList<Colleagues> colleagues= new ArrayList<>();

    public Colleagues(Person person, String relation) {
        this.person = person;
    }

    public Person getPerson1() {
        return person;
    }

    @Override
    public void addRelation(Person person, String relation) {
        boolean areColleagues = false;
        if(person instanceof Adults && person.getAge() > 16) {
            for (Colleagues col : colleagues) {
                if (col.person.equals(person)) {
                    areColleagues = true;
                }else{
                    System.out.println("You are not allowed to be classmates");
                }
            }
            if(!areColleagues){
                addRelation(this.person,"colleagues");
            }
        }
    }
}
