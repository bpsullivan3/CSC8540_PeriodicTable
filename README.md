# CSC8540_PeriodicTable
Periodic Table Project for Villanova Software Engineering

Compiled with Java 10.0.2

INTERFACE ButtonActions
  This contains all of the functions that are defined in the fxml for the user interface. Every action defined in the fxml must be implemented or the program will get an error, therefore as long as every function from the UI is added to ButtonActions, every function will be implemented from the user interface.
  
CLASS Controller_ElementInformationPanel
  This class is the controller for the popup window that appears when clicking on an element. It defines each part of the user interface from the fxml. The class contains all of the methods which set the information boxes in the popup. The initialize method creates an instance of the window when the class is initialized. This class is primarily accessed through the Controller_PeriodicTable class
  
CLASS Controller_PeriodicTable
  This class is the controller for the periodic table main user interface. This defines all of the components of the user interface, which is quite lengthy because each element has a button. From here, clicking on a button should call on the createInformationScreen method, which as it is designed currently, will accept all of the pieces of information about the elements as paramaters and then create a popup screen with the Controller_ElementInformationPanel class.
  
RESOURCES main.resources.images
  All images used in the program will be stored here. Currently there are placeholder images, which I assume will be replaced at some point.
  
FXML ElementInformationPanel.fxml
  This is the FXML that defines the user interface for the popup element information panel.
 
FXML PeriodicTableOfElements.fxml
  This is the FXML that defines the user interface for the periodic table of elements panel.
  

User interface TODOs

  ~~1) Create a way to zoom in on the table.~~
   ~~Zoom included now, but panning needs to be added to move screen around when zoomed in.~~
  
  ~~2) Currently, clicking on a button after a window is open will open another window. It should either exit out of the first window automatically, or not allow users to click on more buttons until the window is closed.~~
  Fixed with instance counts of elementInformationPanel
  
  3) Create a list view. *Need element class finished to work on this to test populating data*
  4) Create sliders for filters such as melting point and boiling point where a toggleable filter would not be applicable.
  
  ~~5) Make it so highlighting an element button makes it enlarge slightly for asthetic appeal.~~
  
  6) Add the filter options under the filters tab.
  
~~7) Changing the size of the panel does not adjust the size of the components within the panel - this should be fixed.~~
  Fixed by changing from a regular pane to a gridpane. This should be done to the element information popup pane as well.
    
  8) Images for each of the element buttons need to be created. They should have all parts of the layout of the periodic table and should also look nice as it is the main thing users will be looking at when opening the program.
  
  ~~9) Add panning to screen when zoomed in.~~
  Zooming now complete with panning in both 150% zoom and 200% zoom. Center screen button included under view menu.
