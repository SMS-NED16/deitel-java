// Example 14.2b - LabelTest.java
// Testing LabelFrame
package examples_1;

import javax.swing.JFrame;

public class LabelTest
{
	public static void main( String[] args )
	{
		// Instantiate a LabelFrame 
		LabelFrame labelFrame = new LabelFrame();
		
		// inherits from JFrame so same settings
		labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		labelFrame.setSize( 260, 180 );
		labelFrame.setVisible( true );
	}	// end method main
}	// end class LabelTest