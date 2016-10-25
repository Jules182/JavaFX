package de.julian.javafx.basics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class Example013 extends Application {
	// private fields of this class
	private Label lbl_display;
	private VBox vb_mainlayout;
	private Slider sli_slider;

	@Override
	public void init() throws Exception {
		lbl_display = new Label("slider value set to: 5.0");
		sli_slider = new Slider(0, 10, 5);
		vb_mainlayout = new VBox();
		vb_mainlayout.getChildren().addAll(lbl_display, sli_slider);

		sli_slider.setShowTickMarks(true);
		sli_slider.setShowTickLabels(true);
		sli_slider.setMajorTickUnit(1);
		sli_slider.setBlockIncrement(0.5);

		sli_slider.valueProperty().addListener((observable, oldValue, newValue) -> {
			lbl_display.setText("slider value set to: " + newValue);
		});
	};

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Example 13 - Slider");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}