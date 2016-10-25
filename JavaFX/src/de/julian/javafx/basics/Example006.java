package de.julian.javafx.basics;
// example to show a button with some basic event handling

// imports
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Example006 extends Application {
	// private fields for a button and a text and an integer to keep a count of
	// the total number of clicks
	private Label label;
	private Button btn;
	private int clicks;
	private Button btn2;

	// the init method
	public void init() {
		// initialise the button and the text
		label = new Label("The buttons have not been touched so far!");
		btn = new Button("+");
		btn2 = new Button("-");
		clicks = 0;
	}

	// the start method
	public void start(Stage primaryStage) {
		// create a primary stage with a vbox layout, title, and size
		primaryStage.setTitle("Button handling example");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		primaryStage.show();
		// add the text and the button to the vertical box layout
		vb.getChildren().addAll(label, btn, btn2);

		// add a listener to the button to react to a click by the user. this
		// should increment
		// the number by 1 and refresh the screen
		btn.setOnAction(new EventHandler<ActionEvent>() {
			// must override this method for an action event event handler
			@Override
			public void handle(ActionEvent event) {
				clicks++;
				showClicks();
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			// must override this method for an action event event handler
			@Override
			public void handle(ActionEvent event) {
				clicks--;
				showClicks();
			}
		});
	}

	void showClicks() {
		label.setText("You set the counter to " + clicks);
	}
	
	// the stop method
	public void stop() {
	}

	// the entry point of our program
	public static void main(String[] args) {
		launch(args);
	}

}
