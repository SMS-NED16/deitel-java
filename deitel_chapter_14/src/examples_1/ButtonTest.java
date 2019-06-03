// Example 14.4b - ButtonTest.java
// Testing JButtonFrame
package examples_1;

import javax.swing.JFrame;

public class ButtonTest
{
	public static void main( String[] args )
	{
		JButtonFrame buttonFrame = new JButtonFrame();
		buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		buttonFrame.setSize( 275, 110 );
		buttonFrame.setVisible( true );
	}	// end method main
}	// end class ButtonTest