// Exercise 15.7a - ConcentricEllipses.java
// Modified version of Ex15.6a that uses Graphics2D.Ellipse2D class
package exercises;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class ConcentricEllipses extends JPanel
{
	private static final int SEPARATION = 10;
	private static final int CIRCLES_TO_DRAW = 8;
	private static final int RADIUS = 30;
	
	// paintComponent called whenever panel needs to be rendered
	public void paintComponent( Graphics g )
	{
		// call superclass's paintComponent method
		super.paintComponent( g );	
		
		// Cast graphics object to Graphics2D to access Java2D API
		Graphics2D g2d = ( Graphics2D ) g;
		
		// get center coordinates
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		
		for ( int i = 1; i <= CIRCLES_TO_DRAW; i++ )
		{
			// initializing arguments for Ellipse2D.Double constructor
			// no need for initial angle and sweep - Ellipse2D is 360 by default
			double upperLeftX = centerX - RADIUS - i * SEPARATION;
			double upperLeftY = centerY - RADIUS - i * SEPARATION;
			double boundRectWidth = 2 * ( RADIUS + i * SEPARATION );
			double boundRectHeight = 2 * ( RADIUS + i * SEPARATION );
			
			// call Graphics2D draw method with new Ellipse2D.Double 
			// object as argument
			g2d.draw( new Ellipse2D.Double( upperLeftX, upperLeftY, 
					boundRectWidth, boundRectHeight ) );
		}	// end for loop to plot concentric circles
	}	// end method paintComponent
}	// end class ConcentricEllipses