import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Example001 extends Application {
	// initialization before running the Application
	public void init() {
	};

	// start method = entry point
	public void start(Stage primaryStage) {
		// set Name of stage/wndw
		primaryStage.setTitle("Hello World");
		// set the stage using a scene and put a basic layout on the scene
		StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root, 400, 300));
		// add text
		root.getChildren().add(new Label("Hi there, I'm Julian from Germany"));
		// show stage
		primaryStage.show();
	}

	// clean up work
	public void stop() {
	};

	// main to start application
	public static void main(String[] args) {
		launch(args);
	}

}