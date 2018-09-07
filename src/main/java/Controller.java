package main.java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller
{


    @FXML
    private MenuItem exit_button;

    @FXML
    private AnchorPane root;

    @FXML
    private ImageView button_hydrogen;

    @FXML
    private TextField text_field_melting_point;

    @FXML
    private TextField text_field_element_name;

    @FXML
    private TextField text_field_atomic_number;

    @FXML
    private TextField text_field_boiling_point;

    @FXML
    private ScrollPane element_information_panel;

    //TODO Add description and image boxes to the element information panel

    @FXML
    void exitProgram(ActionEvent event)
    {
        System.exit(0);
    }

    @FXML
    void hydrogen_action(MouseEvent event)
    {
        createInformationScreen();

        text_field_atomic_number.setText("Ex. hydrogen.getAtomicNumber()");
        //TODO Use the get functions from the not yet created Element class to set all of the fields

    }

    //TODO Create actions for all of the element buttons

    void createInformationScreen()
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ElementInformationPanel.fxml"));
            fxmlLoader.setController(this); //Prevents multiple controllers from being made to avoid nullpointerexceptions.
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Information");
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println (e.toString());
        }
    }


}
