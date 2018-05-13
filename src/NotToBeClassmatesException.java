//NotToBeClassmatesException

public class NotToBeClassmatesException extends Exception 
 {
 	
 	public NotToBeClassmatesException(String errMsg, int person1Age, int person2Age) 
 	{
 		super(errMsg); 

 		System.out.println("You are trying to connect a YoungChild in a classmate relation.");		
 		System.out.println("Error message is: " + errMsg);
 	} 

 //The withdraw() method in class Account can be re-defined accordingly:

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
