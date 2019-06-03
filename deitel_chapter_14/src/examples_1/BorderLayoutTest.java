// Example 14.18b - BorderLayoutDemo.java
// Testing BorderLayoutFrame
package examples_1;

import javax.swing.JFrame;

public class BorderLayoutTest
{
	public static void main( String[] args )
	{
		BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
		borderLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		borderLayoutFrame.setSize( 300, 300 );
		borderLayoutFrame.setVisible( true );
	}	// end method main
}	// end class BorderLayoutTest