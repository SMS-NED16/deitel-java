// Example 15.10b - Shapes2.java
// Demonstrating a general path
package examples;

import java.awt.Color;
import javax.swing.JFrame;

public class Shapes2
{
	// execute application
	public static void main( String[] args )
	{
		JFrame frame = new JFrame( "Drawing 2D Shapes" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		Shapes2Panel shapes2Panel = new Shapes2Panel();
		frame.add( shapes2Panel );			// add shapes2Panel to frame
		frame.setBackground( Color.WHITE );	// set frame background color
		frame.setSize( 315, 330 );
		frame.setVisible( true );
	}	// end method main
}	// end class Shapes2