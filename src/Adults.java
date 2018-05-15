/**
 * Write a description of class Adult here.
 *
 * @author Jyh-woei Yang
 * @version 16/05/2018
 */
public class Adults extends Person
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Adult
     */
    public Adults(String name, String photoPath, int age, char gender, String status, String ausStates, String relationshipList)
    {
        // initialise instance variables
        super(name,photoPath,age,gender,status,ausStates,relationshipList);
    }
    
    public Boolean validAdult(int age)
    {
    		if (age <= 150 && age > 16)
    			return true;
    		return false;
    }
}
