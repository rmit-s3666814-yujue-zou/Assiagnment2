
/**
 * Write a description of class Children here.
 *
 * @author Jyh-woei Yang
 * @version 13/05/2018
 */
public class Children extends Person
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Children
     */
    public Children(String name, int age, char gender, String status, String relationshipList)
    {
        // initialise instance variables
        super(name,age,gender,status,relationshipList);
    }
    
    public Boolean validChild(int age)
    {
    		if (age <= 16 && age > 2)
    			return true;
    		return false;
    }
}
