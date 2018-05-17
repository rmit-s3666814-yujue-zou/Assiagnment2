/**
 * Class used to check and catch TooYoungException
 */

public class TooYoungException extends Exception
{
	
	public TooYoungException(String errMsg, int age) 
	{
		super(errMsg); 

		System.out.println("Age " + age + " is too young."); 

		System.out.println("Error message is: " + errMsg);
	} 

//The withdraw() method in class Account can be re-defined accordingly:

	public void validTooYoung(int age) throws TooYoungException 
	{ 
		if (age <= 2 && age > 0) 
		{
			throw new TooYoungException( "YoungChild is too young to be a friend", age);
		}
	}
}
