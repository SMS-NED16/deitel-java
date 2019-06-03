// Example 14.11b - Painter.java
// Testing PaintPanel
package examples_2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Painter
{
	public static void main( String[] args )
	{
		// Create JFrame
		JFrame application = new JFrame( "A simple paint program" );
		
		PaintPanel paintPanel = new PaintPanel();	// create paint panel
		application.add( paintPanel, BorderLayout.CENTER );	// in center
		
		// create a label and place it in South of BorderLayout
		application.add( new JLabel( "Drag the mouse to draw" ),
				BorderLayout.SOUTH );
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.setSize( 400, 200 );
		application.setVisible( true );
	}	// end method main
}	// end class Painter