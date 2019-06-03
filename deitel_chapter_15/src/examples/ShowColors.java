// Example 15.1b - ShowColors.java
// Demonstrating Colors
package examples;

import javax.swing.JFrame;

public class ShowColors
{
	// begin execution
	public static void main( String[] args )
	{	
		// create frame for ColorJPanel
		JFrame frame = new JFrame( "Using Colors" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		ColorJPanel colorJPanel = new ColorJPanel();	// create ColorJPanel
		frame.add( colorJPanel );		// add panel to JFrame
		frame.setSize( 450, 180 );		// set frame size
		frame.setVisible( true );		// display frame
	}	// end method main
}	// end class ShowColors