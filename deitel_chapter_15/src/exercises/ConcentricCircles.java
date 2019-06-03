// Exercise 15.6a - ConcentricCircles.java
// An application that draws 8 concentric circles separated by 10 pixels
package exercises;

import java.awt.Graphics;
import javax.swing.JPanel;

public class ConcentricCircles extends JPanel
{
	private static final int CIRCLES_TO_DRAW = 8;
	private static final int SEPARATION = 10;
	private static final int RADIUS = 30;
	
	// paintComponent renders circles on panel
	public void paintComponent( Graphics g )
	{
		// call superclass' paintComponent
		super.paintComponent( g );
		
		// get panel center's coordinates
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		for ( int i = 1; i <= CIRCLES_TO_DRAW; i++ )
		{
			/* The upperLeftX coordinate decreases by SEPARATION px 
			 * The upperLeftY coordinate also decreases by SEPARATION px
			 * So bounding rectangles length = previous length + 2 * SEPARATION
			 * So new length and height are 2 * r + 2 * increment
			 * The initial angle and sweep angle are constant at 0, 360 for each iteration
			 * */
			g.drawArc(
				centerX - RADIUS - i * SEPARATION,	// upper-left x 
				centerY - RADIUS - i * SEPARATION,	// upper-left y 
				2 * ( RADIUS + i * SEPARATION ),		// bounding-rect width
				2 * ( RADIUS + i * SEPARATION ),		// bounding-rect height
				0, 										// initial angle - always 0
				360							 			// sweep - always 360
			);	// end call to drawArc
		}	// end for loop to plot circles
	}	// end method paintComponent
}	// end class ConcentricCircles