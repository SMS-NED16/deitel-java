// Example 15.6a - ArcsJPanel.java
// Drawing arcs
package examples;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ArcsJPanel extends JPanel
{
	// draw rectangles and arcs
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );	// call superclass's paintComponent
		
		// start at 0 and sweep 360 degrees
		g.setColor( Color.RED );
		g.drawRect( 15, 35, 80, 80 );
		g.setColor( Color.BLACK );
		g.drawArc( 15, 35, 80, 80, 0, 360 );	// circle
		
		// start at 0 and sweep 110 degrees
		g.setColor( Color.RED );
		g.drawRect( 100, 35, 80, 80 );		
		g.setColor( Color.black );
		g.drawArc( 100, 35, 80, 80, 0, 110 );	// ccw arc
		
		// start at 0 and sweep -270 degrees
		g.setColor( Color.RED );
		g.drawRect( 185, 35, 80, 80 );
		g.setColor( Color.BLACK );
		g.drawArc( 185, 35, 80, 80, 0, -270 );	// cw arc
		
		// start at 0 and sweep 360 degrees
		g.fillArc( 15, 120, 80, 40, 0, 360 );
		
		// start at 270 and sweep -90 degrees
		g.fillArc(100, 120, 80, 40, 270, -90 );
		
		// start at 0 and sweep -270 degrees
		g.fillArc( 185, 120, 80, 40, 0, -270 );
	}	// end method paintComponent
}	// end class ArcsJPanel