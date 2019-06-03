// Example 14.11b - MouseDetails.java
// Testing MouseDetailsFrame
package examples_1;

import javax.swing.JFrame;

public class MouseDetails
{
	public static void main( String[] args )
	{
		MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
		mouseDetailsFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseDetailsFrame.setSize( 300, 150 );
		mouseDetailsFrame.setVisible( true );
	}	// end method main
}	// end class MouseDetails