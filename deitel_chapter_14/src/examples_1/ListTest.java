// Example 14.8b - ListTest.java
// Selecting colors from a JList
package examples_1;

import javax.swing.JFrame;

public class ListTest
{
	public static void main( String[] args )
	{
		ListFrame listFrame = new ListFrame();		// create ListFrame
		listFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		listFrame.setSize( 300, 150 );
		listFrame.setVisible( true );
	}	// end method main
}	// end class ListTest