import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Example011 extends Application {
	private VBox vb_mainlayout;
	private TextArea ta_textarea, ta_response;

	@Override
	public void init() throws Exception {
		// init widgets
		vb_mainlayout = new VBox();
		ta_textarea = new TextArea();
		ta_response = new TextArea();
		// attach to vb
		vb_mainlayout.getChildren().addAll(ta_textarea, ta_response);
		ta_response.setEditable(false);

		ta_textarea.textProperty().addListener((observable, oldValue, newValue) -> {
			ta_response.setText(newValue);
		});
	}

	@Override
	public void stop() throws Exception {
		super.stop();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Example 11 - Text Area");
		primaryStage.setScene(new Scene(vb_mainlayout, 500, 500));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
