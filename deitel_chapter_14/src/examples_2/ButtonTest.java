// Example 14.4b - ButtonTest.java
// Testing ButtonFrame
package examples_2;

import javax.swing.JFrame;

public class ButtonTest
{
	public static void main( String[] args )
	{
		// Create a new instance of ButtonFrame
		ButtonFrame buttonFrame = new ButtonFrame();
		
		// Settings for buttonFrame
		buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		buttonFrame.setSize( 275, 110 );	// set frame size
		buttonFrame.setVisible( true );		// display frame
	}	// end method main
}	// end class ButtonTest