// Exercise 15.8a - RandomLines.java
// Draws lines of random lengths, thicknesses, and colors
package exercises;

import java.awt.Graphics;		// for paintComponent
import java.awt.Graphics2D;		// for Java2D API
import java.awt.Color;			// for setting Color of line
import java.awt.geom.Line2D;	// for drawing line using Java2D
import java.awt.BasicStroke;	// for setting thickness of line
import javax.swing.JPanel;		// for drawing lines on a renderable panel
import java.util.Random;		// for generating random line properties

public class RandomLines extends JPanel
{
	private static final int LINES_TO_DRAW = 8;		// shapes drawn
	private static final int MAX_THICKNESS = 10; 	// max thickness of one line
	private Random randomNumbers = new Random();	// random number generator
	
	// paintComponent method renders lines panel
	public void paintComponent( Graphics g ) 
	{
		// call superclass's method paintComponent
		super.paintComponent( g );	
		
		// cast Graphics object to Graphics2D object
		Graphics2D g2d = ( Graphics2D ) g;
		
		// get width and height of panel - line should not exceed bounds
		int panelWidth = getWidth();
		int panelHeight = getHeight();
		
		for ( int count = 1; count <= LINES_TO_DRAW; count++ )
		{
			// initialize random parameters for line
			int x1 = randomNumbers.nextInt( panelWidth );
			int x2 = randomNumbers.nextInt( panelHeight );
			int y1 = randomNumbers.nextInt( panelWidth );
			int y2 = randomNumbers.nextInt( panelHeight );
			
			// intialize random color for line
			Color lineColor = new Color( randomNumbers.nextInt( 256 ), 
					randomNumbers.nextInt( 256 ), randomNumbers.nextInt( 256 ) );
			g2d.setPaint( lineColor );
			
			// initialize random line thickness
			BasicStroke lineStroke = new BasicStroke( 
					randomNumbers.nextFloat() * MAX_THICKNESS );
			g2d.setStroke( lineStroke );
			
			// draw a random line
			g2d.draw( new Line2D.Double( x1, y1, x2, y2 ) );
		}	// end for loop to generate randomized lines
	}	// end method paintComponent
}	// end class RandomLines