/**
 * Class used to check and catch NotToBeFriendsException
 */
public class NotToBeFriendsException extends Exception
{
	
	public NotToBeFriendsException(String errMsg, int person1age, int person2age) 
	{
		super(errMsg); 

		System.out.println("Age:" + person1age + " is older than "+ person2age +" over 3 years.");
		System.out.println("Age:" + person1age + " is in an adult group and age"+ person2age +"is in a child group.");
		System.out.println("They cannot be a friend.");

		
		System.out.println("Error message is: " + errMsg);
	} 

//The withdraw() method in class Account can be re-defined accordingly:

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
