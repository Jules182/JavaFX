import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class Example012 extends Application {
	// private fields of this class
	private Label lbl_display;
	private VBox vb_mainlayout;
	private ComboBox<String> cmb_combobox;

	@Override
	public void init() throws Exception {
		lbl_display = new Label("No current Selection");
		vb_mainlayout = new VBox();
		cmb_combobox = new ComboBox<String>();
		cmb_combobox.getItems().addAll("Wurst","Käse","Eier");
		// on the combobox
		vb_mainlayout.getChildren().addAll(lbl_display, cmb_combobox);
		cmb_combobox.setOnAction((event)->{
			lbl_display.setText("Gehen Sie bitte zum LIDL und kaufen 1 Packung " + cmb_combobox.getValue());
		});
		};

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Example 12 - ComboBox");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}