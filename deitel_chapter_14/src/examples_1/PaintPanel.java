// Exercise 14.13a - PaintPanel.java
// Using class MouseMotionAdapter
package examples_1;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel
{
	private int pointCount = 0;		// number of points on panel
	
	// array of 10000 java.awt.Point references
	private Point[] points = new Point[ 10000 ];
	
	// set up GUI and register mouse event handler
	public PaintPanel()
	{
		// handle frame mouse motion event
		addMouseMotionListener(
			new MouseMotionAdapter()	// anonymous inner class
			{
				// store drag coordinates and repaint
				public void mouseDragged( MouseEvent event )
				{
					if ( pointCount < points.length )
					{
						points[ pointCount ] = event.getPoint();	// find point
						++pointCount;		// increment number of points inarray
						repaint();			// repaint JFrame
					}	// end if 
				}	// end method mouseDragged
			}	// end anonymous inner class
		);	// end call to addMouseMotionListener
	}	// end constructor
	
	
	// draws ovals in a 4px-by-4px bounding box at specified locations on window
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );			// clear drawing area - superclass call
		
		// draw all points in array
		for ( int i = 0; i < points.length; i++ )
			g.fillOval( points[ i ].x, points[ i ].y, 4, 4 );
	}	// end method paintComponent
}	// end class PaintPanel