/**
 * Class used to check and catch NoSuchAgeException
 */
public class NoSuchAgeException extends Exception
{
	
	public NoSuchAgeException() 
	{
		super();
	} 
	
	public NoSuchAgeException(String errMsg, int personAge) 
	{
		super(errMsg); 

		//System.out.println("You are trying to enter a person whose age is negative or over 150. (You\n" + 
		//		"can treat age as integer)");		
		//System.out.println("Error message is: " + errMsg);
	} 

//The validNotSuchAge() method in class MiniNet can be re-defined accordingly:

	public void validNotSuchAge(int personAge) throws NoSuchAgeException 
	{ 
		//person's age is negative
		if (personAge < 0) 
		{
			throw new NoSuchAgeException( "No such Age! You are not allowed to do this operation.", personAge);
		}
		
		//person's age is over 150
		if (personAge > 150) 
		{
			throw new NoSuchAgeException( "No such Age! You are not allowed to do this operation.", personAge);
		}
	}
}
