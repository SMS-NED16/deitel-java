// Example 14.16b - PanelDemo.java
// Testing PanelFrame
package examples_2;

import javax.swing.JFrame;

public class PanelDemo extends JFrame
{
	public static void main( String[] args )
	{
		PanelFrame panelFrame = new PanelFrame();
		panelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		panelFrame.setSize( 450, 200 );		// set frame size
		panelFrame.setVisible( true );		// display frame
	}	// end method main
}	// end class PanelDemo