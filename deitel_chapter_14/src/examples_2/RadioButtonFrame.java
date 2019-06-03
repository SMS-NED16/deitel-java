// Example 14.6a - RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton
package examples_2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{
	// FIELDS - there are a lot of fields
	private JTextField textField;			// used to display font changes
	private Font plainFont;					// font for plain text
	private Font boldFont;					// font for bold text
	private Font italicFont;				// font for italic text
	private Font boldItalicFont;			// font for bold and italic text
	private JRadioButton plainJRadioButton;	// selects plain text
	private JRadioButton boldJRadioButton;	// selects bold text
	private JRadioButton italicJRadioButton;// selects italic text
	private JRadioButton boldItalicJRadioButton;	// selects bold and italic text
	private ButtonGroup radioGroup;			// buttongroup to hold radio buttons
	
	// RadioButtonFrame constructor adds JRadioButtons to JFrame
	public RadioButtonFrame()
	{
		super( "RadioButton Test" );
		setLayout( new FlowLayout() );
		
		// Create textField that will be used to display text in different fonts
		textField = new JTextField( "Watch the font style change", 25 );
		
		// add the textField to the Frame
		add( textField );	
		
		// create Radio buttons with their labels and initial values 
		plainJRadioButton = new JRadioButton( "Plain", true );
		boldJRadioButton = new JRadioButton( "Bold", false );
		italicJRadioButton = new JRadioButton( "Italic", false );
		boldItalicJRadioButton = new JRadioButton( "Bold/Italic", false );
		
		// add the Radio buttons to the Frame
		add( plainJRadioButton );
		add( boldJRadioButton );
		add( italicJRadioButton );
		add( boldItalicJRadioButton );
		
		// create RadioGroup to establish logical r-ship between JRadioButtons
		radioGroup = new ButtonGroup();			// create a button group
		
		// add radio buttons to button group so only one can be selected at a time
		radioGroup.add( plainJRadioButton );
		radioGroup.add( boldJRadioButton );
		radioGroup.add( italicJRadioButton );
		radioGroup.add( boldItalicJRadioButton );
		
		// create Font objects that correspond to each radio selection
		plainFont = new Font( "Serif", Font.PLAIN, 14 );
		boldFont = new Font( "Serif", Font.BOLD, 14 );
		italicFont = new Font( "Serif", Font.ITALIC, 14 );
		boldItalicFont = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
		
		// set the initial Font of the textField to plain
		textField.setFont( plainFont );
		
		// register events for JRadioButtons
		plainJRadioButton.addItemListener( 
				new RadioButtonHandler( plainFont ) );
		boldJRadioButton.addItemListener(
				new RadioButtonHandler( boldFont ) );
		italicJRadioButton.addItemListener(
				new RadioButtonHandler( italicFont) );
		boldItalicJRadioButton.addItemListener(
				new RadioButtonHandler( boldItalicFont ) );
	}	// end no-argument RadioButtonFrame constructor
	
	
	// private inner class to handle radio button events
	private class RadioButtonHandler implements ItemListener
	{
		// a font associated with this listener 
		Font font;
		
		// constructor that sets the font for the listener
		public RadioButtonHandler( Font f )
		{
			font = f;		// set the font of this listener
		}	// end method 
		
		// handle radio button events
		public void itemStateChanged( ItemEvent event )
		{
			textField.setFont( font );	// set font of textField
		}	// end method itemStateChanged;
	}	// end private inner class RadioButtonHandler
}	// end class RadioButtonFrame