/**
 * Class used to check and catch NotToBeClassmatesException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */


public class NotToBeClassmatesException extends Exception 
{

	/**
	 * This is a Constructor
	 * 
	 * @param errMsg
	 * @param person1Age
	 * @param person2Age
	 */
 	public NotToBeClassmatesException(String errMsg, int person1Age, int person2Age) 
 	{
 		super(errMsg); 

 		System.out.println("You are trying to connect a YoungChild in a classmate relation.");		
 		System.out.println("Error message is: " + errMsg);
 	} 


	/**
     * A method to check if the two people are available to be classmates
     * 
     * @param int person1Age, int person2Age
     * @return
     * @throws NotToBeClassmatesException
     */
 	public void validNotToBeClassmates(int person1Age, int person2Age) throws NotToBeClassmatesException 
 	{ 
 		//person1 is not an adult or child
 		if (person1Age <= 2) 
 		{
 			throw new NotToBeClassmatesException( "Person1 is too young! You are not allowed to do this operation.", person1Age, person2Age);
 		}
 		
 		//person2 is not an adult or child
 		if (person2Age <= 2) 
 		{
 			throw new NotToBeClassmatesException( "Person2 is too young! You are not allowed to do this operation.", person1Age, person2Age);
 		}
 	}
 }
