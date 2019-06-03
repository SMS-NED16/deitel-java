// Example 14.10a - MouseTrackerFrame.java
// Demonstrating Mouse Events
package examples_1;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame
{
	private JPanel mousePanel;		// panel in which mouse events will occur
	private JLabel statusBar;		// label that displays event information
	
	// MouseTrackerFrame constructor sets up GUI and registers event handlers
	public MouseTrackerFrame()
	{
		super( "Demonstrating Mouse Events" );
		
		mousePanel = new JPanel();	// create panel
		mousePanel.setBackground( Color.WHITE );	// set background color
		add( mousePanel, BorderLayout.CENTER );		// add panel to center of JFrame
		
		statusBar = new JLabel( "Mouse outside JPanel" );
		add( statusBar, BorderLayout.SOUTH );		// add label to JFrame
		
		// create and register listener for mouse and mouse motion events
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener( handler );
		mousePanel.addMouseMotionListener( handler );
	}	// end constructor
	
	
	// private inner class to implement Mouse interfaces
	private class MouseHandler implements MouseListener, MouseMotionListener
	{
		// MOUSE LISTENER EVENT HANDLERS
		// handle event when mouse released immediately after press
		public void mouseClicked( MouseEvent event )
		{
			statusBar.setText( String.format( "Clicked at [%d, %d]",
					event.getX(), event.getY() ) );
		}	// end method mouseClicked
		
		// handle event when mouse pressed
		public void mousePressed( MouseEvent event )
		{
			statusBar.setText( String.format( "Pressed at [%d, %d]", 
					event.getX(), event.getY() ) );
		}	// end method mousePressed
		
		// handle event when mouse released
		public void mouseReleased( MouseEvent event )
		{
			statusBar.setText( String.format( "Released at [%d, %d]",
					event.getX(), event.getY() ) );
		}	// end method mouseReleased
		
		// handle event when mouse enters area
		public void mouseEntered( MouseEvent event )
		{
			statusBar.setText( String.format( "Entered at [%d, %d]", 
					event.getX(), event.getY() ) );
			mousePanel.setBackground( Color.GREEN );
		}	// end method mouseEntered	
		
		// handle event when mouse exits area
		public void mouseExited( MouseEvent event )
		{
			statusBar.setText( String.format( "Exited at [%d, %d]", 
					event.getX(), event.getY() ) );
			mousePanel.setBackground( Color.WHITE );  
		}	// end method mouseExited
		
		// MOUSE MOTION LISTENER EVENT HANDLERS
		// handle event when user drags mouse with button pressed
		public void mouseDragged( MouseEvent event )
		{
			statusBar.setText( String.format( "Dragged at: [%d, %d]",
					event.getX(), event.getY() ) );
		}	// end method mouseDragged
		
		// handle event when user moves mouse
		public void mouseMoved( MouseEvent event )
		{
			statusBar.setText( String.format( "Moved at [%d, %d]", 
					event.getX(), event.getY() ) );
		}	// end method mouseMoved
	}	// end private inner class MouseHandler
}	// end class MouseTrackerFrame