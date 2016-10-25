package de.julian.javafx.basics;

// simple example that shows how to use the datepicker and handle
// events from it
// imports
import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class Example019 extends Application {
	// overridden init method
	public void init() {
		// initialise the layout and our widgets
		vb_mainlayout = new VBox();
		dp_date = new DatePicker(LocalDate.now());
		lbl_display = new Label("no date selected");
		vb_mainlayout.getChildren().addAll(lbl_display, dp_date);
		// set a listener on the date picker so we can react to changes
		dp_date.setOnAction(new EventHandler<ActionEvent>() {
			// overridden handle method
			public void handle(ActionEvent event) {
				// set the new date in the label
				lbl_display.setText("new date chosen is: " + dp_date.getValue());
			}
		});
	}

	// overridden start method
	public void start(Stage primaryStage) {
		// put a title, scene, and size on our window
		primaryStage.setTitle("Date Picker example");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
	}

	// overridden stop method
	public void stop() {
	}

	// entry point into our program that will launch our javafx application
	public static void main(String[] args) {
		launch(args);
	}

	// private fields of the class
	private VBox vb_mainlayout;
	private DatePicker dp_date;
	private Label lbl_display;
}