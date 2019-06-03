// Example 15.5b - LinesRectsOvals.java
// Drawing lines, rectangles, and ovals
import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals
{
	// executes application
	public static void main( String[] args )
	{
		// create frame for LinesRectsOvalsJPanel
		JFrame frame = new JFrame( "Drawing lines, rectangles, and ovals" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// create a panel to display the shapes
		LinesRectsOvalsJPanel panel = new LinesRectsOvalsJPanel();
		panel.setBackground( Color.WHITE );
		
		// attach panel to the JFrame
		frame.add( panel );
		frame.setSize( 400, 210 );
		frame.setVisible( true );
	}	// end method main
}	// end class LinesRectsOvals