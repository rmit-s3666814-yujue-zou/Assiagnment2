/**
 * Write a description of class Person here.
 *
 * @author Jyh-woei Yang
 * @version 16/05/2018
 */
public class Person
{
   // initialise instance variables
   private String name;
   private String photoPath;
   private int age;
   private char gender;
   private String status;
   private String ausStates;
   private String relationshipList;
    
   public Person()
   {
       // initialise instance variables in constructor
       this.name = "";
       this.setPhotoPath("");
       this.age = 0;
       this.gender = 'M';
       this.status = "";
       this.setAusStates("");
       this.relationshipList = "";
   }
   
    public Person(String name, String photoPath, int age, char gender, String status,String ausStates, String relationshipList)
    {
        // initialise instance variables in constructor
        this.name = name;
        this.setPhotoPath(photoPath);
        this.age = age;
        this.gender = gender;
        this.status = status;
        this.setAusStates(ausStates);
        this.relationshipList = relationshipList;
    }
    
    /**
     * A method to get name from Person
     *
     * @param
     * @return a String of name
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * A method to get age from Person
     *
     * @param
     * @return an int of age
     */
    public int getAge()
    {
        // put your code here
        return age;
    }
    
    /**
     * A method to get gender from Person
     *
     * @param
     * @return a char of gender
     */
    public char getGender()
    {
        // put your code here
        return gender;
    }
    
    /**
     * A method to get status from Person
     *
     * @param
     * @return a String of status
     */
    public String getStatus()
    {
        // put your code here
        return status;
    }

    /**
    * A method to get a String of name
    *
    * @param  
    * @return a String of relationshipList 
    */
    public String getRelationshipList() 
    {
    		return relationshipList;
    }

    
     /**
     * A method to set a String of name
     *
     * @param  name  a String for a method
     * @return 
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }

     /**
     * A method to set a int of name
     *
     * @param  age  a int for a method
     * @return 
     */

    public void setAge(int age)
    {
        // put your code here
        this.age = age;
    }

     /**
     * A method to set a char of gender
     *
     * @param  gender  a char for a method
     * @return 
     */
    public void setGender(char gender)
    {
        // put your code here
        this.gender = gender;
    }
    
     /**
     * A method to set a String of status
     *
     * @param  status  a String for a method
     * @return
     */
    public void setStatus(String status)
    {
        // put your code here
        this.status = status;
    }
    
    /**
    * A method to set a String of relationshipList
    *
    * @param  relationshipList  a String for a method
    * @return 
    */
    public void setRelationshipList(String relationshipList) 
    {
    		this.relationshipList = relationshipList;
    }


    /**
     * A method to get status from Person
     *
     * @param
     * @return a String of status
     */
	public String getPhotoPath() 
	{
		// put your code here
		return photoPath;
	}
	
    /**
     * A method to get status from Person
     *
     * @param
     * @return a String of status
     */
	public String getAusStates() 
	{
		// put your code here
		return ausStates;
	}
	
    /**
    * A method to set a String of photoPath
    *
    * @param  photoPath  a String for a method
    * @return 
    */
	
	public void setPhotoPath(String photoPath) 
	{
		// put your code here
		this.photoPath = photoPath;
	}

    /**
    * A method to set a String of relationshipList
    *
    * @param  ausStates  a String for a method
    * @return 
    */
	
	public void setAusStates(String ausStates) 
	{
		// put your code here
		this.ausStates = ausStates;
	}
	
	/**
     * A method to display String lines of Person
     *
     * @param
     * @return
     */
    public void displayPerson()
    {
        System.out.println("Name:"+name);
        System.out.println("PhotoPath:"+photoPath);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Status:"+status);
        System.out.println("Australia State:"+ausStates);
    }
	
	/**
     * A method to check if it is a valid Australia State name
     *
     * @param checkAusStates a String of checkAusStates
     * @return a Boolean of validation value
     */
	public Boolean validAusState(String checkAusStates)
	{
		if (checkAusStates.equals("NSW"))
				return true;
		if (checkAusStates.equals("QLD"))
				return true;
		if (checkAusStates.equals("VIC"))
				return true;
		if (checkAusStates.equals("ACT"))
				return true;
		if (checkAusStates.equals("TAS"))
				return true;
		if (checkAusStates.equals("NT"))
				return true;
		if (checkAusStates.equals("SA"))
				return true;
		if (checkAusStates.equals("WA"))
				return true;
														
		return false;
	}
	
}
