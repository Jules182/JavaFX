package de.julian.javafx.example17;
// simple class that is publically accessible to demonstrate the
// custom cell renderer
// class definition
class TaskItem {
// constructor for the class
public TaskItem(boolean complete, String name) {
this.complete = complete;
this.name = name;
}
// create a few public fields for simplicity.
public boolean complete;
public String name;
}