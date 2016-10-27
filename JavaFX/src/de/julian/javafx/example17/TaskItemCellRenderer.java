package de.julian.javafx.example17;

//class that implements a custom cell renderer for the ListView.
//this class renders TaskItem objects into ListView cells
//imports
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

//a cell renderer class that will generate a custom set of view for our task items
class TaskItemCellRenderer extends ListCell<TaskItem> {
	// default constructor for this class
	public TaskItemCellRenderer(Example017 ref) {
		// call the superclass constructor
		super();
		// initialise all of our widgets and layouts
		hb_mainlayout = new HBox();
		cb_done = new CheckBox();
		lbl_task_name = new Label();
		hb_mainlayout.getChildren().addAll(cb_done, lbl_task_name);
		// add a listener to the checkbox that will change the state of the item if it
		// is clicked
		cb_done.setOnAction(new EventHandler<ActionEvent>() {
		// overridden method to handle the change in the checkbox
		@Override
		public void handle(ActionEvent event) {
		// change the state of the item and its complete property
		itemProperty().get().complete = cb_done.isSelected();
		ref.taskItemChanged(itemProperty().get());
		}
		});
	}

	// method that will update the display of a list cell whenever it needs to
	// be updated
	@Override
	public void updateItem(TaskItem item, boolean empty) {
		super.updateItem(item, empty);
		if (!empty && item != null) {
			cb_done.setSelected(item.complete);
			lbl_task_name.setText(item.name);
			setGraphic(hb_mainlayout);
		} else {
			setGraphic(null);
		}
	}

	// private fields of the class
	private HBox hb_mainlayout;
	private CheckBox cb_done;
	private Label lbl_task_name;
}