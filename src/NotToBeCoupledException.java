public class NotToBeCoupledException extends Exception 
{
	
	public NotToBeCoupledException(String errMsg, int person1age, int person2age) 
	{
		super(errMsg); 

		System.out.println("You are trying to make a couple when at least one member is not an\n" + 
				"adult.");		
		System.out.println("Error message is: " + errMsg);
	} 

//The withdraw() method in class Account can be re-defined accordingly:

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
