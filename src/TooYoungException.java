/**
 * Class used to check and catch TooYoungException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */

public class TooYoungException extends Exception
{
	/**
	 * This is a Constructor
	 * 
	 * @param errMsg
	 * @param age
	 */
	public TooYoungException(String errMsg, int age) 
	{
		super(errMsg); 

		//System.out.println("Age " + age + " is too young."); 
		//System.out.println("Error message is: " + errMsg);
	} 

	/**
     * A method to check if the two infants are not available to have friends
     * 
     * @param age
     * @return
     * @throws TooYoungException
     */

	public void validTooYoung(int age) throws TooYoungException 
	{ 
		if (age <= 2 && age > 0) 
		{
			throw new TooYoungException( "YoungChild is too young to be a friend", age);
		}
	}
}
