/**
 * Class used to check and catch NoParentException
 * 
 * @author Jyh-woei Yang, Yujue Zou
 * @version 21/05/2018
 */

public class NoParentException extends Exception
{
	/**
	 * This is a Constructor
	 * 
	 * @param errMsg
	 * @param adult1
	 * @param adult2
	 */
	public NoParentException(String errMsg, Adults adult1, Adults adult2) 
	{
		super(errMsg); 

		System.out.println("When a child or young child has no parent or has only one parent, e.g.\n" + 
				"adding a child to one adult, or to two adults who are not a couple.");		
		System.out.println("Error message is: " + errMsg);
	} 

	/**
     * A method to check if the child are available to add their parents
     * 
     * @param Adults1, Adults2
     * @return
     * @throws NoParentException
     */
	public void validNoParent(Adults adult1, Adults adult2) throws NoParentException 
	{ 
		if (adult1 == null) 
		{
			throw new NoParentException( "No parent happened, you are not allowed to do this operation", adult1, adult2);
		}
		
		if (adult2 == null) 
		{
			throw new NoParentException( "No parent happened, you are not allowed to do this operation", adult1, adult2);
		}
	}
}
