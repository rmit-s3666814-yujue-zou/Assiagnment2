/**
 * Class used to check and catch NotToBeFriendsException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */
public class NotToBeFriendsException extends Exception
{
	/**
	 * This is a Constructor
	 * 
	 * @param errMsg
	 * @param person1age
	 * @param person2age
	 */
	public NotToBeFriendsException(String errMsg, int person1age, int person2age) 
	{
		super(errMsg); 

		System.out.println("Age:" + person1age + " is older than "+ person2age +" over 3 years.");
		System.out.println("Age:" + person1age + " is in an adult group and age"+ person2age +"is in a child group.");
		System.out.println("They cannot be a friend.");

		
		System.out.println("Error message is: " + errMsg);
	} 


	/**
     * A method to check if the two people are available to be friends
     * 
     * @param int person1age, person2age
     * @return
     * @throws NotToBeFriendsException
     */
	public void validNotToBeFriends(int person1age, int person2age) throws NotToBeFriendsException 
	{ 
		if (person1age > 16 && person2age <= 16) 
		{
			throw new NotToBeFriendsException( "Person1 and Person2 cannot be a friend", person1age, person2age);
		}
		
		if (person1age <= 16 && person2age > 16) 
		{
			throw new NotToBeFriendsException( "Person1 and Person2 cannot be a friend", person1age, person2age);
		}
		
		if (person1age <= 16 && person2age <= 16)
		{
			if (person1age - person2age > 3 || person1age - person2age < (-3)) 
			{
				throw new NotToBeFriendsException( "Person1 and Person2 cannot be a friend", person1age, person2age);
			}
		}
	}
}
