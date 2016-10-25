package de.julian.javafx.basics;
// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
// class definition
public class Example004 extends Application {
// the init method
public void init() {
// initialise the 5 buttons
btn1 = new Button("Button 1");
btn2 = new Button("Button 2");
btn3 = new Button("Button 3");
btn4 = new Button("Button 4");
btn5 = new Button("Button 5");
}
// the start method
public void start(Stage primaryStage) {
	// set the title of our stage, create our layout as the root of the scene,
	// and set our stage size
	primaryStage.setTitle("VBox Layout Example");
	VBox vb = new VBox();
	primaryStage.setScene(new Scene(vb, 400, 300));
	vb.setSpacing(10);
	vb.setStyle("-fx-background-color: #888888");
	// add the 5 buttons to the hbox layout
	vb.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);
	// show the stage
	primaryStage.show();
}
// the stop method
public void stop() {}
// the main method
public static void main(String[] args) {
launch(args);
}
// 5 private buttons to demonstrate the hbox layout
private Button btn1, btn2, btn3, btn4, btn5;
}