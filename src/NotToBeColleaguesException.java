/**
 * Class used to check and catch NotToBeColleaguesException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */
public class NotToBeColleaguesException extends Exception
 {
 	
	/**
	 * This is a Constructor
	 * 
	 * @param errMsg
	 * @param person1age
	 * @param person2age
	 */
 	public NotToBeColleaguesException(String errMsg, int person1age, int person2age) 
 	{
 		super(errMsg); 

 		System.out.println("You are trying to connect a child in a colleague relation.");		
 		System.out.println("Error message is: " + errMsg);
 	} 


	/**
     * A method to check if the two adults are available to be colleagues
     * 
     * @param int person1age, int person2age
     * @return
     * @throws NotToBeColleaguesException
     */
 	public void validNotToBeColleagues(int person1age, int person2age) throws NotToBeColleaguesException 
 	{ 
 		//person1 is not an adult
 		if (person1age <= 16) 
 		{
 			throw new NotToBeColleaguesException( "Person1 is too young! You are not allowed to do this operation.", person1age, person2age);
 		}
 		
 		//person2 is not an adult
 		if (person2age <= 16) 
 		{
 			throw new NotToBeColleaguesException( "Person2 is too young! You are not allowed to do this operation.", person1age, person2age);
 		}
 	}
 }
