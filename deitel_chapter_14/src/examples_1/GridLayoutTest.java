// Example 4.19b - GridLayouTest.java
// Testing GridLayoutFrame
package examples_1;

import javax.swing.JFrame;

public class GridLayoutTest
{
	public static void main( String[] args )
	{
		GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
		gridLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		gridLayoutFrame.setSize( 300, 200 );
		gridLayoutFrame.setVisible( true );
	}	// end method main
}	// end class GridLayoutTest