import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MiniNet extends Application {
	PeopleDao peopleDao = new PeopleDao();
	private ArrayList<Person> personViewList;
    RelationshipDao relationshipDao = new RelationshipDao();
    private ArrayList<Relationship> relationshipViewList;
	
	public MiniNet()
    {
        //Optional constructor
    		peopleDao = new PeopleDao();
    		relationshipDao = new RelationshipDao();
    }
    
    @Override
    public void init()
    {
         //By default this does nothing, but it
         //can carry out code to set up your app.
         //It runs once before the start method,
         //and after the constructor.
        //Loading data from database
    		peopleDao.readfile();
    		//Loading data from text file
    		//peopleDao.loadPeopleFile();
    		personViewList = peopleDao.getResultList();
    		relationshipDao.loadRelationshipFile();
    		relationshipViewList = relationshipDao.getResultList();
    }
    
    @Override
    public void start(Stage primaryStage) {
    		// Creating the Java button
        final Button button = new Button();
        final Button button2 = new Button();
        final Button button3 = new Button();
        final Button button4 = new Button();
        final Button button5 = new Button();
        final Button button6 = new Button();
        final Button button7 = new Button();
        final Button button8 = new Button();
        
        // Setting text to button
        button.setText("1) Add a person into the network");
        button2.setText("2) Select a person");
        button3.setText("3) Display the profile");
        button4.setText("4) Delete the selected person");
        button5.setText("5) Find out whether two people are directly connect in some ways");
        button6.setText("6) Define relation between two people");
        button7.setText("7) Find out the name(s) of the children or parents");
        button8.setText("8) Exit");

        // Registering a handler for button
        button.setOnAction((ActionEvent event) -> {
            // Printing "1) Add a person into the network" to the console
            System.out.println("1) Add a person into the network");
            Stage secondaryStage1 = new Stage();
            start2(secondaryStage1);
            //Open a new windows using GUI, with textboxs, input the attributes and button add => validation
            //add a person to this network
        });
        // Registering a handler for button
        button2.setOnAction((ActionEvent event) -> {
            // Printing "2) Select a person" to the console
            System.out.println("2) Select a person");
            //Open a new windows using GUI, list out buttons and names
            //Clink on the button and return the index
        });
        // Registering a handler for button
        button3.setOnAction((ActionEvent event) -> {
            // Printing "3) Display the profile") to the console
            System.out.println("3) Display the profile");
            //If the selectPerson = null,
            //	show error message "Person are not select", return to the menu
            //else show specific person's profile
            //for(int i = 0; i < personList.size(); i++)	
            		System.out.println(personViewList.get(0).getName());
            		System.out.println(personViewList.get(0).getAge());
            		System.out.println(personViewList.get(0).getGender());
            		System.out.println(personViewList.get(0).getStatus());
            		System.out.println(personViewList.get(1).getName());
            		System.out.println(personViewList.get(1).getAge());
            		System.out.println(personViewList.get(1).getGender());
            		System.out.println(personViewList.get(1).getStatus());
            		System.out.println(personViewList.get(2).getName());
            		System.out.println(personViewList.get(2).getAge());
            		System.out.println(personViewList.get(2).getGender());
            		System.out.println(personViewList.get(2).getStatus());
            		System.out.println(personViewList.get(3).getName());
            		System.out.println(personViewList.get(3).getAge());
            		System.out.println(personViewList.get(3).getGender());
            		System.out.println(personViewList.get(3).getStatus());
        });
        // Registering a handler for button
        button4.setOnAction((ActionEvent event) -> {
            // Printing "4) Delete the selected person" to the console
            System.out.println("4) Delete the selected person");
            //Delete everything about this person from the network including profile, relationships
        });
        // Registering a handler for button
        button5.setOnAction((ActionEvent event) -> {
            // Printing "5) Find out whether two people are directly connect in some ways" to the console
            System.out.println("5) Find out whether two people are directly connect in some ways");
            //new windows
            //textbox for inputbox1 person1 name
            //textbox for inputbox2 person2 name
            //find out if there is a data have person1's name = inputbox1
            //								  person2's name = inputbox2
            //print out "Yes, they are " + "relationship."
            //or 	    "No. they do not know each other."
        });
        // Registering a handler for button
        button6.setOnAction((ActionEvent event) -> {
            // Printing "6) Define relation between two people" to the console
            System.out.println("6) Define relation between two people");
            //new windows
            // textbox1 person1's name
            // textbox2 person2's name
            // check their relationship has been defined or not?
            // if yes, they are ""
            // if no
            // add them into the data storage
            // add two people as a friends,parents,classmate,colleagues,couple
            // parents, person2 is person1's Mparents
            // parents, person2 is person1's Fparents
    			System.out.println(relationshipViewList.get(0).getPerson1().getName());
    			System.out.println(relationshipViewList.get(0).getPerson2().getName());
    			System.out.println(relationshipViewList.get(0).getRelationship());
        });
        // Registering a handler for button
        button7.setOnAction((ActionEvent event) -> {
            // Printing "7) Find out the name(s) of the children or parents to the console
            System.out.println("7) Find out the name(s) of the children or parents");
            //System.out.println(His/her Childrens' name are: )
            //System,out.println(His/her Parents' names are: +" MparentName "+ and + " +FparentName"")
        });
        // Registering a handler for button
        button8.setOnAction((ActionEvent event) -> {
            // Printing "8) Exit" to the console
        		// close all th windows.
            System.out.println("8) Exit");
            stop();
        });
        // Initializing the StackPane class
        // final StackPane root = new StackPane();

        // Initializing the VBox class
        final VBox root = new VBox();
        // Adding all the nodes to the StackPane
        
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
          
        root.getChildren().addAll(button, button2, button3, button4, button5, button6, button7, button8);
        
        // Creating a scene object
        final Scene scene = new Scene(root, 800, 600);
        // Adding the title to the window (primaryStage)
        primaryStage.setTitle("MiniNet");
        primaryStage.setScene(scene);
        // Show the window(primaryStage)
        primaryStage.show();
    }

    public void start2(Stage secondaryStage1) {
    	
	    	Label label1 = new Label("Name:");
	    	TextField textField = new TextField ();
	    	HBox hb = new HBox();
	    	hb.getChildren().addAll(label1, textField);
	    	hb.setSpacing(10);
    	
	    	//Creating a GridPane container
	    	GridPane grid = new GridPane();
	    	grid.setPadding(new Insets(10, 10, 10, 10));
	    	grid.setVgap(5);
	    	grid.setHgap(5);
	    	
	    	//Defining the Name text field
	    	final TextField name = new TextField();
	    	name.setPromptText("Enter your first name.");
	    	name.setPrefColumnCount(10);
	    	name.getText();
	    	GridPane.setConstraints(name, 0, 0);
	    	grid.getChildren().add(name);
	    	
	    	//Defining the Last Name text field
	    	final TextField lastName = new TextField();
	    	lastName.setPromptText("Enter your last name.");
	    	GridPane.setConstraints(lastName, 0, 1);
	    	grid.getChildren().add(lastName);
	    	
	    	//Defining the Comment text field
	    	final TextField comment = new TextField();
	    	comment.setPrefColumnCount(15);
	    	comment.setPromptText("Enter your comment.");
	    	GridPane.setConstraints(comment, 0, 2);
	    	grid.getChildren().add(comment);
	    	
	    	//Defining the Submit button
	    	Button submit = new Button("Submit");
	    	GridPane.setConstraints(submit, 1, 0);
	    	grid.getChildren().add(submit);
	    	
	    	//Defining the Clear button
	    	Button clear = new Button("Clear");
	    	GridPane.setConstraints(clear, 1, 1);
	    	grid.getChildren().add(clear);
	    	
    		//Adding a Label
    		final Label label = new Label();
    		GridPane.setConstraints(label, 0, 3);
    		GridPane.setColumnSpan(label, 2);
    		grid.getChildren().add(label);

    		//Setting an action for the Submit button
    		submit.setOnAction(new EventHandler<ActionEvent>() {

    		@Override
    	    public void handle(ActionEvent e) {
    	        if ((comment.getText() != null && !comment.getText().isEmpty())) {
    	            label.setText(name.getText() + " " + lastName.getText() + ", "
    	                + "thank you for your comment!");
    	        } else {
    	            label.setText("You have not left a comment.");
    	        }
    	     }
    	 });
    	 
    	//Setting an action for the Clear button
    	clear.setOnAction(new EventHandler<ActionEvent>() {

    	@Override
    	    public void handle(ActionEvent e) {
    	        name.clear();
    	        lastName.clear();
    	        comment.clear();
    	        label.setText(null);
    	    }
    	});
    		
        // Adding all the nodes to the StackPane
        //grid.getChildren().addAll();
    		grid.setAlignment(Pos.CENTER);
        
        // Creating a scene object
        final Scene scene = new Scene(grid, 400, 300);
        // Adding the title to the window (primaryStage)
        secondaryStage1.setTitle("Add Person to the network");
        secondaryStage1.setScene(scene);
        // Show the window(primaryStage)
        secondaryStage1.show();
    }
    
    @Override
    public void stop()
    {
    		System.exit(0);
        //By default this does nothing
        //It runs if the user clicks the go-away button
        //closing the window or if Platorm.exit() is called.
        //Use Platorm.exit() instead of System.exit(0).
        //is called. This is where you should offer to 
        //save unsaved stuff the user has generated.
    }
 
    /**
     * Main function that opens the "Hello World!" window
     * 
     * @param args the command line arguments
     */
    public static void main(final String[] arguments) {
        launch(arguments);
    }
    
    /**
     * A validation function to valid inputsize is Out of Bound or not
     * 
     * @param inputSize a int of inputSize
     */
    public Boolean validationPersonListSize(int inputSize)
    {
    		if (0 < inputSize && inputSize < personViewList.size())
    			return true;
    		if (inputSize > personViewList.size() || inputSize < 0)
    			return false;
			return null;
    }
    
}