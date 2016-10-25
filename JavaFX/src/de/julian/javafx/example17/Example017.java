package de.julian.javafx.example17;

// example that shows how to add in custom cells to the list view widget
// imports
import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

// class definition
public class Example017 extends Application {
	// overridden init method
	@Override
	public void init() {
		// generate a few task items for the arraylist
		al_taskitems = new ArrayList<TaskItem>();
		al_taskitems.add(new TaskItem(false, "task 1"));
		al_taskitems.add(new TaskItem(true, "task 2"));
		al_taskitems.add(new TaskItem(false, "task 3"));
		al_taskitems.add(new TaskItem(true, "task 4"));
		// initialise all of our widgets
		vb_mainlayout = new VBox();
		ol_items = FXCollections.observableArrayList(al_taskitems);
		lv_items = new ListView<TaskItem>(ol_items);
		lbl_display = new Label("no item selected");
		tf_adding = new TextField();
		vb_mainlayout.getChildren().addAll(lbl_display, lv_items, tf_adding);
		// set a cell factory on our list view
		lv_items.setCellFactory(new Callback<ListView<TaskItem>, ListCell<TaskItem>>() {
			// method we must override to create new cell items
			@Override
			public ListCell<TaskItem> call(ListView<TaskItem> list) {
				TaskItemCellRenderer r = new TaskItemCellRenderer(Example017.this);
				r.setEditable(true);
				return r;
			}
		});
		// add in an event handler to the listview that will listen for events
		lv_items.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TaskItem>() {
			// overridden changed method that will listen for changes in the selected
			// item. will update the display to reflect this change
			@Override
			public void changed(final ObservableValue<? extends TaskItem> observable, final TaskItem old_value,
					final TaskItem new_value) {
				lbl_display.setText("Item selected: " + new_value.name);
			}
		});// add in an event handler for the edit text
		tf_adding.setOnAction(new EventHandler<ActionEvent>() {
			// overridden handle method
			@Override
			public void handle(ActionEvent event) {
				// update the list with a new item
				TaskItem temp = new TaskItem(false, tf_adding.getText());
				ol_items.add(temp);
			}
		});
	}
	// public method that will notify us if a task item has changed
	public void taskItemChanged(TaskItem item) {
	lbl_display.setText("state changed on item: " + item.name);
	}
	// overridden start method
	public void start(Stage primaryStage) {
		// generate a scene and set a title and size on the window
		primaryStage.setTitle("Custom ListView item example");
		primaryStage.setScene(new Scene(vb_mainlayout, 400, 300));
		primaryStage.show();
	}

	// overridden stop method
	public void stop() {
	}

	// entry point into our program that will launch our javafx application
	public static void main(String[] args) {
		launch(args);
	}

	// private fields of the class
	private VBox vb_mainlayout;
	private ArrayList<TaskItem> al_taskitems;
	private ObservableList<TaskItem> ol_items;
	private ListView<TaskItem> lv_items;
	private Label lbl_display;
	private TextField tf_adding;
}