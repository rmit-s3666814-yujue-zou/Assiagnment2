/**
 * Write a description of class RelationshipDao here.
 *
 * @author Jyh-woei Yang, Yujue Zou
 * @version 16/05/2018
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hsqldb.Server;

import java.util.*;
import java.io.*;

public class RelationshipDao {

    private ArrayList<Relationship> relationshipList;

    public RelationshipDao() {

    		relationshipList = new ArrayList<Relationship>();
    }


    public void loadRelationshipFile() {
        String fileName = "Relationship.txt";
        try {
            FileReader inputFile = new FileReader(fileName);
            Scanner console = new Scanner(inputFile);
            while (console.hasNextLine()) {
                String userString = console.nextLine();
                String[] details = userString.split(",");
                Person person1 = new Person();
                Person person2 = new Person();
                person1.setName(details[0]);
                person2.setName(details[1]);
                Relationship relationshipFromFile = new Relationship(person1, person2, details[2]);
                relationshipList.add(relationshipFromFile);
            }
            inputFile.close();
        } catch (FileNotFoundException exception) {
            System.err.println(fileName + "Not found");
        } catch (IOException e) {
            System.err.println("Error, invalid file");
        }
    }

    /**
     * A method to pass result list to view
     * 
     * @param  
     * @return a list of relationship
     */
    public ArrayList<Relationship> getResultList()
    {
    		return relationshipList;
    }
    

    /**
     * A method to write relationship back to file
     * 
     * @param  
     * @return
     * @throws IOException while exception during I/O actions       
     */      
     
     private void writeFile()
     {
    	 	String filename = ("Relationship.txt");
    	 	String[] relationship = new String[3];
    	 	Scanner input = new Scanner(System.in);
    	 	String line = "";
    	 	Driver newDriver = new Driver();
        ArrayList<Relationship> toWriteRelationshipList = newDriver.getRelationshipDriverList();

        //try catch to handle IOException
        try
        {
            PrintWriter outputFile = new PrintWriter (filename);

            for (int i = 0 ; i < toWriteRelationshipList.size() ; i++ )
            {

            		relationship[0] = toWriteRelationshipList.get(i).getPerson1().getName();
                	relationship[1] = toWriteRelationshipList.get(i).getPerson2().getName();
                	relationship[2] = toWriteRelationshipList.get(i).getRelationship();

                 //combine elements into a line
                 for (int k = 0 ; k < 3 ; k++ )
                 {   
                     //line = tickets[0] + "," + tickets[1] + "," + tickets[2];
                     if (k != 2)
                         line = line + relationship[k] + ",";
                     else
                         line = line + relationship[k];
                 }
                 //display a message about write line
                 int lineCount = i + 1;
                 //System.out.println("");
                 //System.out.println("Write a message in line "+ lineCount +" to a file");
                 //System.out.println("");

                 outputFile.println(line);
                 //reset line
                 line = "";
            }
                outputFile.close();    
            }
            catch(IOException exception)
            {
                System.out.println("Unexpected I/O error occured");
            }
        }
    }
