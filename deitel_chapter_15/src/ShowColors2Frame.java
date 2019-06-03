// Example 15.2a - ShowColors2Frame.java
// Choosing colors with JColorChooser
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2Frame extends JFrame
{
	private JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel;
	
	// set up GUI
	public ShowColors2Frame()
	{
		super( "Using JColorChooser" );		// set title using superclass constructor
		
		// create JPanel for display color
		colorJPanel = new JPanel();
		colorJPanel.setBackground( color );	// initially, LIGHT_GRAY bg
		
		// set up changeColorJButton and register its event handler
		changeColorJButton = new JButton( "Change Color" );
		changeColorJButton.addActionListener(
				new ActionListener() 
				{
					// display JColorChooser when user clicks button
					public void actionPerformed( ActionEvent event )
					{
						color = JColorChooser.showDialog(
								ShowColors2Frame.this, "Choose a color", color );
						
						// set the default color if no color is returned
						if ( color == null )
							color = Color.LIGHT_GRAY;
						
						// change content pane's background color
						colorJPanel.setBackground( color );
					}	// end method actionPerformed
				}	//	end anonymous inner class ActionListener
		);	// end call to addActionListener
		
		add( colorJPanel, BorderLayout.CENTER );		// add colorJPanel
		add( changeColorJButton, BorderLayout.SOUTH );	// add button
		
		setSize( 400, 130 );		// set frame size
		setVisible( true );			// display frame
	}	// end constructor
}	// end class ShowColors2Frame