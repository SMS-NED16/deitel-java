// Example 14.21a - PanelFrame.java
// Using a JPanel to help lay out components
package examples_1;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame
{
	private JPanel buttonPanel;		// panel to hold buttons
	private JButton[] buttons;		// array of buttons
	
	// no-argument constructor
	public PanelFrame()
	{
		super( "Panel Demo" );
		buttons = new JButton[ 5 ];	// create buttons array
		buttonPanel = new JPanel();	// create panel
		
		// buttonPanel will be a grid of 1 row, 5 columns with 1px spaces
		buttonPanel.setLayout( new GridLayout( 1, buttons.length ) );
		
		// create and add buttons
		for ( int count = 0; count < buttons.length; count++ )
		{
			buttons[ count ] = new JButton( "Button" + ( count + 1 ) );
			buttonPanel.add( buttons[ count ] );	// add button to the panel
		}	// end for loop

		// add the buttonPanel to the south border of the JFrame
		add( buttonPanel, BorderLayout.SOUTH );
	}	// end constructor
}	// end class PanelFrame