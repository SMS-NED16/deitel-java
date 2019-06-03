// Example 15.6b - DrawArcs.java
// Drawing arcs
package examples;

import javax.swing.JFrame;

public class DrawArcs
{
	// execute application
	public static void main( String[] args )
	{
		// Create JFrame for ArcsJPanel
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// Create ArcJPanel and attach to JFrame
		ArcsJPanel arcsJPanel = new ArcsJPanel();
		frame.add( arcsJPanel );
		frame.setSize( 300, 210 );
		frame.setVisible( true );
	}	// end method main
}	// end class DrawArcs