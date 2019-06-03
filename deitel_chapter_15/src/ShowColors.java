// Example 15.1b - ShowColors.java
// Demonstrating Colors
import javax.swing.JFrame;

public class ShowColors
{
	public static void main( String[] args )
	{
		// create frame for ColorJPanel
		JFrame frame = new JFrame( "Using colors" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		ColorJPanel colorJPanel = new ColorJPanel();	// create panel
		frame.add( colorJPanel );	// attach panel to JFrame
		frame.setSize( 400, 180 );	// set frame size
		frame.setVisible( true );	// display frame
	}	// end method main
}	// end class ShowColors