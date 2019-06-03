// Example 14.7a - ComboBoxFrame.java
// JComboBox that displays a list of image names
package examples_2;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class ComboBoxFrame extends JFrame
{
	// FIELDS
	private JComboBox imagesJComboBox;	// combobox to hold names of icons
	private JLabel label;				// label to display selected icon
	
	// Array of file names for images that can be selected via combobox
	private static final String[] names =
		{ "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif" };
	
	// Array of ImageIcon objects for each icon - each instantiated using String
	// from Array of file names
	private Icon[] icons = {
		new ImageIcon( getClass().getResource( names[ 0 ] ) ),
		new ImageIcon( getClass().getResource( names[ 1 ] ) ),
		new ImageIcon( getClass().getResource( names[ 2 ] ) ),
		new ImageIcon( getClass().getResource( names[ 3 ] ) )
	};	
	
	// ComboBoxFrame constructor adds JComboBox to JFrame
	public ComboBoxFrame() 
	{
		super( "Testing JComboBox" );
		setLayout( new FlowLayout() );
		
		// Instantiate the comboBox by passing array of file names
		// to the constructor
		imagesJComboBox = new JComboBox( names );		// set up JComboBox
		imagesJComboBox.setMaximumRowCount( 4 );		// display 3 rows
		
		// set up ItemListener for JComboBox using anonymous inner class
		imagesJComboBox.addItemListener(
			new ItemListener() // anonymous inner classs
			{
				// handle JComboBox event
				public void itemStateChanged( ItemEvent event )
				{
					// determine whether item selected
					if ( event.getStateChange() == ItemEvent.SELECTED )
						label.setIcon( 
							icons[ imagesJComboBox.getSelectedIndex() ] );
				}	// end method itemStateChanged
			}	// end anonymous inner class
		);	// end call to addItemListener
		
		
		// add the combobox to the JFrame
		add( imagesJComboBox );				// add combobox to JFrame
		label = new JLabel( icons[ 0 ] );	// display first icon
		add( label );						// add label to JFrame
	}	// end no-argument JComboBox constructor
}	// end class ComboBoxFrame