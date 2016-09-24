
// simple example that introduces the border pane with the use of buttons
// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// class definition
public class Example002 extends Application {
	// the init method
	public void init() {
		// initialise all of our buttons
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
		// set the maximum width and height of all buttons
		btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
	}

	// the start method
	public void start(Stage primaryStage) {
		// set the tile on the stage, create a border pane and put it as the root
		// of the scene
		primaryStage.setTitle("Border Pane Example");
		BorderPane bp = new BorderPane();
		primaryStage.setScene(new Scene(bp, 400, 300));
		
		// add in the buttons to the border pane
		bp.setCenter(btn1);
		bp.setTop(btn2);
		bp.setBottom(btn3);
		bp.setLeft(btn4);
		bp.setRight(btn5);
		// show the stage
		primaryStage.show();
	}

	// the stop method
	public void stop() {
	}

	// the main method
	public static void main(String[] args) {
		launch(args);
	}

	// private fields of the class
	Button btn1, btn2, btn3, btn4, btn5;
	// a few buttons that we are going to use for the border pane
}