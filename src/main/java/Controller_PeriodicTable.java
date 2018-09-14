package main.java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//TODO When the Element class is made, implement ElementButtonActions
//TODO Add every action in the PeriodicTableOfElements to the Interface because they all need to be implemented or
// there will be an error
//TODO Add filter buttons
//TODO Remove useless buttons in the menus
//TODO Implement resolution controls and fullscreen mode

//Each element should have a field called elementButton. This will link the element to its button
//so that when filtering we can say if the element matches the filter, then highlight its button
//We could even just isolate all of the button declarations within the element class

public class Controller_PeriodicTable implements ButtonActions
{
    @FXML
    private MenuItem exit_button;
    @FXML
    private AnchorPane root;
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
    public ImageView button_vandium;
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
    void exitProgram(ActionEvent event)
    {
        System.exit(0);
    }

    @FXML
    public void hydrogen_action(MouseEvent event)
    {
        createInformationScreen("Hydrogen", "1", "13.99", "20.271", "Hydrogen is a chemical element with symbol H and atomic number 1", "images/hydrogen_placeholder_description_image.png");
        //TODO Use the get functions from the not yet created Element class to set all of the fields

        //Pass element to a function which will get all of the information to display.
        // I.e. getElementInformation(hydrogen)
        //getElementInformation will set the text of all the text fields and set the images. It will also run
        // createInformationScreen()
        //Each element's action should just have getElementInformation(nameOfElement) to keep things less cluttered
        // than they have to be

    }

    @Override
    public void lithium_action(MouseEvent event)
    {

    }

    @Override
    public void sodium_action(MouseEvent event)
    {

    }

    @Override
    public void potassium_action(MouseEvent event)
    {

    }

    @Override
    public void rubidium_action(MouseEvent event)
    {

    }

    @Override
    public void caesium_action(MouseEvent event)
    {

    }

    @Override
    public void francium_action(MouseEvent event)
    {

    }

    @Override
    public void beryllium_action(MouseEvent event)
    {

    }

    @Override
    public void magnesium_action(MouseEvent event)
    {

    }

    @Override
    public void calcium_action(MouseEvent event)
    {

    }

    @Override
    public void strontium_action(MouseEvent event)
    {

    }

    @Override
    public void barium_action(MouseEvent event)
    {

    }

    @Override
    public void radium_action(MouseEvent event)
    {

    }

    @Override
    public void scandium_action(MouseEvent event)
    {

    }

    @Override
    public void yttrium_action(MouseEvent event)
    {

    }

    @Override
    public void titanium_action(MouseEvent event)
    {

    }

    @Override
    public void zirconium_action(MouseEvent event)
    {

    }

    @Override
    public void hafnium_action(MouseEvent event)
    {

    }

    @Override
    public void rutherfordium_action(MouseEvent event)
    {

    }

    @Override
    public void lanthanum_action(MouseEvent event)
    {

    }

    @Override
    public void actinium_action(MouseEvent event)
    {

    }

    @Override
    public void vanadium_action(MouseEvent event)
    {

    }

    @Override
    public void niobium_action(MouseEvent event)
    {

    }

    @Override
    public void tantalum_action(MouseEvent event)
    {

    }

    @Override
    public void dubnium_action(MouseEvent event)
    {

    }

    @Override
    public void cerium_action(MouseEvent event)
    {

    }

    @Override
    public void thorium_action(MouseEvent event)
    {

    }

    @Override
    public void chromium_action(MouseEvent event)
    {

    }

    @Override
    public void molybdenum_action(MouseEvent event)
    {

    }

    @Override
    public void tungsten_action(MouseEvent event)
    {

    }

    @Override
    public void seaborgium_action(MouseEvent event)
    {

    }

    @Override
    public void praseodymium_action(MouseEvent event)
    {

    }

    @Override
    public void protactinium_action(MouseEvent event)
    {

    }

    @Override
    public void manganese_action(MouseEvent event)
    {

    }

    @Override
    public void technetium_action(MouseEvent event)
    {

    }

    @Override
    public void rhenium_action(MouseEvent event)
    {

    }

    @Override
    public void bohrium_action(MouseEvent event)
    {

    }

    @Override
    public void neodymium_action(MouseEvent event)
    {

    }

    @Override
    public void uranium_action(MouseEvent event)
    {

    }

    @Override
    public void iron_action(MouseEvent event)
    {

    }

    @Override
    public void ruthenium_action(MouseEvent event)
    {

    }

    @Override
    public void osmium_action(MouseEvent event)
    {

    }

    @Override
    public void hassium_action(MouseEvent event)
    {

    }

    @Override
    public void promethium_action(MouseEvent event)
    {

    }

    @Override
    public void neptunium_action(MouseEvent event)
    {

    }

    @Override
    public void cobalt_action(MouseEvent event)
    {

    }

    @Override
    public void rhodium_action(MouseEvent event)
    {

    }

    @Override
    public void iridium_action(MouseEvent event)
    {

    }

    @Override
    public void meitnerium_action(MouseEvent event)
    {

    }

    @Override
    public void samarium_action(MouseEvent event)
    {

    }

    @Override
    public void plutonium_action(MouseEvent event)
    {

    }

    @Override
    public void nickel_action(MouseEvent event)
    {

    }

    @Override
    public void palladium_action(MouseEvent event)
    {

    }

    @Override
    public void platinum_action(MouseEvent event)
    {

    }

    @Override
    public void darmstadtium_action(MouseEvent event)
    {

    }

    @Override
    public void europium_action(MouseEvent event)
    {

    }

    @Override
    public void americium_action(MouseEvent event)
    {

    }

    @Override
    public void copper_action(MouseEvent event)
    {

    }

    @Override
    public void silver_action(MouseEvent event)
    {

    }

    @Override
    public void gold_action(MouseEvent event)
    {

    }

    @Override
    public void roentgenium_action(MouseEvent event)
    {

    }

    @Override
    public void gadolinium_action(MouseEvent event)
    {

    }

    @Override
    public void curium_action(MouseEvent event)
    {

    }

    @Override
    public void zinc_action(MouseEvent event)
    {

    }

    @Override
    public void cadmium_action(MouseEvent event)
    {

    }

    @Override
    public void mercury_action(MouseEvent event)
    {

    }

    @Override
    public void copernicium_action(MouseEvent event)
    {

    }

    @Override
    public void terbium_action(MouseEvent event)
    {

    }

    @Override
    public void berkelium_action(MouseEvent event)
    {

    }

    @Override
    public void boron_action(MouseEvent event)
    {

    }

    @Override
    public void aluminium_action(MouseEvent event)
    {

    }

    @Override
    public void gallium_action(MouseEvent event)
    {

    }

    @Override
    public void indium_action(MouseEvent event)
    {

    }

    @Override
    public void thallium_action(MouseEvent event)
    {

    }

    @Override
    public void nihonium_action(MouseEvent event)
    {

    }

    @Override
    public void dysprosium_action(MouseEvent event)
    {

    }

    @Override
    public void californium_action(MouseEvent event)
    {

    }

    @Override
    public void carbon_action(MouseEvent event)
    {

    }

    @Override
    public void silicon_action(MouseEvent event)
    {

    }

    @Override
    public void germanium_action(MouseEvent event)
    {

    }

    @Override
    public void tin_action(MouseEvent event)
    {

    }

    @Override
    public void lead_action(MouseEvent event)
    {

    }

    @Override
    public void flerovium_action(MouseEvent event)
    {

    }

    @Override
    public void holmium_action(MouseEvent event)
    {

    }

    @Override
    public void einsteinium_action(MouseEvent event)
    {

    }

    @Override
    public void nitrogen_action(MouseEvent event)
    {

    }

    @Override
    public void phosphorus_action(MouseEvent event)
    {

    }

    @Override
    public void arsenic_action(MouseEvent event)
    {

    }

    @Override
    public void antimony_action(MouseEvent event)
    {

    }

    @Override
    public void bismuth_action(MouseEvent event)
    {

    }

    @Override
    public void moscovium_action(MouseEvent event)
    {

    }

    @Override
    public void erbium_action(MouseEvent event)
    {

    }

    @Override
    public void fermium_action(MouseEvent event)
    {

    }

    @Override
    public void oxygen_action(MouseEvent event)
    {

    }

    @Override
    public void sulfur_action(MouseEvent event)
    {

    }

    @Override
    public void selenium_action(MouseEvent event)
    {

    }

    @Override
    public void tellurium_action(MouseEvent event)
    {

    }

    @Override
    public void polonium_action(MouseEvent event)
    {

    }

    @Override
    public void livermorium_action(MouseEvent event)
    {

    }

    @Override
    public void thulium_action(MouseEvent event)
    {

    }

    @Override
    public void mendelevium_action(MouseEvent event)
    {

    }

    @Override
    public void fluorine_action(MouseEvent event)
    {

    }

    @Override
    public void chlorine_action(MouseEvent event)
    {

    }

    @Override
    public void bromine_action(MouseEvent event)
    {

    }

    @Override
    public void iodine_action(MouseEvent event)
    {

    }

    @Override
    public void astatine_action(MouseEvent event)
    {

    }

    @Override
    public void tennessine_action(MouseEvent event)
    {

    }

    @Override
    public void ytterbium_action(MouseEvent event)
    {

    }

    @Override
    public void nobelium_action(MouseEvent event)
    {

    }

    @Override
    public void helium_action(MouseEvent event)
    {

    }

    @Override
    public void neon_action(MouseEvent event)
    {

    }

    @Override
    public void argon_action(MouseEvent event)
    {

    }

    @Override
    public void krypton_action(MouseEvent event)
    {

    }

    @Override
    public void xenon_action(MouseEvent event)
    {

    }

    @Override
    public void radon_action(MouseEvent event)
    {

    }

    @Override
    public void oganesson_action(MouseEvent event)
    {

    }

    @Override
    public void lutetium_action(MouseEvent event)
    {

    }

    @Override
    public void lawrencium_action(MouseEvent event)
    {

    }


    public void createInformationScreen(String name, String atomicNumber, String meltingPoint, String boilingPoint, String description, String imagePath)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ElementInformationPanel.fxml"));
            Parent root_elementInformationPanel = fxmlLoader.load();
            Stage stage_elementInformationPanel = new Stage();
            Controller_ElementInformationPanel controller_elementInformationPanel = fxmlLoader.getController(); //This is essential for changing values in other controller

            //Insert element information panel values here//
            controller_elementInformationPanel.setName(name);
            controller_elementInformationPanel.setAtomicNumber(atomicNumber);
            controller_elementInformationPanel.setMeltingPoint(meltingPoint);
            controller_elementInformationPanel.setBoilingPoint(boilingPoint);
            controller_elementInformationPanel.setDescription(description);
            controller_elementInformationPanel.setImage(imagePath);


            stage_elementInformationPanel.setScene(new Scene(root_elementInformationPanel));
            stage_elementInformationPanel.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
