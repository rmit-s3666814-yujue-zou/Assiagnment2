/**
 * Write a description of class Adult here.
 *
 * @author Jyh-woei Yang
 * @version 13/05/2018
 */
public class Adults extends Person
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Adult
     */
    public Adults(String name, int age, char gender, String status,String relationshipList)
    {
        // initialise instance variables
        super(name,age,gender,status,relationshipList);
    }
    
    public Boolean validAdult(int age)
    {
    		if (age <= 150 && age > 16)
    			return true;
    		return false;
    }
}
