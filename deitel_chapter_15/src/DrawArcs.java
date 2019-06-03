// Example 15.6b - DrawArcs.java
// Drawing Arcs
import javax.swing.JFrame;

public class DrawArcs
{
	// execute application
	public static void main( String[] args )
	{
		// create frame for ArcsJPanel
		JFrame frame = new JFrame( "Drawing Arcs" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		ArcsJPanel arcsJPanel = new ArcsJPanel();	// create ArcsJPanel
		frame.add( arcsJPanel );		// adds arcsJPanel to the frame
		frame.setSize( 300, 210 );		// set frame size
		frame.setVisible( true );		// display frame
	}	// end method main
}	// end class DrawArcs