/** 
 * This class represents Main Menu Screen, and implements ActionListener.
 * This Class implements the GUI-based interface which
 * displays a menu of options for the Fireplace 
 * Cataloguer.
 * 
 * @author Rabia Nazir, Ula, Bradley.
 * 
 * @version 1
 */ 

import javax.swing.*;         
import javax.swing.border.*;  
import java.awt.*;             
import java.awt.event.*;      

public class MainMenuScreen implements ActionListener 
{ 
    // Attributes
    private JFrame  frame; 
    private JPanel  mainPanel, headerPanel, enterButtonPanel, searchButtonPanel,
    submitButtonPanel, exitButtonPanel,reportingButtonPanel, helpButtonPanel;

    private Border  myBorder;
    private JLabel  screenHeaderLabel; 
    private JButton enterItemButton, enterSupplierButton, 
    submitButton, exitButton,reportingButton, helpButton,
    itemsupplierButton;
    private Font    myFont1, myFont2;

    /**
     * Constructor method which implements the GUI
     * Interface for initial menu screen for 
     * Chesney Fireplace.
     */
    public MainMenuScreen()
    {
        // Create a frame
        createFrame();

        // Set up borders
        setUpBorder();

        // Set up fonts
        setUpFonts();

        // Create panels
        createPanels();

        // Set up screen header
        setUpMainHeader();

        // Set up menu-items
        setUpmenuItems();

        // Register push buttons for action events
        registerComponentsForEvents();

        // Finalise the frame ready to be displayed 
        finaliseTheFrame();        

    } // End MainMenuScreen()

    /**
     * Create Frame
     * Method which sets up the main frame
     * window with title, set up size of the frame.
     */

    private void createFrame()  
    {
        // Construct frame object
        frame = new JFrame();

        // Put title on frame
        frame.setTitle ("Chesney's Fireplaces Catalogue System");

        // Size frame
        frame.setBounds(100,100,700,600);

        // Allow frame to be closed when 'exit'
        // button pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame non-resizable
        frame.setResizable (true);

    } // End createFrame()

    /**
     *  Method to set up borders for later use with panels
     */
    private void setUpBorder()
    { 

        // Create border object
        myBorder = BorderFactory.createRaisedBevelBorder();

    } // End setUpBorder()

    /**
     *  Method to set up my customised fonts
     */
    private void setUpFonts()
    {

        myFont1 = new Font("TimesRoman", Font.BOLD,
            30);
        myFont2 = new Font("TimesRoman", Font.BOLD,
            15);

    } // End setUpFonts()

    /**
     * Method to create panels
     */
    private void createPanels()
    {

        // Create panel objects
        mainPanel = new JPanel();
        headerPanel = new JPanel();
        enterButtonPanel = new JPanel();
        searchButtonPanel = new JPanel();
        submitButtonPanel = new JPanel();
        reportingButtonPanel = new JPanel();
        exitButtonPanel = new JPanel();
        helpButtonPanel = new JPanel();

        // Set up border effects for panels
        headerPanel.setBorder (myBorder);
        enterButtonPanel.setBorder (myBorder);
        searchButtonPanel.setBorder (myBorder);
        submitButtonPanel.setBorder (myBorder);
        reportingButtonPanel.setBorder (myBorder);
        exitButtonPanel.setBorder (myBorder);
        helpButtonPanel.setBorder (myBorder);

        // Specify null layout for all the
        // above panels
        mainPanel.setLayout (null);
        headerPanel.setLayout (null);
        enterButtonPanel.setLayout (null);
        searchButtonPanel.setLayout (null);
        submitButtonPanel.setLayout (null);
        reportingButtonPanel.setLayout (null);
        exitButtonPanel.setLayout (null); 
        helpButtonPanel.setBorder (null);

    }  // End createPanels()

    /** 
     * Method to set up the main header. The main header
     * is stored on a panel called headerPanel.
     */

    private void setUpMainHeader()
    {

        // Create screen header label and put on header panel
        screenHeaderLabel = new JLabel ("Chesney’s Fireplaces ");        

        // Apply font to above screen header label
        screenHeaderLabel.setFont (myFont1);

        // Size and position label and then place on headerPanel
        screenHeaderLabel.setBounds (45,10,800,40);
        // Add above label to headerPanel
        headerPanel.add (screenHeaderLabel);

    } // End setUpMainHeader()

    /**
     * Method to set up the menu items. Each menu
     * item which is in fact a push button is placed
     * on its own panel.
     */
    private void setUpmenuItems()
    {
        // Create Enter Supplier push button, specify location and
        // its size on panel as well as a font.  
        // Place button on its panel.
        enterSupplierButton = new JButton ("Add New Supplier");
        enterSupplierButton.setFont (myFont2);
        enterSupplierButton.setBounds (10,25,180,30);
        // Add above button to its own panel
        enterButtonPanel.add (enterSupplierButton);

        // Create Add New Item push button, specify location and
        // its size on panel as well as a font.  
        // Place button on its panel.
        enterItemButton = new JButton ("Add New item");
        enterItemButton.setFont (myFont2);
        enterItemButton.setBounds (10,25,175,30);
        // Add above button to its own panel
        searchButtonPanel.add (enterItemButton);

        // Create help button, specify location and
        // its size on panel as well as a font.  
        // Place button on its panel.
        helpButton = new JButton ("?");
        helpButton.setFont (myFont2);
        helpButton.setBounds (10,30,195,30);
        // Add above button to its own panel
        helpButtonPanel.add (helpButton);

        // Create Item supplier details push button, specify location and
        // its size on panel as well as a font.  
        // Place button on its panel.
        submitButton = new JButton ("Item Supllier Details");
        submitButton.setFont (myFont2);
        submitButton.setBounds (10,20,180,30);
        // Add above button to its own panel
        submitButtonPanel.add (submitButton);

        // Create Reporting push button, specify location and
        // its size on panel as well as a font.  
        // Place button on its panel.
        reportingButton = new JButton ("Reporting");
        reportingButton.setFont (myFont2);
        reportingButton.setBounds (10,20,180,30);
        // Add above button to its own panel
        reportingButtonPanel.add (reportingButton);

        // Create push button to allow user to exit system,
        // specify its location and its size on panel as well
        // as a font.  Place button on its panel.      
        exitButton = new JButton ("Exit System");
        exitButton.setFont (myFont2);
        exitButton.setBounds (20,25,150,30);
        // Add above button to its own panel
        exitButtonPanel.add (exitButton);

    } // End setUpmenuItems

    /**
     * This method finalises the frame.
     * It adds all the panels created earlier to a 
     * mainPanel.
     */

    private void finaliseTheFrame()
    { 
        // Size and position the header panel
        headerPanel.setBounds (100,30,420,80);
        // Add header panel to main panel
        mainPanel.add (headerPanel);

        // Size and position the enter button panel
        enterButtonPanel.setBounds (50,170,200,80);
        // Add enter button panel to main panel
        mainPanel.add (enterButtonPanel);

        // Size and position the search button panel
        searchButtonPanel.setBounds (350,170,200,80);
        // Add search button panel to main panel
        mainPanel.add (searchButtonPanel);

        // Size and position the submit button panel
        submitButtonPanel.setBounds (50,320,200,80);
        // Add submit button panel to main panel
        mainPanel.add (submitButtonPanel);

        // Size and position the reporting button panel
        reportingButtonPanel.setBounds (350,320,200,80);
        // Add reporting button panel to main panel
        mainPanel.add (reportingButtonPanel);

        // Size and position the exit button panel
        exitButtonPanel.setBounds (175,450,200,80);
        // Add exit button panel to main panel
        mainPanel.add (exitButtonPanel);

        // Size and position the help button panel
        helpButtonPanel.setBounds (350,30,450,80);
        // Add help button panel to main panel
        mainPanel.add (helpButtonPanel);
        // Add the main panel to the frame
        frame.add (mainPanel);

        // Make the frame visible
        frame.setVisible (true);

    } // End setUpFrame

    /**
     * Method to register button components for
     * events.
     */
    private void registerComponentsForEvents()
    {
        // Register all the JButton objects for action events
        enterSupplierButton.addActionListener (this);
        enterItemButton.addActionListener (this);
        submitButton.addActionListener (this);
        reportingButton.addActionListener (this);
        exitButton.addActionListener (this);
        helpButton.addActionListener (this);

    } // End registerComponentsForEvents()

    /**
     * Implement the actionPerformed method
     * from the ActionListener Interface class.
     * 
     * @param event   An ActionEvent
     * 
     */
    public void actionPerformed(ActionEvent event)
    {
        // Check for enter supplier button pressed
        if (event.getSource() == enterSupplierButton)
        {
            // Get rid of the current frame
            frame.dispose();

            // Call the constructor method in the 
            // SupplierScreen Class
            new AddSupplierScreen();
        }
        else // Check if enter item button pressed
        if (event.getSource() == enterItemButton)
        {
            // Get rid of the current frame
            frame.dispose();

            // Call the constructor method in the
            // ItemScreen Class
            new addItemScreen();

        }
        else // Check if item supplier details menu button pressed
        if (event.getSource() == submitButton)
        {
            // Get rid of the current frame
            frame.dispose();
            // Call the constructor method in the 
            // SearchItemScreen Class
            new SearchItemScreen();

        }
        else // Check if reporting menu button pressed
        if (event.getSource() == reportingButton)
        {
            // Get rid of the current frame
            frame.dispose();

            // Call the constructor method in the 
            // ReportingScreen Class
            new ReportingScreen();

        }
        else // Check if exit button pressed
        if (event.getSource() == exitButton)
        {
            // The exit method in the System terminates
            // a program.  It takes an integer value.
            // Conventionally, 0 means program terminates
            // without a problem.
            System.exit (0);
        }

        else
        if (event.getSource() == helpButton)
        {
            frame .dispose();

            HelpScreen go;
            go = new HelpScreen();

        }

    } // End actionPerformed()

} // End MainMenuScreen Class