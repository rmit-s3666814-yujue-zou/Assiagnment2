/**
 * Class used to check and catch NotToBeCoupledException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */
public class NotToBeCoupledException extends Exception
{
	/**
	 * This is a Contructor
	 * 
	 * @param errMsg
	 * @param person1age
	 * @param person2age
	 */
	public NotToBeCoupledException(String errMsg, int person1age, int person2age) 
	{
		super(errMsg); 

//		System.out.println("You are trying to make a couple when at least one member is not an\n" + 
//				"adult.");		
//		System.out.println("Error message is: " + errMsg);
	} 


	/**
     * A method to check if the two adults are available to be coupled
     * 
     * @param int person1age, int person2age
     * @return
     * @throws NotToBeCoupledException
     */
	public void validNotToBeCoupled(int person1age, int person2age) throws NotToBeCoupledException 
	{ 
		//person1 is not an adult
		if (person1age <= 16) 
		{
			throw new NotToBeCoupledException( "person1 is not an adult, you are not allowed to do this operation", person1age, person2age);
		}
		
		//person2 is not an adult
		if (person2age <= 16) 
		{
			throw new NotToBeCoupledException( "person2 is not an adult, you are not allowed to do this operation", person1age, person2age);
		}
	}
}
