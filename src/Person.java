
/**
 * Write a description of class Person here.
 *
 * @author Jyh-woei Yang
 * @version 13/05/2018
 */
public class Person
{
   // initialise instance variables
   private String name;
   private int age;
   private char gender;
   private String status;
   private String relationshipList;
    
   public Person()
   {
       // initialise instance variables in constructor
       this.name = "";
       this.age = 0;
       this.gender = 'M';
       this.status = "";
       this.relationshipList = "";
   }
   
    public Person(String name, int age, char gender, String status, String relationshipList)
    {
        // initialise instance variables in constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.status = status;
        this.relationshipList = relationshipList;
    }
    
    /**
     * A method to get name from Person
     *
     * @param
     * @return a String of name
     */

    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * A method to get age from Person
     *
     * @param
     * @return an int of age
     */

    public int getAge()
    {
        // put your code here
        return age;
    }
    
    /**
     * A method to get gender from Person
     *
     * @param
     * @return a char of gender
     */
 
    public char getGender()
    {
        // put your code here
        return gender;
    }
    
    /**
     * A method to get status from Person
     *
     * @param
     * @return a String of status
     */

    public String getStatus()
    {
        // put your code here
        return status;
    }

    /**
    * A method to get a String of name
    *
    * @param  
    * @return a String of RelationshipList 
    */
    public String getRelationshipList() 
    {
    		return relationshipList;
    }

    
     /**
     * A method to set a String of name
     *
     * @param  name  a String for a method
     * @return 
     */

    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }

     /**
     * A method to set a int of name
     *
     * @param  int  a int for a method
     * @return 
     */

    public void setAge(int age)
    {
        // put your code here
        this.age = age;
    }

     /**
     * A method to set a char of gender
     *
     * @param  char  a char for a method
     * @return 
     */

    public void setGender(char gender)
    {
        // put your code here
        this.gender = gender;
    }
    
     /**
     * A method to set a String of status
     *
     * @param  String  a String for a method
     * @return
     */

    public void setStatus(String status)
    {
        // put your code here
        this.status = status;
    }
    
    /**
    * A method to set a String of name
    *
    * @param  name  a String for a method
    * @return 
    */
    public void setRelationshipList(String relationshipList) 
    {
    		this.relationshipList = relationshipList;
    }

   /**
     * A method to display String lines of Person
     *
     * @param
     * @return
     */
    public void displayPerson()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Status:"+status);
    }
}
