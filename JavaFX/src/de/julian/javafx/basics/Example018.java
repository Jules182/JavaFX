package de.julian.javafx.basics;

// simple example that showcases how the tab and tab pane work
// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class Example018 extends Application {
	// overridden init method
	public void init() {
		// initialise our layout and add the tab pane to it
		vb_mainlayout = new VBox();
		tp_tabs = new TabPane();
		vb_mainlayout.getChildren().add(tp_tabs);
		// generate a layout for the first tab and add it to the tab pane
		vb_one = new VBox();
		ta_one = new TextArea();
		vb_one.getChildren().add(ta_one);
		tab_one = new Tab("First Area");
		tab_one.setContent(vb_one);
		tp_tabs.getTabs().add(tab_one);
		// generate a layout for the second tab and add it to the tab pane
		vb_two = new VBox();
		ta_two = new TextArea();
		vb_two.getChildren().add(ta_two);
		tab_two = new Tab("Second Area");
		tab_two.setContent(vb_two);
		tp_tabs.getTabs().add(tab_two);
		// generate a layout for the third tab and add it to the tab pane
		vb_three = new VBox();
		ta_three = new TextArea();
		vb_three.getChildren().add(ta_three);
		tab_three = new Tab("Third Area");
		tab_three.setContent(vb_three);
		tp_tabs.getTabs().add(tab_three);
	}

	// overridden start method
	public void start(Stage primaryStage) {
		// set a scene, title, and size on our window
		primaryStage.setTitle("Tabs example");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
	}

	// overridden stop method
	public void stop() {
	}

	// entry point into our program that will launch our JavaFX application
	public static void main(String[] args) {
		launch(args);
	}

	// private fields of the class
	private VBox vb_mainlayout;
	private TabPane tp_tabs;
	private Tab tab_one, tab_two, tab_three;
	private VBox vb_one, vb_two, vb_three;
	private TextArea ta_one, ta_two, ta_three;
}