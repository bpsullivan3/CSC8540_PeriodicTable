# CSC8540_PeriodicTable
Periodic Table Project for Villanova Software Engineering

Compiled with Java 10.0.2

INTERFACE ButtonActions
  This contains all of the functions that are defined in the fxml for the user interface. Every action defined in the fxml must be implemented or the program will get an error, therefore as long as every function from the UI is added to ButtonActions, every function will be implemented from the user interface.
  
CLASS Controller_ElementInformationPanel
  This class is the controller for the popup window that appears when clicking on an element. It defines each part of the user interface from the fxml. The class contains all of the methods which set the information boxes in the popup. The initialize method creates an instance of the window when the class is initialized. This class is primarily accessed through the Controller_PeriodicTable class
  
CLASS Controller_PeriodicTable
  This class is the controller for the periodic table main user interface. This defines all of the components of the user interface, which is quite lengthy because each element has a button. From here, clicking on a button should call on the createInformationScreen method, which as it is designed currently, will accept all of the pieces of information about the elements as paramaters and then create a popup screen with the Controller_ElementInformationPanel class.
  
main.resources.images
  All images used in the program will be stored here. Currently there are placeholder images, which I assume will be replaced at some point.
  
ElementInformationPanel.fxml
  This is the FXML that defines the user interface for the popup element information panel.
 
PeriodicTableOfElements.fxml
  This is the FXML that defines the user interface for the periodic table of elements panel.
  

User interface TODOs
  1) Create a way to zoom in on the table.
  2) Currently, clicking on a button after a window is open will open another window. It should either exit out of the first window automatically, or not allow users to click on more buttons until the window is closed.
  3) Create a list view.
  4) Create sliders for filters such as melting point and boiling point where a toggleable filter would not be applicable.
  5) Make it so highlighting an element button makes it enlarge slightly for asthetic appeal.
  6) Add the filter options under the filters tab.
  7) Changing the size of the panel does not adjust the size of the components within the panel - this should be fixed.
