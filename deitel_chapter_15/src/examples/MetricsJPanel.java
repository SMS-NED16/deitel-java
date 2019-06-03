// Example 15.4a - MetricsJPanel.java
// FontMetrics and Graphics methods useful for obtaining font metrics
package examples;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MetricsJPanel extends JPanel
{
	// display font metrics
	public void paintComponent( Graphics g )
	{
		// call superclass's paintComponent method to handle transparency
		super.paintComponent( g );	
		
		// Set font to SansSerif 12pt Bold, display font metrics
		g.setFont( new Font( "SansSerif", Font.BOLD, 12 ) );
		FontMetrics metrics = g.getFontMetrics();
		g.drawString( "Current Font: " + g.getFont(), 10, 30 );
		g.drawString( "Ascent: " + metrics.getAscent(), 10, 45 );
		g.drawString( "Descent: " + metrics.getDescent(), 10, 60 );
		g.drawString( "Height: " + metrics.getHeight(), 10, 75 );
		g.drawString( "Leading: " + metrics.getLeading(), 10, 90 );
		
		// update font to Serif 14pt Italic and display font metrics
		// THis time use a Font object to access Font (and indirectly, metrics)
		Font font = new Font( "Serif", Font.ITALIC, 14 );	// create Font
		metrics = getFontMetrics( font );	// get metrics
		g.setFont( font );		// update font
		g.drawString( "Current Font: " + font, 10, 120 );
		g.drawString( "Ascent: " + metrics.getAscent(), 10, 135 );
		g.drawString( "Descent: " + metrics.getDescent(), 10, 150 );
		g.drawString( "Height: " + metrics.getHeight(), 10, 165 );
		g.drawString( "Leading: " + metrics.getLeading(), 10, 180 );
	}	// end method paintComponent
}	// end class MetricsJPanel