package main.java;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_ListView implements Initializable
{

    @FXML
    private TableView<String> TableView_table;


    @FXML
    private TableColumn<String, String> TableView_nameColumn;

    @FXML
    private TableColumn<String, String> TableView_atomicNumberColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        TableView_nameColumn.setText("Element Name");
        TableView_nameColumn.setCellValueFactory(new PropertyValueFactory<String, String>("Test"));


    }
}
