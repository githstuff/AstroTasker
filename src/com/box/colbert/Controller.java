package com.box.colbert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private MenuItem Close, NewClass, Edit, Delete, Reset_Streak;
   // @FXML
   // private TableView TaskTableView;
    @FXML
    private TableColumn Tasks, Recurring_Tasks;
    @FXML
    private TextField Task_Name;
    @FXML
    private ToggleGroup Challenge_Level,DaysOfWeek;
    @FXML
    private CheckBox Recurring;
    @FXML
    private Button BtnSave,BtnDelete;
    @FXML
    private void HandleClose(ActionEvent actionEvent){
        System.exit(0);
    }
}
