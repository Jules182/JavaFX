
// simple example that showcases the checkbox
// imports necessary to make this project work
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

// class definition
public class Example008 extends Application {
	// the overridden init method
	public void init() {
		// create the text and the checkbox
		label_display = new Label("CheckBox is unchecked");
		cb_checkbox = new CheckBox("This is a checkbox");
	}

	// overridden start method
	public void start(Stage primaryStage) {
		// create a scene of a vbox layout, set the window size and title too

		primaryStage.setTitle("checkbox example");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		primaryStage.show();
		// add the text and the checkbox to the layout
		vb.getChildren().addAll(label_display, cb_checkbox);
		cb_checkbox.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if (cb_checkbox.isSelected()) {
					label_display.setText("CheckBox is checked");
				} else {
					label_display.setText("CheckBox is unchecked");
				}
			}
		});
	}

	// overridden stop method
	public void stop() {
	}

	// entry point to our program
	public static void main(String[] args) {
		// launches our application
		launch(args);
	}

	// private fields for the text and the checkbox
	private Label label_display;
	private CheckBox cb_checkbox;
}