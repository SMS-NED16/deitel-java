// Exercise 15.9b - RandomTriangles.java
// Test application for RandomTriangles.java
package exercises;

import javax.swing.JFrame;

public class RandomTrianglesTest
{
	// execute application
	public static void main( String[] args )
	{
		JFrame application = new JFrame( "Exercise 15.9 - Random Triangles" );
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		RandomTriangles trianglePanel = new RandomTriangles();
		application.add( trianglePanel );
		application.setSize( 300, 300 );
		application.setVisible( true );
		
	}	// end method main
}	// end class RandomTrianglesTest