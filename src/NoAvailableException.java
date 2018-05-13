public class NoAvailableException extends Exception 
{
	
	public NoAvailableException(String errMsg, Adults adult1, Adults adult2) 
	{
		super(errMsg); 

		System.out.println("You are trying to make two adults a couple and at least one of them is\n" + 
				"already connected with another adult as a couple.");		
		System.out.println("Error message is: " + errMsg);
	} 

//The withdraw() method in class Account can be re-defined accordingly:

	public void validNoAvailable(Adults adult1, Adults adult2) throws NoAvailableException 
	{ 
		//adult2's relationship is couple
		if (adult2.getRelationshipList().contains("couple")) 
		{
			throw new NoAvailableException( adult2.getName()+" is taken, you are not allowed to do this operation", adult1, adult2);
		}
		
		//adult1's relationship is couple
		if (adult1.getRelationshipList().contains("couple")) 
		{
			throw new NoAvailableException( adult1.getName()+" is taken, you are not allowed to do this operation", adult1, adult2);
		}
	}
}
