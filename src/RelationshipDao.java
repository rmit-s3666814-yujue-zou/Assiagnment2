import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hsqldb.Server;

import java.util.*;
import java.io.*;

public class RelationshipDao {

    private ArrayList<Relationship> relationshiplist;

    public RelationshipDao() {

        relationshiplist = new ArrayList<Relationship>();
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
                Relationship re = new Relationship(person1, person2, details[2]);
                relationshiplist.add(re);
            }
            inputFile.close();
        } catch (FileNotFoundException exception) {
            System.err.println(fileName + "Not found");
        } catch (IOException e) {
            System.err.println("Error, invalid file");
        }
    }

//    private void writeFile(){
//        String fileName = "Relationship.txt";
//
//    }
}
