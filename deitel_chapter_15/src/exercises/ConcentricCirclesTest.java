// Exercise 15.6b - ConcentricCirclesTest.java
// Test application for Exercise 15.6a
package exercises;

import javax.swing.JFrame;

public class ConcentricCirclesTest
{
	// execute application
	public static void main( String[] args )
	{
		// Instantiate a JFrame to display panel
		JFrame frame = new JFrame( "Ex15.6 - Concentric Circles" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		frame.add( new ConcentricCircles() );
		frame.setSize( 300, 300 );
		frame.setVisible( true );
	}	// end method main
}	// end class ConcentricCirclesTest