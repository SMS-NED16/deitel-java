// Example 14.5a - CheckBoxFrame.java
// Creating JCheckBox buttons
package examples_2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
	// FIELDS
	private JTextField textField;		// displays text in changing fonts
	private JCheckBox boldJCheckBox;	// to select or deselect bold
	private JCheckBox italicJCheckBox;	// to select or deselect italic
	
	// CheckBoxFrame constructor adds JCheckBoxes to JFrame
	public CheckBoxFrame()
	{
		// Set window title with call to superclass constructor
		super( "JCheckBox Test" );
		
		// Set layout for JFrame
		setLayout( new FlowLayout() );
		
		// set up JTextField and set its font
		textField = new JTextField( "Watch the font style change", 20 );
		textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
		
		// add textField to the Frame
		add( textField );
		
		// set up checkboxes to toggle bold/italic fonts
		boldJCheckBox = new JCheckBox( "Bold" );		// create bold checkbox
		italicJCheckBox = new JCheckBox( "Italic" );	// create italic checkbox
		
		// add the checkboxes to the Frame
		add( boldJCheckBox );
		add( italicJCheckBox );
		
		// create a CheckBoxListener object to handle CheckBox events
		CheckBoxHandler handler = new CheckBoxHandler();
		
		// register the CheckBoxHandler for each JCheckBox
		boldJCheckBox.addItemListener( handler );
		italicJCheckBox.addItemListener( handler );
	}	// end class CheckBoxFrame
	
	
	// private inner class for ItemListener event handling
	private class CheckBoxHandler implements ItemListener
	{
		// respond to checkbox events
		public void itemStateChanged( ItemEvent event )
		{
			Font font = null;	// stores the new Font
			
			// determine which CheckBoxes are checked and create Font accordingly
			if ( boldJCheckBox.isSelected() && italicJCheckBox.isSelected() )
				font = new Font( "Serif", Font.BOLD + font.ITALIC, 14 );
			else if ( boldJCheckBox.isSelected() )
				font = new Font( "Serif", Font.BOLD, 14 );
			else if ( italicJCheckBox.isSelected() )
				font = new Font( "Serif", Font.ITALIC, 14 );
			else
				font = new Font( "Serif", Font.PLAIN, 14 );
			
			// set the textField's font
			textField.setFont( font );	
		}	// end method itemStateChanged
	}	// end private inner class CheckBoxHandler
	
}	// end class CheckBoxFrame