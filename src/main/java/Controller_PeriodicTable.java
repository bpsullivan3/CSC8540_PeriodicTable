package main.java;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//TODO When the Element class is made, implement ElementButtonActions
//TODO Add every action in the PeriodicTableOfElements to the Interface because they all need to be implemented or
// there will be an error
//TODO Add filter buttons
//TODO Remove useless buttons in the menus
//TODO Implement resolution controls and fullscreen mode

//Each element should have a field called elementButton. This will link the element to its button
//so that when filtering we can say if the element matches the filter, then highlight its button
//We could even just isolate all of the button declarations within the element class

public class Controller_PeriodicTable implements ButtonActions, Initializable
{
    public ImageView[] elementButtons = new ImageView[118];

    private int elementInformationPanelInstanceCount = 0;
    private int currentZoomLevel = 0;
    /*
    0 = 100%
    1 = 150%
    2 = 200%
     */
    private Stage stage_elementInformationPanel;
    private int corX = 0;
    private int corY = 0;

    @FXML
    TextArea TextArea_sliderPreciseNumber;
    @FXML
    Slider Slider_filterSlider;
    @FXML
    ChoiceBox<String> ChoiceBox_sliderChoice;
    @FXML
    private MenuItem zoom200;
    @FXML
    private GridPane GridPane_periodicTable;
    @FXML
    private AnchorPane root;
    @FXML
    private Pane pane;
    @FXML
    private CheckMenuItem CheckMenuItem_zoom100;
    @FXML
    private CheckMenuItem CheckMenuItem_zoom150;
    @FXML
    private CheckMenuItem CheckMenuItem_zoom200;
    @FXML
    public ImageView button_boron;
    @FXML
    public ImageView button_tantalum;
    @FXML
    public ImageView button_hafnium;
    @FXML
    public ImageView button_neodymium;
    @FXML
    public ImageView button_actinium;
    @FXML
    public ImageView button_bohrium;
    @FXML
    public ImageView button_manganese;
    @FXML
    public ImageView button_plutonium;
    @FXML
    public ImageView button_scandium;
    @FXML
    public ImageView button_hydrogen;
    @FXML
    public ImageView button_dubnium;
    @FXML
    public ImageView button_oxygen;
    @FXML
    public ImageView button_rubidium;
    @FXML
    public ImageView button_radium;
    @FXML
    public ImageView button_nitrogen;
    @FXML
    public ImageView button_europium;
    @FXML
    public ImageView button_erbium;
    @FXML
    public ImageView button_cadmium;
    @FXML
    public ImageView button_californium;
    @FXML
    public ImageView button_potassium;
    @FXML
    public ImageView button_tungsten;
    @FXML
    public ImageView button_holmium;
    @FXML
    public ImageView button_aluminium;
    @FXML
    public ImageView button_thorium;
    @FXML
    public ImageView button_yttrium;
    @FXML
    public ImageView button_xenon;
    @FXML
    public ImageView button_zinc;
    @FXML
    public ImageView button_silicon;
    @FXML
    public ImageView button_copernicium;
    @FXML
    public ImageView button_niobium;
    @FXML
    public ImageView button_francium;
    @FXML
    public ImageView button_nickel;
    @FXML
    public ImageView button_antimony;
    @FXML
    public ImageView button_sodium;
    @FXML
    public ImageView button_praseodymium;
    @FXML
    public ImageView button_rhodium;
    @FXML
    public ImageView button_nihonium;
    @FXML
    public ImageView button_zirconium;
    @FXML
    public ImageView button_tellurium;
    @FXML
    public ImageView button_fluorine;
    @FXML
    public ImageView button_strontium;
    @FXML
    public ImageView button_lead;
    @FXML
    public ImageView button_gold;
    @FXML
    public ImageView button_germanium;
    @FXML
    public ImageView button_bromine;
    @FXML
    public ImageView button_calcium;
    @FXML
    public ImageView button_sulfur;
    @FXML
    public ImageView button_iodine;
    @FXML
    public ImageView button_beryllium;
    @FXML
    public ImageView button_roentgenium;
    @FXML
    public ImageView button_argon;
    @FXML
    public ImageView button_einsteinium;
    @FXML
    public ImageView button_tin;
    @FXML
    public ImageView button_phosphorus;
    @FXML
    public ImageView button_terbium;
    @FXML
    public ImageView button_ruthenium;
    @FXML
    public ImageView button_astatine;
    @FXML
    public ImageView button_ytterbium;
    @FXML
    public ImageView button_cobalt;
    @FXML
    public ImageView button_fermium;
    @FXML
    public ImageView button_carbon;
    @FXML
    public ImageView button_lanthanum;
    @FXML
    public ImageView button_moscovium;
    @FXML
    public ImageView button_mercury;
    @FXML
    public ImageView button_polonium;
    @FXML
    public ImageView button_rhenium;
    @FXML
    public ImageView button_platinum;
    @FXML
    public ImageView button_mendelevium;
    @FXML
    public ImageView button_molybdenum;
    @FXML
    public ImageView button_krypton;
    @FXML
    public ImageView button_livermorium;
    @FXML
    public ImageView button_bismuth;
    @FXML
    public ImageView button_iridium;
    @FXML
    public ImageView button_radon;
    @FXML
    public ImageView button_copper;
    @FXML
    public ImageView button_samarium;
    @FXML
    public ImageView button_curium;
    @FXML
    public ImageView button_barium;
    @FXML
    public ImageView button_gallium;
    @FXML
    public ImageView button_caesium;
    @FXML
    public ImageView button_indium;
    @FXML
    public ImageView button_helium;
    @FXML
    public ImageView button_iron;
    @FXML
    public ImageView button_hassium;
    @FXML
    public ImageView button_selenium;
    @FXML
    public ImageView button_lutetium;
    @FXML
    public ImageView button_lawrencium;
    @FXML
    public ImageView button_neptunium;
    @FXML
    public ImageView button_technetium;
    @FXML
    public ImageView button_berkelium;
    @FXML
    public ImageView button_promethium;
    @FXML
    public ImageView button_protactinium;
    @FXML
    public ImageView button_chromium;
    @FXML
    public ImageView button_gadolinium;
    @FXML
    public ImageView button_americium;
    @FXML
    public ImageView button_cerium;
    @FXML
    public ImageView button_seaborgium;
    @FXML
    public ImageView button_chlorine;
    @FXML
    public ImageView button_osmium;
    @FXML
    public ImageView button_darmstadtium;
    @FXML
    public ImageView button_arsenic;
    @FXML
    public ImageView button_neon;
    @FXML
    public ImageView button_palladium;
    @FXML
    public ImageView button_tennessine;
    @FXML
    public ImageView button_flerovium;
    @FXML
    public ImageView button_titanium;
    @FXML
    public ImageView button_vanadium;
    @FXML
    public ImageView button_silver;
    @FXML
    public ImageView button_rutherfordium;
    @FXML
    public ImageView button_nobelium;
    @FXML
    public ImageView button_dysprosium;
    @FXML
    public ImageView button_uranium;
    @FXML
    public ImageView button_thulium;
    @FXML
    public ImageView button_magnesium;
    @FXML
    public ImageView button_thallium;
    @FXML
    public ImageView button_oganesson;
    @FXML
    public ImageView button_lithium;
    @FXML
    public ImageView button_meitnerium;


    @FXML
    public void zoom100Action(ActionEvent event)
    {
        CheckMenuItem_zoom150.setSelected(false);
        CheckMenuItem_zoom200.setSelected(false);
        currentZoomLevel = 0;
        root.setTopAnchor(GridPane_periodicTable, (double) 0);
        root.setLeftAnchor(GridPane_periodicTable, (double) 0);
        root.setRightAnchor(GridPane_periodicTable, (double) 0);
        root.setBottomAnchor(GridPane_periodicTable, (double) 0);
        GridPane_periodicTable.setPrefWidth(1073);
        GridPane_periodicTable.setPrefHeight(737);
        GridPane_periodicTable.setTranslateX(0);
        GridPane_periodicTable.setTranslateY(0);


        for (int i = 0; i < 118; i++)
        {
            elementButtons[i].setFitHeight(70);
            elementButtons[i].setFitWidth(60);
        }
    }

    @FXML
    public void zoom150Action(ActionEvent event)
    {
        CheckMenuItem_zoom100.setSelected(false);
        CheckMenuItem_zoom200.setSelected(false);
        currentZoomLevel = 1;
        root.setTopAnchor(GridPane_periodicTable, (double) 0);
        root.setLeftAnchor(GridPane_periodicTable, (double) 0);
        root.setRightAnchor(GridPane_periodicTable, (double) -536);
        root.setBottomAnchor(GridPane_periodicTable, (double) -368);
        GridPane_periodicTable.setPrefWidth(1609);
        GridPane_periodicTable.setPrefHeight(1105);
        GridPane_periodicTable.setTranslateX(0);
        GridPane_periodicTable.setTranslateY(0);


        for (int i = 0; i < 118; i++)
        {
            elementButtons[i].setFitHeight(105);
            elementButtons[i].setFitWidth(90);
        }
    }

    @FXML
    public void zoom200Action(ActionEvent event)
    {
        CheckMenuItem_zoom100.setSelected(false);
        CheckMenuItem_zoom150.setSelected(false);
        currentZoomLevel = 2;
        root.setTopAnchor(GridPane_periodicTable, (double) 0);
        root.setLeftAnchor(GridPane_periodicTable, (double) 0);
        root.setRightAnchor(GridPane_periodicTable, (double) -1073);
        root.setBottomAnchor(GridPane_periodicTable, (double) -737);
        GridPane_periodicTable.setPrefWidth(2146);
        GridPane_periodicTable.setPrefHeight(1474);
        GridPane_periodicTable.setTranslateX(0);
        GridPane_periodicTable.setTranslateY(0);

        for (int i = 0; i < 118; i++)
        {
            elementButtons[i].setFitHeight(140);
            elementButtons[i].setFitWidth(120);
        }


    }

    @FXML
    public void centerScreenAction(ActionEvent event)
    {
        GridPane_periodicTable.setTranslateX(0);
        GridPane_periodicTable.setTranslateY(0);
    }

    @FXML
    public void hydrogen_action(MouseEvent event)
    {
        createInformationScreen("Hydrogen");
    }

    @Override
    public void lithium_action(MouseEvent event)
    {
        createInformationScreen("Lithium");
    }

    @Override
    public void sodium_action(MouseEvent event)
    {
        createInformationScreen("Sodium");
    }

    @Override
    public void potassium_action(MouseEvent event)
    {
        createInformationScreen("Potassium");
    }

    @Override
    public void rubidium_action(MouseEvent event)
    {
        createInformationScreen("Rubidium");
    }

    @Override
    public void caesium_action(MouseEvent event)
    {
        createInformationScreen("Caesium");
    }

    @Override
    public void francium_action(MouseEvent event)
    {
        createInformationScreen("Francium");
    }

    @Override
    public void beryllium_action(MouseEvent event)
    {
        createInformationScreen("Beryllium");
    }

    @Override
    public void magnesium_action(MouseEvent event)
    {
        createInformationScreen("Magnesium");
    }

    @Override
    public void calcium_action(MouseEvent event)
    {
        createInformationScreen("Calcium");
    }

    @Override
    public void strontium_action(MouseEvent event)
    {
        createInformationScreen("Strontium");
    }

    @Override
    public void barium_action(MouseEvent event)
    {
        createInformationScreen("Barium");
    }

    @Override
    public void radium_action(MouseEvent event)
    {
        createInformationScreen("Radium");
    }

    @Override
    public void scandium_action(MouseEvent event)
    {
        createInformationScreen("Scandium");
    }

    @Override
    public void yttrium_action(MouseEvent event)
    {
        createInformationScreen("Yttrium");
    }

    @Override
    public void titanium_action(MouseEvent event)
    {
        createInformationScreen("Titanium");
    }

    @Override
    public void zirconium_action(MouseEvent event)
    {
        createInformationScreen("Zirconium");
    }

    @Override
    public void hafnium_action(MouseEvent event)
    {
        createInformationScreen("Hafnium");
    }

    @Override
    public void rutherfordium_action(MouseEvent event)
    {
        createInformationScreen("Rutherfordium");
    }

    @Override
    public void lanthanum_action(MouseEvent event)
    {
        createInformationScreen("Lanthanum");
    }

    @Override
    public void actinium_action(MouseEvent event)
    {
        createInformationScreen("Actinium");
    }

    @Override
    public void vanadium_action(MouseEvent event)
    {
        createInformationScreen("Vanadium");
    }

    @Override
    public void niobium_action(MouseEvent event)
    {
        createInformationScreen("Niobium");
    }

    @Override
    public void tantalum_action(MouseEvent event)
    {
        createInformationScreen("Tantalum");
    }

    @Override
    public void dubnium_action(MouseEvent event)
    {
        createInformationScreen("Dubnium");
    }

    @Override
    public void cerium_action(MouseEvent event)
    {
        createInformationScreen("Cerium");
    }

    @Override
    public void thorium_action(MouseEvent event)
    {
        createInformationScreen("Thorium");
    }

    @Override
    public void chromium_action(MouseEvent event)
    {
        createInformationScreen("Chromium");
    }

    @Override
    public void molybdenum_action(MouseEvent event)
    {
        createInformationScreen("Molybdenum");
    }

    @Override
    public void tungsten_action(MouseEvent event)
    {
        createInformationScreen("Tungsten");
    }

    @Override
    public void seaborgium_action(MouseEvent event)
    {
        createInformationScreen("Seaborgnium");
    }

    @Override
    public void praseodymium_action(MouseEvent event)
    {
        createInformationScreen("Praseodymium");
    }

    @Override
    public void protactinium_action(MouseEvent event)
    {
        createInformationScreen("Protactinium");
    }

    @Override
    public void manganese_action(MouseEvent event)
    {
        createInformationScreen("Manganese");
    }

    @Override
    public void technetium_action(MouseEvent event)
    {
        createInformationScreen("Technetium");
    }

    @Override
    public void rhenium_action(MouseEvent event)
    {
        createInformationScreen("Rhenium");
    }

    @Override
    public void bohrium_action(MouseEvent event)
    {
        createInformationScreen("Bohrium");
    }

    @Override
    public void neodymium_action(MouseEvent event)
    {
        createInformationScreen("Neodymium");
    }

    @Override
    public void uranium_action(MouseEvent event)
    {
        createInformationScreen("Uranium");
    }

    @Override
    public void iron_action(MouseEvent event)
    {
        createInformationScreen("Iron");
    }

    @Override
    public void ruthenium_action(MouseEvent event)
    {
        createInformationScreen("Ruthenium");
    }

    @Override
    public void osmium_action(MouseEvent event)
    {
        createInformationScreen("Osmium");
    }

    @Override
    public void hassium_action(MouseEvent event)
    {
        createInformationScreen("Hassium");
    }

    @Override
    public void promethium_action(MouseEvent event)
    {
        createInformationScreen("Promethium");
    }

    @Override
    public void neptunium_action(MouseEvent event)
    {
        createInformationScreen("Neptunium");
    }

    @Override
    public void cobalt_action(MouseEvent event)
    {
        createInformationScreen("Cobalt");
    }

    @Override
    public void rhodium_action(MouseEvent event)
    {
        createInformationScreen("Rhodium");
    }

    @Override
    public void iridium_action(MouseEvent event)
    {
        createInformationScreen("Iridium");
    }

    @Override
    public void meitnerium_action(MouseEvent event)
    {
        createInformationScreen("Meitnerium");
    }

    @Override
    public void samarium_action(MouseEvent event)
    {
        createInformationScreen("Samarium");
    }

    @Override
    public void plutonium_action(MouseEvent event)
    {
        createInformationScreen("Plutonium");
    }

    @Override
    public void nickel_action(MouseEvent event)
    {
        createInformationScreen("Nickel");
    }

    @Override
    public void palladium_action(MouseEvent event)
    {
        createInformationScreen("Palladium");
    }

    @Override
    public void platinum_action(MouseEvent event)
    {
        createInformationScreen("Platinum");
    }

    @Override
    public void darmstadtium_action(MouseEvent event)
    {
        createInformationScreen("Darmstadtium");
    }

    @Override
    public void europium_action(MouseEvent event)
    {
        createInformationScreen("Europium");
    }

    @Override
    public void americium_action(MouseEvent event)
    {
        createInformationScreen("Americium");
    }

    @Override
    public void copper_action(MouseEvent event)
    {
        createInformationScreen("Copper");
    }

    @Override
    public void silver_action(MouseEvent event)
    {
        createInformationScreen("Silver");
    }

    @Override
    public void gold_action(MouseEvent event)
    {
        createInformationScreen("Gold");
    }

    @Override
    public void roentgenium_action(MouseEvent event)
    {
        createInformationScreen("Roentgenium");
    }

    @Override
    public void gadolinium_action(MouseEvent event)
    {
        createInformationScreen("Gadolinium");
    }

    @Override
    public void curium_action(MouseEvent event)
    {
        createInformationScreen("Curium");
    }

    @Override
    public void zinc_action(MouseEvent event)
    {
        createInformationScreen("Zinc");
    }

    @Override
    public void cadmium_action(MouseEvent event)
    {
        createInformationScreen("Cadmium");
    }

    @Override
    public void mercury_action(MouseEvent event)
    {
        createInformationScreen("Mercury");
    }

    @Override
    public void copernicium_action(MouseEvent event)
    {
        createInformationScreen("Copernicium");
    }

    @Override
    public void terbium_action(MouseEvent event)
    {
        createInformationScreen("Terbium");
    }

    @Override
    public void berkelium_action(MouseEvent event)
    {
        createInformationScreen("Berkelium");
    }

    @Override
    public void boron_action(MouseEvent event)
    {
        createInformationScreen("Boron");
    }

    @Override
    public void aluminium_action(MouseEvent event)
    {
        createInformationScreen("Aluminium");
    }

    @Override
    public void gallium_action(MouseEvent event)
    {
        createInformationScreen("Gallium");
    }

    @Override
    public void indium_action(MouseEvent event)
    {
        createInformationScreen("Indium");
    }

    @Override
    public void thallium_action(MouseEvent event)
    {
        createInformationScreen("Thallium");
    }

    @Override
    public void nihonium_action(MouseEvent event)
    {
        createInformationScreen("Nihonium");
    }

    @Override
    public void dysprosium_action(MouseEvent event)
    {
        createInformationScreen("Dysprosium");
    }

    @Override
    public void californium_action(MouseEvent event)
    {
        createInformationScreen("Californium");
    }

    @Override
    public void carbon_action(MouseEvent event)
    {
        createInformationScreen("Carbon");
    }

    @Override
    public void silicon_action(MouseEvent event)
    {
        createInformationScreen("Silicon");
    }

    @Override
    public void germanium_action(MouseEvent event)
    {
        createInformationScreen("Germanium");
    }

    @Override
    public void tin_action(MouseEvent event)
    {
        createInformationScreen("Tin");
    }

    @Override
    public void lead_action(MouseEvent event)
    {
        createInformationScreen("Lead");
    }

    @Override
    public void flerovium_action(MouseEvent event)
    {
        createInformationScreen("Flerovium");
    }

    @Override
    public void holmium_action(MouseEvent event)
    {
        createInformationScreen("Holmium");
    }

    @Override
    public void einsteinium_action(MouseEvent event)
    {
        createInformationScreen("Einsteinium");
    }

    @Override
    public void nitrogen_action(MouseEvent event)
    {
        createInformationScreen("Nitrogen");
    }

    @Override
    public void phosphorus_action(MouseEvent event)
    {
        createInformationScreen("Phosphorus");
    }

    @Override
    public void arsenic_action(MouseEvent event)
    {
        createInformationScreen("Arsenic");
    }

    @Override
    public void antimony_action(MouseEvent event)
    {
        createInformationScreen("Antimony");
    }

    @Override
    public void bismuth_action(MouseEvent event)
    {
        createInformationScreen("Bismuth");
    }

    @Override
    public void moscovium_action(MouseEvent event)
    {
        createInformationScreen("Moscovium");
    }

    @Override
    public void erbium_action(MouseEvent event)
    {
        createInformationScreen("Erbium");
    }

    @Override
    public void fermium_action(MouseEvent event)
    {
        createInformationScreen("Fermium");
    }

    @Override
    public void oxygen_action(MouseEvent event)
    {
        createInformationScreen("Oxygen");
    }

    @Override
    public void sulfur_action(MouseEvent event)
    {
        createInformationScreen("Sulfur");
    }

    @Override
    public void selenium_action(MouseEvent event)
    {
        createInformationScreen("Selenium");
    }

    @Override
    public void tellurium_action(MouseEvent event)
    {
        createInformationScreen("Tellurium");
    }

    @Override
    public void polonium_action(MouseEvent event)
    {
        createInformationScreen("Polonium");
    }

    @Override
    public void livermorium_action(MouseEvent event)
    {
        createInformationScreen("Livermorium");
    }

    @Override
    public void thulium_action(MouseEvent event)
    {
        createInformationScreen("Thulium");
    }

    @Override
    public void mendelevium_action(MouseEvent event)
    {
        createInformationScreen("Mendelevium");
    }

    @Override
    public void fluorine_action(MouseEvent event)
    {
        createInformationScreen("Fluorine");
    }

    @Override
    public void chlorine_action(MouseEvent event)
    {
        createInformationScreen("Chlorine");
    }

    @Override
    public void bromine_action(MouseEvent event)
    {
        createInformationScreen("Bromine");
    }

    @Override
    public void iodine_action(MouseEvent event)
    {
        createInformationScreen("Iodine");
    }

    @Override
    public void astatine_action(MouseEvent event)
    {
        createInformationScreen("Astatine");
    }

    @Override
    public void tennessine_action(MouseEvent event)
    {
        createInformationScreen("Tennessine");
    }

    @Override
    public void ytterbium_action(MouseEvent event)
    {
        createInformationScreen("Ytterbium");
    }

    @Override
    public void nobelium_action(MouseEvent event)
    {
        createInformationScreen("Nobelium");
    }

    @Override
    public void helium_action(MouseEvent event)
    {
        createInformationScreen("Helium");
    }

    @Override
    public void neon_action(MouseEvent event)
    {
        createInformationScreen("Neon");
    }

    @Override
    public void argon_action(MouseEvent event)
    {
        createInformationScreen("Argon");
    }

    @Override
    public void krypton_action(MouseEvent event)
    {
        createInformationScreen("Krypton");
    }

    @Override
    public void xenon_action(MouseEvent event)
    {
        createInformationScreen("Xenon");
    }

    @Override
    public void radon_action(MouseEvent event)
    {
        createInformationScreen("Radon");
    }

    @Override
    public void oganesson_action(MouseEvent event)
    {
        createInformationScreen("Organesson");
    }

    @Override
    public void lutetium_action(MouseEvent event)
    {
        createInformationScreen("Lutetium");
    }

    @Override
    public void lawrencium_action(MouseEvent event)
    {
        createInformationScreen("Lawrencium");
    }

    @Override
    public void panScreenStarted(MouseEvent event)
    {
        corX = (int) event.getX();
        corY = (int) event.getY();
    }

    @Override
    public void panScreen(MouseEvent event)
    {
        if (currentZoomLevel != 0)
        {
            GridPane_periodicTable.setTranslateX(event.getSceneX() - corX);
            GridPane_periodicTable.setTranslateY(event.getSceneY() - corY);
        }
    }

    @Override
    public void dragEnter(MouseEvent event)    //For effect that makes buttons larger when hovering above them
    {
        ImageView sourceButton = (ImageView) event.getSource();
        switch (currentZoomLevel)
        {
            case 0:
                sourceButton.setFitHeight(90);
                sourceButton.setFitWidth(80);
                sourceButton.toFront();
                break;
            case 1:
                sourceButton.setFitHeight(135);
                sourceButton.setFitWidth(120);
                sourceButton.toFront();
                break;
            case 2:
                sourceButton.setFitHeight(180);
                sourceButton.setFitWidth(160);
                sourceButton.toFront();
                break;

        }

    }

    @Override
    public void dragExit(MouseEvent event)
    {
        ImageView sourceButton = (ImageView) event.getSource();
        switch (currentZoomLevel)
        {
            case 0:
                sourceButton.setFitHeight(70);
                sourceButton.setFitWidth(60);
                sourceButton.toFront();
                break;
            case 1:
                sourceButton.setFitHeight(105);
                sourceButton.setFitWidth(90);
                sourceButton.toFront();
                break;
            case 2:
                sourceButton.setFitHeight(140);
                sourceButton.setFitWidth(120);
                sourceButton.toFront();
                break;

        }

    }


    @Override
    public void switchToListView(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ListView.fxml"));
            Parent root_listView = fxmlLoader.load();
            Stage stage_listView = new Stage();
            Controller_ListView controller_listView = fxmlLoader.getController();
            stage_listView.setScene(new Scene(root_listView));
            stage_listView.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    public void createInformationScreen(String name)
    {
        Element element = new Element(name);
        try
        {
            elementInformationPanelInstanceCount += 1;

            if (elementInformationPanelInstanceCount > 1)
            {
                stage_elementInformationPanel.close();
            }


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ElementInformationPanel.fxml"));
            Parent root_elementInformationPanel = fxmlLoader.load();
            stage_elementInformationPanel = new Stage();
            Controller_ElementInformationPanel controller_elementInformationPanel = fxmlLoader.getController();
            //This is essential for changing values in other controller

            //For demo purposes
            controller_elementInformationPanel.setName("Hydrogen");
            controller_elementInformationPanel.setAtomicNumber("1");
            controller_elementInformationPanel.setMeltingPoint("13.99K");
            controller_elementInformationPanel.setBoilingPoint("20.271K");
            controller_elementInformationPanel.setImage("images/hydrogen_placeholder_description_image.png");
            controller_elementInformationPanel.setDescription("Hydrogen is a chemical element with symbol H and " +
                    "atomic number 1. With a standard atomic weight of 1.008, hydrogen is the lightest element on the" +
                    " periodic table. Its monatomic form (H) is the most abundant chemical substance in the Universe," +
                    " constituting roughly 75% of all baryonic mass. Non-remnant stars are mainly composed of " +
                    "hydrogen in the plasma state. The most common isotope of hydrogen, termed protium (name rarely " +
                    "used, symbol 1H), has one proton and no neutrons.");

            /*
            controller_elementInformationPanel.setName(element.getName());
            controller_elementInformationPanel.setAtomicNumber(String.valueOf(element.getAt_num()));
            controller_elementInformationPanel.setMeltingPoint(String.valueOf(element.getMelting_pt()));
            controller_elementInformationPanel.setBoilingPoint(String.valueOf(element.getBoiling_pt()));
            controller_elementInformationPanel.setDescription(element.getDesc());
            controller_elementInformationPanel.setImage(element.getImage_Link());
            */

            stage_elementInformationPanel.setScene(new Scene(root_elementInformationPanel));
            stage_elementInformationPanel.show();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        elementButtons[0] = button_hydrogen;
        elementButtons[1] = button_helium;
        elementButtons[2] = button_lithium;
        elementButtons[3] = button_beryllium;
        elementButtons[4] = button_boron;
        elementButtons[5] = button_carbon;
        elementButtons[6] = button_nitrogen;
        elementButtons[7] = button_oxygen;
        elementButtons[8] = button_fluorine;
        elementButtons[9] = button_neon;
        elementButtons[10] = button_sodium;
        elementButtons[11] = button_magnesium;
        elementButtons[12] = button_aluminium;
        elementButtons[13] = button_silicon;
        elementButtons[14] = button_phosphorus;
        elementButtons[15] = button_sulfur;
        elementButtons[16] = button_chlorine;
        elementButtons[17] = button_argon;
        elementButtons[18] = button_potassium;
        elementButtons[19] = button_calcium;
        elementButtons[20] = button_scandium;
        elementButtons[21] = button_titanium;
        elementButtons[22] = button_vanadium;
        elementButtons[23] = button_chromium;
        elementButtons[24] = button_manganese;
        elementButtons[25] = button_iron;
        elementButtons[26] = button_cobalt;
        elementButtons[27] = button_nickel;
        elementButtons[28] = button_copper;
        elementButtons[29] = button_zinc;
        elementButtons[30] = button_gallium;
        elementButtons[31] = button_germanium;
        elementButtons[32] = button_arsenic;
        elementButtons[33] = button_selenium;
        elementButtons[34] = button_bromine;
        elementButtons[35] = button_krypton;
        elementButtons[36] = button_rubidium;
        elementButtons[37] = button_strontium;
        elementButtons[38] = button_yttrium;
        elementButtons[39] = button_zirconium;
        elementButtons[40] = button_niobium;
        elementButtons[41] = button_molybdenum;
        elementButtons[42] = button_technetium;
        elementButtons[43] = button_ruthenium;
        elementButtons[44] = button_rhodium;
        elementButtons[45] = button_palladium;
        elementButtons[46] = button_silver;
        elementButtons[47] = button_cadmium;
        elementButtons[48] = button_indium;
        elementButtons[49] = button_tin;
        elementButtons[50] = button_antimony;
        elementButtons[51] = button_tellurium;
        elementButtons[52] = button_iodine;
        elementButtons[53] = button_xenon;
        elementButtons[54] = button_caesium;
        elementButtons[55] = button_barium;
        elementButtons[56] = button_lanthanum;
        elementButtons[57] = button_cerium;
        elementButtons[58] = button_praseodymium;
        elementButtons[59] = button_neodymium;
        elementButtons[60] = button_promethium;
        elementButtons[61] = button_samarium;
        elementButtons[62] = button_europium;
        elementButtons[63] = button_gadolinium;
        elementButtons[64] = button_terbium;
        elementButtons[65] = button_dysprosium;
        elementButtons[66] = button_holmium;
        elementButtons[67] = button_erbium;
        elementButtons[68] = button_thulium;
        elementButtons[69] = button_ytterbium;
        elementButtons[70] = button_lutetium;
        elementButtons[71] = button_hafnium;
        elementButtons[72] = button_tantalum;
        elementButtons[73] = button_tungsten;
        elementButtons[74] = button_rhenium;
        elementButtons[75] = button_osmium;
        elementButtons[76] = button_iridium;
        elementButtons[77] = button_platinum;
        elementButtons[78] = button_gold;
        elementButtons[79] = button_mercury;
        elementButtons[80] = button_thallium;
        elementButtons[81] = button_lead;
        elementButtons[82] = button_bismuth;
        elementButtons[83] = button_polonium;
        elementButtons[84] = button_astatine;
        elementButtons[85] = button_radon;
        elementButtons[86] = button_francium;
        elementButtons[87] = button_radium;
        elementButtons[88] = button_actinium;
        elementButtons[89] = button_thorium;
        elementButtons[90] = button_protactinium;
        elementButtons[91] = button_uranium;
        elementButtons[92] = button_neptunium;
        elementButtons[93] = button_plutonium;
        elementButtons[94] = button_americium;
        elementButtons[95] = button_curium;
        elementButtons[96] = button_berkelium;
        elementButtons[97] = button_californium;
        elementButtons[98] = button_einsteinium;
        elementButtons[99] = button_fermium;
        elementButtons[100] = button_mendelevium;
        elementButtons[101] = button_nobelium;
        elementButtons[102] = button_lawrencium;
        elementButtons[103] = button_rutherfordium;
        elementButtons[104] = button_dubnium;
        elementButtons[105] = button_seaborgium;
        elementButtons[106] = button_bohrium;
        elementButtons[107] = button_hassium;
        elementButtons[108] = button_meitnerium;
        elementButtons[109] = button_darmstadtium;
        elementButtons[110] = button_roentgenium;
        elementButtons[111] = button_copernicium;
        elementButtons[112] = button_nihonium;
        elementButtons[113] = button_flerovium;
        elementButtons[114] = button_moscovium;
        elementButtons[115] = button_livermorium;
        elementButtons[116] = button_tennessine;
        elementButtons[117] = button_oganesson;

        //Text Box will update with the value of the slider
        Slider_filterSlider.valueProperty().addListener((observable, oldValue, newValue) ->
        {
            TextArea_sliderPreciseNumber.setText(Double.toString(newValue.intValue()));
        });

        ObservableList<String> sliderChoiceList = FXCollections.observableArrayList();
        sliderChoiceList.add("Atomic Number");
        sliderChoiceList.add("Boiling Point");
        sliderChoiceList.add("Melting Point");
        ChoiceBox_sliderChoice.setItems(sliderChoiceList);
        ChoiceBox_sliderChoice.setValue(sliderChoiceList.get(0));


    }


}
