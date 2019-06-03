// Example 14.7a - ComboBoxFrame.java
// JComboBox that displays a list of image names
package examples_1;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JComboBox;

public class ComboBoxFrame extends JFrame
{
	// FIELDS
	private JComboBox imagesComboBox;		// combobox to hold names of icons
	private JLabel label;					// label to display selected icon
	
	
	// CONSTANTS
	// array of file names that will be used to generate Icons/combobox entries
	private static final String[] names = 
	{ "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif" };

	// array of Icons generated using array of file names
	private Icon[] icons = {
		new ImageIcon( getClass().getResource( "bug1.gifg" ) ),
		new ImageIcon( getClass().getResource( "bug2.gif" ) ),
		new ImageIcon( getClass().getResource( "travelbug.gif" ) ),
		new ImageIcon( getClass().getResource( "buganim.gif" ) )
	};
	
	// ComboBoxFrame constructor adds JComboBox and JLabel to JFrame
	public ComboBoxFrame()
	{
		super( "Testing JComboBox" );
		setLayout( new FlowLayout() );
		
		// instantiate the ComboBox
		imagesComboBox = new JComboBox( names );		// set up JComboBox
		imagesComboBox.setMaximumRowCount( 3 );			// display three rows
		
		// register an ItemListener using an anonymous class
		imagesComboBox.addItemListener(
			new ItemListener()
			{
				// handle JComboBox event
				public void itemStateChanged( ItemEvent event )
				{
						if ( event.getStateChange() == ItemEvent.SELECTED )
							label.setIcon( 
									icons[ imagesComboBox.getSelectedIndex() ] ) ;
				}	// end method ItemStateChanged
			}	// end inner anonymous class ItemListener
		);	// end call to addItemListener
		
		add( imagesComboBox );		// add combo box to JFrame
		label = new JLabel( icons[ 0 ] );	// display first (Default) icon
		add( label );				// add label to JFrame
		
	}	// end ComboBoxFrame constructor
}	// end class ComboBoxFrame