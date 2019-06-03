// Example 15.8b - DrawPolygons.java
// Drawing polygons
package examples;

import javax.swing.JFrame;

public class DrawPolygons
{
	public static void main( String[] args )
	{
		// create frame for PolygonsJPanel
		JFrame frame = new JFrame( "Drawing Polygons" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		PolygonPanel polygonPanel = new PolygonPanel();
		frame.add( polygonPanel );
		frame.setSize( 280, 270 );
		frame.setVisible( true );
	}	// end method main
}	// end class DrawPolygons