// Example 15.1a - ColorJPanel.java
// Demonstrating Colors
package examples;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel
{
	// draw rectangles and Strings in different colors
	public void paintComponent( Graphics g )
	{
		// call superclass's version of paintComponent
		super.paintComponent( g );	
		
		// set background color to white for this instance of JPanel
		this.setBackground( Color.WHITE );	
		
		// set new drawing color using integers
		g.setColor( new Color( 255, 0, 0 ) );
		g.fillRect( 15, 25, 100, 20 );
		g.drawString( "Current RGB: " + g.getColor(), 130, 40 );
		
		// set new drawing color using floats
		g.setColor( new Color( 0.50f, 0.75f, 0.0f ) );
		g.fillRect( 15, 50, 100, 20 );
		g.drawString( "Current RGB: " + g.getColor(), 130, 65 );
		
		// set new drawing color using static color objects
		g.setColor( Color.BLUE );
		g.fillRect( 15, 75, 100, 20 );
		g.drawString( "Current RGB: " + g.getColor(), 130, 90 );
		
		// display individual RGB values
		Color color = Color.MAGENTA;
		g.setColor( color );
		g.fillRect( 15, 100, 100, 20 );
		g.drawString( "RGB Values: " + color.getRed() + ", "
				+ color.getBlue() + ", " + color.getGreen(), 130, 115 );
	}	// end method paintComponent
}	// end class ColorJPanel