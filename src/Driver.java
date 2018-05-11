import java.util.ArrayList;

/**
 * Write a description of class Driver here.
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