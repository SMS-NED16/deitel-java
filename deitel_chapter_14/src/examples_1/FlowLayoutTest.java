// Example 14.15b - FlowLayoutTest.java
// Testing FlowLayoutFrmae
package examples_1;

import javax.swing.JFrame;

public class FlowLayoutTest
{
	public static void main( String[] args )
	{
		FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
		flowLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		flowLayoutFrame.setSize( 300, 75 );
		flowLayoutFrame.setVisible( true );
	}	// end method main
}	// end class FlowLayoutTest