interface Relationship {

    void addRelation(Person person, String relation);
    void addRelation(Person person1,Person person2,String relation);
    void setRelation(String relation);
    void getRelation(Person person, String relation);
    void printRelation();
    void deleteRelation();

}
