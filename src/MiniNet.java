import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MiniNet extends Application {
    public MiniNet()
    {
        //Optional constructor
    }
    
    @Override
    public void init()
    {
         //By default this does nothing, but it
         //can carry out code to set up your app.
         //It runs once before the start method,
         //and after the constructor.
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
        button5.setText("5) Find out whether two people");
        button6.setText("6) Define relation between two people");
        button7.setText("7) Find out the name(s)");
        button8.setText("8) Exit");

        // Registering a handler for button
        button.setOnAction((ActionEvent event) -> {
            // Printing "1) Add a person into the network" to the console
            System.out.println("1) Add a person into the network");
        });
        // Registering a handler for button
        button2.setOnAction((ActionEvent event) -> {
            // Printing "2) Select a person" to the console
            System.out.println("2) Select a person");
        });
        // Registering a handler for button
        button3.setOnAction((ActionEvent event) -> {
            // Printing "3) Display the profile") to the console
            System.out.println("3) Display the profile");
        });
        // Registering a handler for button
        button4.setOnAction((ActionEvent event) -> {
            // Printing "4) Delete the selected person" to the console
            System.out.println("4) Delete the selected person");
        });
        // Registering a handler for button
        button5.setOnAction((ActionEvent event) -> {
            // Printing "5) Find out whether two people" to the console
            System.out.println("5) Find out whether two people");
        });
        // Registering a handler for button
        button6.setOnAction((ActionEvent event) -> {
            // Printing "6) Define relation between two people" to the console
            System.out.println("6) Define relation between two people");
        });
        // Registering a handler for button
        button7.setOnAction((ActionEvent event) -> {
            // Printing "7) Find out the name(s)" to the console
            System.out.println("7) Find out the name(s)");
        });
        // Registering a handler for button
        button8.setOnAction((ActionEvent event) -> {
            // Printing "8) Exit" to the console
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
        final Scene scene = new Scene(root, 400, 350);
        // Adding the title to the window (primaryStage)
        primaryStage.setTitle("MiniNet");
        primaryStage.setScene(scene);
        // Show the window(primaryStage)
        primaryStage.show();
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
}