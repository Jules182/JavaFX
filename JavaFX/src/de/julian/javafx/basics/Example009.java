package de.julian.javafx.basics;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Example009 extends Application {

	private RadioButton rb1, rb2, rb3;
	private Label label_display;
	private ToggleGroup tg_radiobutton_group;

	@Override
	public void init() {
		// init togglegroup
		tg_radiobutton_group = new ToggleGroup();
		label_display = new Label("Radio Button 1 selected");
		rb1 = new RadioButton();
		rb2 = new RadioButton();
		rb3 = new RadioButton();
		// add the radio buttons to the toggle group
		rb1.setToggleGroup(tg_radiobutton_group);
		rb2.setToggleGroup(tg_radiobutton_group);
		rb3.setToggleGroup(tg_radiobutton_group);
		// by default select rb1
		rb1.setSelected(true);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Example 009 - Radio Buttons");
		VBox vb = new VBox();
		primaryStage.setScene(new Scene(vb, 400, 300));
		primaryStage.show();

		vb.getChildren().addAll(label_display, rb1, rb2, rb3);
		
//without Java 8 Lambda
		rb1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				label_display.setText("Radio Button 1 selected");
			}
		});
		// with Lambda
		rb2.setOnAction((event) -> {
			label_display.setText("Radio Button 2 selected");
		});

		rb3.setOnAction((event) -> {
			label_display.setText("Radio Button 3 selected");
		});

	}

	public void stop() {
	};

	public static void main(String[] args) {
		launch(args);
	}

}