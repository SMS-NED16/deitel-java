// Example 14.21b - PanelDemo.java
// Testing PanelFrame
package examples_1;

import javax.swing.JFrame;

public class PanelDemo extends JFrame
{
	public static void main( String[] args )
	{
		PanelFrame panelFrame = new PanelFrame();
		panelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		panelFrame.setSize( 450, 200 );
		panelFrame.setVisible( true );
	}	// end method main
}	// end class PanelDemo