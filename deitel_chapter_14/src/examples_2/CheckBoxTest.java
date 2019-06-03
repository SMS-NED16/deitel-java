// Example 14.5b - CheckBoxTest.java
// Testing CheckBoxFrame
package examples_2;

import javax.swing.JFrame;

public class CheckBoxTest
{
	public static void main( String[] args )
	{
		// Instantiate a CheckBoxFrame
		CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
		
		// Set parameters
		checkBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		checkBoxFrame.setSize( 275, 100 );
		checkBoxFrame.setVisible( true );
	}	// end method main
}	// end class CheckBoxTest