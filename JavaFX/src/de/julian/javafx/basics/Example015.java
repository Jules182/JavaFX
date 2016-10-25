package de.julian.javafx.basics;

// simple example that shows how the progress bar works
// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class Example015 extends Application {
	// overridden init method
	public void init() {
		vb_mainlayout = new VBox();
		pb_bar = new ProgressBar(0.5);
		sli_slider = new Slider(0, 100, 50);
		vb_mainlayout.getChildren().addAll(pb_bar, sli_slider);
		// set slider ticks
		sli_slider.setShowTickLabels(true);
		sli_slider.setShowTickMarks(true);
		sli_slider.setMajorTickUnit(10);

		// set progress bar to grow
		pb_bar.setMaxWidth(Double.MAX_VALUE);

		sli_slider.valueProperty().addListener((observable, oldValue, newValue) -> {
			pb_bar.setProgress((double) newValue / 100);
		});
	}

	// overridden start method
	public void start(Stage primaryStage) {
		// set a title, size and scene
		primaryStage.setTitle("Progress Bar example");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
	}

	// overridden stop method
	public void stop() {
	}

	// entry point into our program that will launch our javafx example
	public static void main(String[] args) {
		launch(args);
	}

	// private fields that include a progress bar and a slider
	private ProgressBar pb_bar;
	private Slider sli_slider;
	private VBox vb_mainlayout;
}