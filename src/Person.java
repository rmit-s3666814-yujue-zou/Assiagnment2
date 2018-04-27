
/**
 * Write a description of class Person here.
 *
 * @author Jyh-woei Yang
 * @version 27/04/2018
 */
public class Person
{
   // initialise instance variables
   private String name;
   private int age;
   private char gender;
   private String status;
    
    public Person(String name, int age, char gender, String status)
    {
        // initialise instance variables in constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.status = status;
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

    public void setAge(int Age)
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

    public void setGender(char Gender)
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

    public void setStatus(String Status)
    {
        // put your code here
        this.status = status;
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