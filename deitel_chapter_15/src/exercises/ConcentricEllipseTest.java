// Exercise 15.7b - ConcentricEllipseTest.java
// Test application for Exercise 15.7a - ConcentricEllipses.java
// Same results as application that used Graphics.drawArc
// Client does not care about interface 
package exercises;

import javax.swing.JFrame;

public class ConcentricEllipseTest
{
	// execute application
	public static void main( String[] args )
	{	
		JFrame frame = new JFrame( "Ex15.7 - Concentric Circles with "
				+ "Ellipse2D" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		frame.add( new ConcentricEllipses() );
		frame.setSize( 400, 400 );
		frame.setVisible( true );	
	}	// end method main
}	// end class ConcentricEllipseTest