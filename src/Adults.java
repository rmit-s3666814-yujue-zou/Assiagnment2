
/**
 * Write a description of class Adult here.
 *
 * @author Jyh-woei Yang
 * @version 20/04/2018
 */
public class Adults implements Person
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Adult
     */
    public Adults(String name, int age, char gender, String status)
    {
        // initialise instance variables
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }

    public Adults()
    {
        // initialise instance variables
        this.name = "";
        this.age = 0;
        this.gender = 'M';
        this.status = "";
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public int getAge()
    {
        // put your code here
        return age;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public char getGender()
    {
        // put your code here
        return gender;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String getStatus()
    {
        // put your code here
        return status;
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void setStatus(String Status)
    {
        // put your code here
        this.status = status;
    }
}
