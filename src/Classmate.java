public class Classmate implements Relationship{
    private Person person1;
    private Person person2;
    private String relation;

    public Classmate(Person person1, Person person2, String relation) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = relation;
    }

    public Person getPerson1() {
        return person1;
    }

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public void setPerson2(Person person2) {
        this.person2 = person2;
    }


    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public void addRelation(Person person) {

    }


    @Override
    public void getRelation(Person String) {

    }
    @Override
    public void printRelation() {

    }

    @Override
    public void deleteRelation() {

    }
    public
}
