// Example 14.9b - MouseTrackerTest.java
// Testing MouseTrackerFrame
package examples_2;

import javax.swing.JFrame;

public class MouseTrackerTest
{
	public static void main( String[] args )
	{
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseTrackerFrame.setSize( 300, 100 );
		mouseTrackerFrame.setVisible( true );
	}
}	// end class MouseTracker