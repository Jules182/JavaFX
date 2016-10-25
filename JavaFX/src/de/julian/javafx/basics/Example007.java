package de.julian.javafx.basics;

// simple javafx program showcasing the toggle button
// imports
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

// class definition
public class Example007 extends Application {
	// overridden version of the init method
	public void init() {
		// initialise the button and the text
		tbtn_button = new ToggleButton("Toggle me");
		label_display = new Label("button is in the off state");
	}

	// overridden version of the start method
	public void start(Stage primaryStage) {
		// set the primary stage to have a title size and vbox layout
		primaryStage.setTitle("Toggle Button Example");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		primaryStage.show();
		// add the text and the button to the layout
		vb.getChildren().addAll(label_display, tbtn_button);
		// add an event listener to the button to update the text
		tbtn_button.setOnAction(new EventHandler<ActionEvent>() {
		// overridden version of the handle method to catch events
		@Override
		public void handle(ActionEvent event) {
		// change the text depending on the state of the button
		if(tbtn_button.isSelected())
		label_display.setText("button is in the on state");
		else
		label_display.setText("button is in the off state");
		}
		});
	}

	// overridden version of the stop method
	public void stop() {
	}

	// entry point of our program
	public static void main(String[] args) {
		launch(args);
	}

	// private fields of a Text and a ToggleButton
	private Label label_display;
	private ToggleButton tbtn_button;
}