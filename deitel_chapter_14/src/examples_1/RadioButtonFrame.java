// Example 14.6a - RadioButtonFrame.java
// Testing JRadioButton
package examples_1;

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
	// FIELDS
	private JTextField textField;			// used to display font changes
	
	// FONT OPTIONS
	private Font plainFont;					// font for plain text
	private Font boldFont;					// font for bold text
	private Font italicFont;				// font for italic text
	private Font boldItalicFont;			// font for bold and italic text
	
	// RADIO BUTTONS TO SELECT EACH FONT OPTIONS
	private JRadioButton plainButton;		// button to select plain font
	private JRadioButton boldButton;		// button to select bold font
	private JRadioButton italicButton;		// button to select italic font
	private JRadioButton boldItalicButton;	// button to select bold and italic font
	
	// RADIO GROUP THAT FORMS RELATIONSHIP B/W INDIVIDUAL RADIO BUTTONS
	private ButtonGroup radioGroup;			// buttongroup to hold radio buttons
	
	// RadioButton constructor adds JRadioButtons to JFrame
	public RadioButtonFrame()
	{
		super( "RadioButton Test" );
		setLayout( new FlowLayout() );		// set the frame layout
		
		textField = new JTextField( "Watch the font style change", 25 );
		add( textField );					// add textField to the JFrame
		
		// create RadioButton objects
		plainButton = new JRadioButton( "Plain", true );	// initially selected
		boldButton = new JRadioButton( "Bold", false );
		italicButton = new JRadioButton( "Italic", false );	// all other buttons deselected
		boldItalicButton = new JRadioButton( "Bold/Italic", false );
		
		// add RadioButton objects to JFrame
		add( plainButton );
		add( boldButton );
		add( italicButton );
		add( boldItalicButton );
		
		// create logical relationships between JRadioButtons by adding to buttongroup
		radioGroup = new ButtonGroup();		// create ButtonGroup
		radioGroup.add( plainButton );		// add plain to group
		radioGroup.add( boldButton );		// ad bold button to group
		radioGroup.add( italicButton );		// add italic button to group
		radioGroup.add( boldItalicButton );	// add bold and italic button to group
		
		// create Font objects
		plainFont = new Font( "Serif", Font.PLAIN, 14 );
		boldFont = new Font( "Serif", Font.BOLD, 14 );
		italicFont = new Font( "Serif", Font.ITALIC, 14 );
		boldItalicFont = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
		
		// initially, plain font radio button selected so set plain font as default
		textField.setFont( plainFont );
		
		// register event listeners for JRadioButtons
		plainButton.addItemListener( new RadioButtonHandler( plainFont ) );
		boldButton.addItemListener( new RadioButtonHandler( boldFont ) );
		italicButton.addItemListener( new RadioButtonHandler( italicFont ) );
		boldItalicButton.addItemListener( new RadioButtonHandler( boldItalicFont) );
	}	// end no-argument RadioButtonFrame constructor
	
	
	// private inner class to handle radio button events
	private class RadioButtonHandler implements ItemListener
	{
		private Font font;			// font associated with this listener
		
		public RadioButtonHandler( Font f )
		{
				font = f;
		}	// end constructor to set font of the listener
		
		// handle radio button events by setting textField font to f
		public void itemStateChanged( ItemEvent event )
		{
			textField.setFont( font );		// set font of textField
		}	// end method itemStateChanged
	}	// end private inner class RadioButtonHandler
}	// end class RadioButtonFrame