/**
 * Write a description of class Driver here.
 *
 * @author Jyh-woei Yang
 * @version 29/04/2018
 */
package com.rmit.ad.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hsqldb.Server;

 public class Driver 
 {
 	// instance variables - replace the example below with your own

 	/**
 	 * Constructor for objects of class Driver
 	 */

 	public Driver()
 	{
 		// initialise instance variables
 	}

 	public static void main(String[] args) 
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

 			//query from the db
 			rs = connection.prepareStatement("select name,age,gender,status from people;").executeQuery();
 			rs.next();
 			System.out.println(String.format("Name: %1s, Age: %1s, Gender: %1s, Status: %1s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
 			connection.commit();
 		}catch (SQLException e2){
 			e2.printStackTrace();
 		}catch (ClassNotFoundException e2){
 			e2.printStackTrace();
 		}

 		}
 	

 	public static String addPeople(String insertName, String insertAge, String insertGender, String insertStatus){

 		return "insert into people(name,age,gender,status)"+"values ('"+insertName+"','"+insertAge+"','"+insertGender+"','"+insertStatus+"')";
 	}

 } 