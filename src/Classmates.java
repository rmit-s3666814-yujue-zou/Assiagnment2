import java.util.ArrayList;
import java.lang.String;

public abstract class Classmates implements Relationship {
    private Person person;
    private String relation;
    private ArrayList<Classmates> classmates = new ArrayList<>();


    public Classmates(Person person, String relation) {
        this.person = person;


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
                boolean areClassmates = false;
                for (Classmates cla : classmates) {
                    if (cla.getPerson().equals(person)) {
                        areClassmates = true;
                    } else {
                        System.out.println("You are not allowed to be classmates");
                    }
                    if (!areClassmates) {
                        addRelation(this.person, "classmates");
                    }
                }
            }
        }

        if(person instanceof Adults && person.getAge() >16){
            boolean areClassmates = false;
            for (Classmates cla : classmates) {
                if (cla.getPerson().equals(person)) {
                    areClassmates = true;
                }else{
                    System.out.println("You are not allowed to be classmates");
                }
                if (!areClassmates) {
                    addRelation(this.person, "classmates");
                }
            }
        }
    }
}

