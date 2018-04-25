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
                }
            }

            if(!areColleagues){
                addRelation(this.person,"colleagues");
            }
        }

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
