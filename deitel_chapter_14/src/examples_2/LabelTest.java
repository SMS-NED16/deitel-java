// Example 14.2b - LabelTest.java
// Testing LabelFrame
package examples_2;

import javax.swing.JFrame;

public class LabelTest
{
	public static void main( String[] args )
	{
		// Create a new LabelFrame object
		LabelFrame labelFrame = new LabelFrame();
		
		// LabelFrame extends JFrame, so use JFrame boilerplate for setup
		labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		labelFrame.setSize( 260, 180 );		
		labelFrame.setVisible( true );
	}	// end method main
}	// end class LabelTest