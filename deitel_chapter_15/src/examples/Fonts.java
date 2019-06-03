// Example 5.3b - Fonts.java
// Using fonts
package examples;

import javax.swing.JFrame;

public class Fonts
{
	// execute application
	public static void main( String[] args )
	{
		// create frame for FontJPanel
		JFrame frame = new JFrame( "Using fonts" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// create a FontJPanel, attach it to the frame, set frame parameters
		FontJPanel fontJPanel = new FontJPanel();
		frame.add( fontJPanel );
		frame.setSize( 420, 150 );
		frame.setVisible( true );
	}	// end method main
}	// end class Fonts