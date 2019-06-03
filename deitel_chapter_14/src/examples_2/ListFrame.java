// Example 14.8a - ListFrame.java
// JList that displays a list of colors
package examples_2;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame
{
	private JList colorJList;			// list to display colors
	private static final String[] colorNames =
		{ "Black", "Blue", "Cyan", "Dark Gray", "Gray", 
		"Green", "Light Gray", "Magenta", "Orange", "Pink",
		"Red", "White", "Yellow" };
	
	private static final Color[] colors = 
		{
			Color.BLACK, Color.BLUE, Color.CYAN,
			Color.DARK_GRAY, Color.GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
			Color.PINK, Color.RED, Color.WHITE, Color.YELLOW 
		};
	
	// ListFrame constructor adds JScrollPane containing JList to JFrame
	public ListFrame()
	{
		super( "List Test" );
		setLayout( new FlowLayout() );
		
		colorJList = new JList( colorNames );		// create with colorNames String array
		colorJList.setVisibleRowCount( 5 );			// display five rows at once
		
		// do not allow multiple selections
		colorJList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
		
		// add a JScrollPane containing JList to frame
		add( new JScrollPane( colorJList ) ); 
		
		// register a ListSelectionListener as an anonymous class
		colorJList.addListSelectionListener(
				new ListSelectionListener() 
				{
					// handle list selection events
					public void valueChanged( ListSelectionEvent event )
					{
						getContentPane().setBackground( 
								colors[ colorJList.getSelectedIndex() ] );
					}	// end method valueChanged
				}	// end anonymous class ListSelectionListener
		);	// end call to addListSelectionListener
	}	// end constructor 
}	// end class ListFrame