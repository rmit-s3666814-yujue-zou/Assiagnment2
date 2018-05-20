/**
 * Class used to check and catch NoAvailableException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */

public class NoAvailableException extends Exception
{
	/**
	 * This is a Constructor.
	 * 
	 * @param errMsg
	 * @param adult1
	 * @param adult2
	 */
	public NoAvailableException(String errMsg, Adults adult1, Adults adult2) 
	{
		super(errMsg); 

		System.out.println("You are trying to make two adults a couple and at least one of them is\n" + 
				"already connected with another adult as a couple.");		
		System.out.println("Error message is: " + errMsg);
	} 

	/**
     * A method to check if the two adults are available to be coupled
     * 
     * @param Adults1, Adults2
     * @return
     * @throws NoAvailableException
     */
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
