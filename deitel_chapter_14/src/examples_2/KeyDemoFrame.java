// Example 14.12a - KeyDemoFrame.java
// Demonstrating keystroke events
package examples_2;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener
{
	private String line1 = "";		// first line of TextArea
	private String line2 = "";		// second line of TextArea
	private String line3 = "";		// third line of TextArea
	private JTextArea textArea;		// TextArea to display output
	
	// KeyDemoFrame constructor
	public KeyDemoFrame()
	{
		super( "Demonstrating Keystroke Evenets" );
		
		textArea = new JTextArea( 10, 15 );	// set up JTextArea
		textArea.setText( "Press any key on the keyboard..." );
		textArea.setEnabled( false );	// disable textArea
		textArea.setDisabledTextColor( Color.BLACK );	// set text color
		add( textArea );		// add textarea to JFrame
		
		addKeyListener( this );		// allow frame to process key events
	}	// end constructor KeyDemoFrame 
	
	// handle press of any key
	public void keyPressed( KeyEvent event )
	{
		line1 = String.format( "Key Pressed: %s", 
				KeyEvent.getKeyText( event.getKeyCode() ) );	// show pressed key
		setLines2and3( event );		// set output lines 2 and 3
	}	// end method keyPressed
	
	// handle release of any key
	public void keyReleased( KeyEvent event )
	{
		line1 = String.format( "Key Released: %s", 
				KeyEvent.getKeyText( event.getKeyCode() ) );
		setLines2and3( event );
	}	// end method keyReleased
	
	// handle press of an action key
	public void keyTyped( KeyEvent event )
	{
		line1 = String.format( "Key Typed: %s", event.getKeyChar() );
		setLines2and3( event );	// set output lines two and three
	}	// end method keyTyped
	
	// set second and third lines of output
	private void setLines2and3( KeyEvent event )
	{
		line2 = String.format( "This key is %san action key",
				( event.isActionKey() ? "" : "not " ) );
		String temp = KeyEvent.getKeyModifiersText( event.getModifiers() );
		
		line3 = String.format( "Modifier keys pressed: %s", 
				( temp.equals( "" ) ? "none" : temp ) );	// output modifiers
		
		textArea.setText( String.format( "%s\n%s\n%s\n", 
				line1, line2, line3 ) );	// output three lines of text
	}	// end method setLines2and3
}	// end class KeyDemoFrame