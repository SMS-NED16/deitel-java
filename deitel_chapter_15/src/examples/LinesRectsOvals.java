// Example 15.5b - LinesRectsOvals.java
// Drawing lines, rectangles, and ovals
package examples;

import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals
{
	// execute application
	public static void main( String[] args )
	{
		// create frame for LinesRectsOvalsJPanel
		JFrame frame = 
				new JFrame( "Drawing lines, rectangles, and ovals" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// create a panel with lines, rectangles, and ovals
		LinesRectsOvalsJPanel linesRectsOvalsJPanel = 
				new LinesRectsOvalsJPanel();
		linesRectsOvalsJPanel.setBackground( Color.WHITE );
		frame.add( linesRectsOvalsJPanel );
		frame.setSize( 400, 210 );
		frame.setVisible( true );
	}	// end method main
}	// end LinesRectsOvals