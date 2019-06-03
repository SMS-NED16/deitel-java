// Example 14.10b - MouseTrackerTest.java
// Testing MouseTrackerFrame class
package examples_1;

import javax.swing.JFrame;

public class MouseTrackerTest
{
	public static void main( String[] args )
	{
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseTrackerFrame.setSize( 300, 150 );
		mouseTrackerFrame.setVisible( true );
	}	// end method main
}	// end class MouseTrackerTest