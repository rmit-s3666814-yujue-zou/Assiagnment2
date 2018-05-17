/**
 * Class used to add relationship between person .
 *
 * @author Yujue Zou
 * @version 07/05/2018
 */

public class Relationship {
    private Person person1;
    private Person person2;
    private String relationship;
    /**
     * Constructor for relationship
     * @param person1 Accept person1 to be added
     * @param person2 Accept person2 to be added
     * @param relationship Accept relationship with the type of String
     */

    public Relationship(Person person1, Person person2, String relationship) {
        this.person1 = person1;
        this.person2 = person2;
        this.relationship = relationship;
    }
    /**
     * Used to get a person object
     * @return person1 - corresponding person
     */

    public Person getPerson1() {
        return person1;
    }
    /**
     * Used to set a person object
     * @return person1 - corresponding person
     */

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }
    /**
     * Used to get another person object
     * @return person2 - corresponding person
     */

    public Person getPerson2() {
        return person2;
    }
    /**
     * Used to get another person object
     * @return person2 - corresponding person
     */

    public void setPerson2(Person person2) {
        this.person2 = person2;
    }
    /**
     * Used to get the relationship type
     * @return relationship - relationship with type of String
     */

    public String getRelationship() {
        return relationship;
    }
    /**
     * Used to set/change existing relationship
     * @param relationship Accept a String to set a relationship
     */

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
