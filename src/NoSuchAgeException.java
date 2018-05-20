/**
 * Class used to check and catch NoSuchAgeException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */
public class NoSuchAgeException extends Exception
{
	/**
	 * This is a default Constructor
	 */
	public NoSuchAgeException() 
	{
		super();
	} 
	/**
	 * This is a Constructor
	 * 
	 * @param errMsg
	 * @param personAge
	 */
	public NoSuchAgeException(String errMsg, int personAge) 
	{
		super(errMsg); 

		//System.out.println("You are trying to enter a person whose age is negative or over 150. (You\n" + 
		//		"can treat age as integer)");		
		//System.out.println("Error message is: " + errMsg);
	} 


	/**
     * A method to check if a person can be added into this network, condition: their age between 0 - 150.
     * 
     * @param int personAge
     * @return
     * @throws NoSuchAgeException
     */
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
