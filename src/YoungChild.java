/**
 * Write a description of class YoungChild here.
 * YoungChild (2 year old or younger) is a type of person. 
 * Each person has a “profile” in the social network.
 * Their profiles records their age, gender, status.
 *
 * @author Jyh-woei Yang
 * @version 16/05/2018
 */
public class YoungChild extends Person
{
    // instance variables - replace the example below with your own
	String profile;
	
    /**
     * Constructor for objects of class Adult
     */
    public YoungChild(String name, String photoPath, int age, char gender, String status, String ausStates, String relationshipList)
    {
        // initialise instance variables
        super(name,photoPath,age,gender,status,ausStates,relationshipList);
        profile = "";
    }
    
    public Boolean validYoungChild(int age)
    {
    		if (age <= 2 && age > 0)
    			return true;
    		return false;
    }
}
