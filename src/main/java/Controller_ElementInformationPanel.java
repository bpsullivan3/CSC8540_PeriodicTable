package main.java;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller_ElementInformationPanel implements Initializable
{

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
    @FXML
    private ImageView imageView_element_image;
    @FXML
    private TextArea text_field_element_description;
    private Image elementImage;

    public void setName(String name)
    {
        text_field_element_name.setText(name);
    }

    public void setAtomicNumber(String atomicNumber)
    {
        text_field_atomic_number.setText(atomicNumber);
    }

    public void setMeltingPoint(String meltingPoint)
    {
        text_field_melting_point.setText(meltingPoint);
    }

    public void setBoilingPoint(String boilingPoint)
    {
        text_field_boiling_point.setText(boilingPoint);
    }

    public void setDescription(String description)
    {
        text_field_element_description.setText(description);
    }

    public void setImage(String imageURL)
    {
        elementImage = new Image(imageURL);
        imageView_element_image.setImage(elementImage);
    }




    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    }
}
