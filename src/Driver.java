import java.util.ArrayList;

/**
 * This is a driver class named Driver. It also present the controller (business logic) layer of the application.
 *
 * @author Jyh-woei Yang
 * @version 29/04/2018
 */


 public class Driver 
 {
 	// instance variables - replace the example below with your own
	 private ArrayList<Person> personDriverList;
	 private ArrayList<Relationship> relationshipDriverList;
	 
 	/**
 	 * Constructor for objects of class Driver
 	 */

 	public Driver()
 	{
 		// initialise instance variables
 		personDriverList = new ArrayList<Person>();
 		relationshipDriverList = new ArrayList<Relationship>();
 	}

 	//data getter
 	public ArrayList<Person> getPersonDriverList()
 	{
 		return personDriverList;
 	}
 	
 	public ArrayList<Relationship> getRelationshipDriverList()
 	{
 		return relationshipDriverList;
 	}
 	
 	//data setter
 	public void setPersonDriverList(ArrayList<Person> personList)
 	{
 		personDriverList.clear();
 		for (int i = 0; i < personList.size(); i++)
 			personDriverList.add(personList.get(i));
 	}
 	
 	public void setRelationshipDriverList(ArrayList<Relationship> relationshipList)
 	{
 		relationshipDriverList.clear();
 		for (int i = 0; i < relationshipList.size(); i++)
 			relationshipDriverList.add(relationshipList.get(i));
 	}
 	
 	public void addRelationship(String Person1, String Person2, String relationship)
 	{
 		Person person1 = new Person();
 		person1.setName(Person1);
 		Person person2 = new Person();
 		person2.setName(Person2);
 		relationship = "friends";
 		Relationship insertRelationship = new Relationship(person1, person2, relationship);
 		relationshipDriverList.add(insertRelationship);
 	}
 } 