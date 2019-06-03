// Example 15.9a - Shapes2Panel.java
// Demonstrating a general path
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

public class Shapes2Panel extends JPanel
{
	// draw general paths
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );		// call superclass's paintComponent
		Random random = new Random();	// get random number generator
		
		int[] xPoints = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
		int[] yPoints = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
		
		Graphics2D g2d = ( Graphics2D ) g;
		GeneralPath star = new GeneralPath();	// create GeneralPath object
		
		// set the initial coordinates of the general path
		star.moveTo( xPoints[ 0 ], yPoints[ 0 ] ) ;
		
		// create the star -- this does not draw the star
		for ( int count = 1; count < xPoints.length; count++ )
			star.lineTo( xPoints[ count ], yPoints[ count ] );
		
		star.closePath();	// close the shape
		
		g2d.translate( 150, 150 );	// translate the origin to (150, 150)
		
		// rotate around the origin and draw the starts n random colors
		for ( int count = 1; count <= 20; count++ )
		{
			g2d.rotate( Math.PI / 10.0 );	// rotate coordinate system
			
			// set random drawing color
			g2d.setColor( new Color( random.nextInt( 256 ),
					random.nextInt( 256 ), random.nextInt( 256 ) ) );
			
			g2d.fill( star );		// draw filled star
		}	// end for loop
	}	// end class paintComponent
}	// end class Shapes2Panel