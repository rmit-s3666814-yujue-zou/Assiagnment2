public class NoParentException extends Exception 
{
	
	public NoParentException(String errMsg, Adults adult1, Adults adult2) 
	{
		super(errMsg); 

		System.out.println("When a child or young child has no parent or has only one parent, e.g.\n" + 
				"adding a child to one adult, or to two adults who are not a couple.");		
		System.out.println("Error message is: " + errMsg);
	} 

//The withdraw() method in class Account can be re-defined accordingly:

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
