// Example 14.2a - LabelFrame.java
// Demonstrating the JLabel class
package examples_1;

import java.awt.FlowLayout;				// specifies how components are arranged
import javax.swing.JFrame;				// provides basic window features
import javax.swing.JLabel;				// displays text and images
import javax.swing.ImageIcon;			// loads images
import javax.swing.Icon;				// interface used to manipulate images
import javax.swing.SwingConstants;		// common constants used with Swing

public class LabelFrame extends JFrame
{
	// FIELDS
	private JLabel label1;		// just text
	private JLabel label2;		// constructed with text and icon
	private JLabel label3;		// with added text and icon
	
	// LabelFrame constructor adds JLabels to JFrame
	public LabelFrame()
	{
		// set the title of the JFrame using superclass constructor
		super( "Testing JLabel" );
		
		// set the layout of the JComponents in the Frame
		setLayout( new FlowLayout() );
		
		// JLabel constructor with a string argument
		label1 = new JLabel( "Label with text" );
		label1.setToolTipText( "This is label1" );
		add( label1 );			// add label1 to Frame
		
		// JLabel constructor with a string, Icon, and alignment
		Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) );
		label2 = new JLabel( "Label with text and icon", bug, 
				SwingConstants.LEFT );
		add( label2 );			// add label2 to Frame
		
		// JLabel constructor with no arguments
		label3 = new JLabel();
		label3.setText( "This is label 3" );
		label3.setIcon( new ImageIcon( getClass().getResource( "bug1.png" ) ) );
		label3.setHorizontalTextPosition( SwingConstants.CENTER );
		label3.setVerticalTextPosition( SwingConstants.BOTTOM );
		label3.setToolTipText( "This is label3" );
		add( label3 );			// add label3 to Frame
	}	// end LabelFrame constructor
}	// end class JFrame