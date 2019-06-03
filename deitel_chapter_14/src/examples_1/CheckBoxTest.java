// Example 14.4b - CheckBoxTest.java
// Testing CheckBoxFrame
package examples_1;

import javax.swing.JFrame;

public class CheckBoxTest
{
	public static void main( String[] args )
	{
		CheckBoxFrame cbFrame = new CheckBoxFrame();
		cbFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		cbFrame.setSize( 275, 100 );
		cbFrame.setVisible( true );
	}	// end method main
}	// end class CheckBoxTest