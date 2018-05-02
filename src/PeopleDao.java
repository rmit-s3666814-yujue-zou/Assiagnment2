/**
 * Write a description of class PeopleDao here.
 *
 * @author Jyh-woei Yang
 * @version 03/05/2018
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hsqldb.Server;

 public class PeopleDao 
 {
 	// instance variables - replace the example below with your own

 	/**
 	 * Constructor for objects of class Driver
 	 */

 	public PeopleDao()
 	{
 		// initialise instance variables
 	}

 	public void readfile() 
 	{
 		Server hsqlServer = null;
 		Connection connection = null;
 		ResultSet rs = null;

 		hsqlServer = new Server();
 		hsqlServer.setLogWriter(null);
 		hsqlServer.setSilent(true);
 		hsqlServer.setDatabaseName(0, "MiniNetDB");
 		hsqlServer.setDatabasePath(0, "file:MYDB");

 		hsqlServer.start();

 		//making a connection
 		try{
 			Class.forName("org.hsqldb.jdbcDriver");
 			connection = DriverManager.getConnection("jdbc:hsqldb:MiniNetDB","sa","123");

 			connection.prepareStatement("drop table people if exists;").execute();
 			connection.prepareStatement("create table people (name varchar(20) not null,age varchar(20) not null,gender varchar(20) not null,status varchar(20));").execute();
 			
 			connection.prepareStatement(addPeople("Andy","30","M","Working at KFC")).execute();
 			connection.prepareStatement(addPeople("Alex Smith","21","M","Student at RMIT")).execute();
 			connection.prepareStatement(addPeople("Ben Turner","35","M","Manager at Coles")).execute();
 			connection.prepareStatement(addPeople("Hannah White","14","F","Student at PLC")).execute();
 			connection.prepareStatement(addPeople("Zoe Foster","28","F","Founder of ZFX")).execute();
 			connection.prepareStatement(addPeople("Mark Turner","2","M","")).execute();
 			//query from the db
 			rs = connection.prepareStatement("select name,age,gender,status from people;").executeQuery();
 			rs.next();
 			System.out.println(String.format("Name: %1s, Age: %1s, Gender: %1s, Status: %1s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
 			rs.next();
 			System.out.println(String.format("Name: %1s, Age: %1s, Gender: %1s, Status: %1s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
 			rs.next();
 			System.out.println(String.format("Name: %1s, Age: %1s, Gender: %1s, Status: %1s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
 			rs.next();
 			System.out.println(String.format("Name: %1s, Age: %1s, Gender: %1s, Status: %1s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
 			rs.next();
 			System.out.println(String.format("Name: %1s, Age: %1s, Gender: %1s, Status: %1s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
 			rs.next();
 			System.out.println(String.format("Name: %1s, Age: %1s, Gender: %1s, Status: %1s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
 			connection.commit();
 		}catch (SQLException e2){
 			e2.printStackTrace();
 		}catch (ClassNotFoundException e2){
 			e2.printStackTrace();
 		}

 		}
 	

 	public String addPeople(String insertName, String insertAge, String insertGender, String insertStatus){

 		return "insert into people(name,age,gender,status)"+"values ('"+insertName+"','"+insertAge+"','"+insertGender+"','"+insertStatus+"')";
 	}

 } 