package de.julian.javafx.basics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class Example014 extends Application {
	// private fields of this class
	private VBox vb_mainlayout;
	private Label lbl_display;
	private MenuBar mb_menubar;
	private Menu menu_file, menu_help;
	private MenuItem mi_hello, mi_quit;
	private RadioMenuItem rmi_rb1, rmi_rb2;
	private CheckMenuItem cbmi_cb1, cbmi_cb2;
	private ToggleGroup tg_rmi;

	@Override
	public void init() throws Exception {
		vb_mainlayout = new VBox();
		lbl_display = new Label("No menu item selected");
		mb_menubar = new MenuBar();
		menu_file = new Menu("File");
		menu_help = new Menu("Help");
		mb_menubar.getMenus().addAll(menu_file, menu_help);
		vb_mainlayout.getChildren().addAll(mb_menubar, lbl_display);

		mi_hello = new MenuItem("Hello");
		mi_quit = new MenuItem("Quit");
		cbmi_cb1 = new CheckMenuItem("check box 1");
		cbmi_cb2 = new CheckMenuItem("check box 2");
		menu_file.getItems().addAll(mi_hello, mi_quit, cbmi_cb1, cbmi_cb2);
		// help menu
		tg_rmi = new ToggleGroup();
		rmi_rb1 = new RadioMenuItem("Radio button 1");
		rmi_rb2 = new RadioMenuItem("Radio button 2");
		rmi_rb1.setToggleGroup(tg_rmi);
		rmi_rb2.setToggleGroup(tg_rmi);
		menu_help.getItems().addAll(rmi_rb1, rmi_rb2);
		// events
		mi_hello.setOnAction((event) -> {
			lbl_display.setText("Hello! Welcome to my world!");
		});
		cbmi_cb1.setOnAction((event) -> {
			lbl_display.setText("Selected check box menu item set to: " + cbmi_cb1.isSelected());
		});
		rmi_rb1.setOnAction((event) -> {
			lbl_display.setText("Selected radio menu item 1");
		});
	};

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Example 14 - Menu");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}