import java.util.ArrayList;

public abstract class Couple implements Relationship{
    private Adults couple1;
    private Adults couple2;
    private ArrayList<Children> children = new ArrayList<>();


    public Couple(Adults couple1, Adults couple2, ArrayList<Children> children) {
        this.couple1 = couple1;
        this.couple2 = couple2;
        this.children = children;
    }

    public void addRelation(Adults couple1,Adults couple2,String relation){
        boolean areCouple =false;
        couple1.setGender('F');
        if(couple2.getGender()=='M'){
            for (Children child : children) {
                if(child.equals(this)){
                    areCouple =true;
                }else{
                    System.out.println("You are not allowed to be couple");
                }
            }
            if(!areCouple){
                addRelation(couple1,couple2,"couple");
            }
        }
    }
}
