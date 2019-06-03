// Example 14.9a - MultipleSelectionFrame.java
// Copying items from one List to another
package examples_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class MultipleSelectionFrame extends JFrame
{
	private JList colorJList;				// list to hold color names
	private JList copyJList;				// list to copy color names into
	private JButton copyJButton;			// button to copy selected names
	
	private static final  String[] colorNames = { "Black", "Blue", "Cyan", 
		"Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
		"Pink", "Red", "White", "Yellow"
	};
	
	// MultipleSelectionFrame constructor
	public MultipleSelectionFrame()
	{
		super( "Multiple Selection Lists" );
		setLayout( new FlowLayout() );
		
		// Instantiating lists
		colorJList = new JList( colorNames );	// create a new list
		colorJList.setVisibleRowCount( 5 );		// show 5 rows
		colorJList.setSelectionMode( ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		add( new JScrollPane( colorJList ) );	// add list with scrollpane
		
		
		copyJButton = new JButton( "Copy >>>" );// create copy button
		copyJButton.addActionListener(
			new ActionListener()				// anonymous inner class
			{
				// handle button event
				public void actionPerformed( ActionEvent event )
				{
					// place the selected values in copyJList
					copyJList.setListData( colorJList.getSelectedValues() );
				}	// end method actionPerformed
			}	// end anonymous inner class ActionListener
		);	// end call to addActionListener
		
		// add the button to the JFrame
		add( copyJButton );
		
		copyJList = new JList();	// create a list to hold copied color names
		copyJList.setVisibleRowCount( 5 );		// will show only 5 rows at a time
		copyJList.setFixedCellWidth( 100 );		// set width
		copyJList.setFixedCellHeight( 15 );		// set height
		
		// can only select one row from the copyJList to be removed
		copyJList.setSelectionMode(
				ListSelectionModel.SINGLE_INTERVAL_SELECTION );
		
		// add a scroll pane to the list, add the list to the JFramego
		add( new JScrollPane( copyJList ) );	
	}	// end constructor
}	// end class MultipleSelectionFrame