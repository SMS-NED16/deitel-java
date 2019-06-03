// Example 14.8a - MultipleSelectionFrame.java
// Copying items from one list to another
package examples_2;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame
{
	// FIELDS
	private JList colorJList;			// list to hold color names
	private JList copyJList;			// list to copy color names into
	private JButton copyJButton;		// button to copy selected names
	private static final String[] colorNames = 
		{
			"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green",
			"Light Gray", "Magenta", "Orange", "Pink", "Red", 
			"White", "Yellow"
		};
	
	// MultipleSelectionFrame constructor
	public MultipleSelectionFrame()
	{
		super( "Multiple Selection Lists" );
		setLayout( new FlowLayout() );
		
		colorJList = new JList( colorNames );		// hols names of all colors
		colorJList.setVisibleRowCount( 5 );
		colorJList.setSelectionMode(
				ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		add( new JScrollPane( colorJList) );
		
		copyJButton = new JButton( "Copy >>>" );	// create copy button
		copyJButton.addActionListener(
			
			// anonymous inner class to handle ActionEvent
			new ActionListener()
			{
				// handle button event
				public void actionPerformed( ActionEvent event )
				{
					// place selected values in copyJList
					copyJList.setListData( colorJList.getSelectedValues() );
				}	// end method actionPerformed	
			}	// end anonymous inner class ActionListener
		);	// end outer call to addActionListener
		
		// add the copy button to the JFrame
		add( copyJButton );
		
		// create a lit to hold copied color names
		copyJList = new JList();
		copyJList.setVisibleRowCount( 5 );		// show 5 rows
		copyJList.setFixedCellWidth( 100 );		// set width
		copyJList.setFixedCellHeight( 15 );		// set height
		copyJList.setSelectionMode(
				ListSelectionModel.SINGLE_INTERVAL_SELECTION );
		
		// add list with scrollpane
		add( new JScrollPane( copyJList ) );
	}	// end class MultipleSelectionFrame
}	// end class MultipleSelectionFrame