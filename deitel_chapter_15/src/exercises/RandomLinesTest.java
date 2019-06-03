// Exercise 15.8b - RandomLinesTest.java
// Test application for Exercise 15.8a 
package exercises;

import javax.swing.JFrame;

public class RandomLinesTest 
{
	// execute application
	public static void main( String[] args )
	{
		RandomLines randomLinesPanel = new RandomLines();
		JFrame frame = new JFrame( "Exercise 15.8 - Random Lines with Java2D" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add( randomLinesPanel );
		frame.setSize( 400, 400 );
		frame.setVisible( true );
	}	// end method main
}	// end class RandomLinesTest