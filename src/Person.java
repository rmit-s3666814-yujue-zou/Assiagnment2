
/**
 * Write a description of interface Person here.
 *
 * @author Jyh-woei Yang
 * @version 20/04/2018
 */
public interface Person
{
    public String name = "";
    public int age = 0;
    public char gender = 'M';
    public String status = "";
    
    public String getName();
    public String getAge();
    public char getGender();
    public void setName(String name);
    public void setAge(int age);
    public void setGender(char gender);
    public void setStatus(String status);
}
