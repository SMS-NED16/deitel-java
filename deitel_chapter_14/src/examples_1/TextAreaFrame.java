// Example 4.22a - TextAreaFrame.java
// Copying selected text from one textarea to another
package examples_1;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame
{
	private JTextArea textArea1;		// displays demo string
	private JTextArea textArea2;		// highlighted text is copied here
	private JButton copyJButton;		// initiates copying of text
	
	// no-argument constructor
	public TextAreaFrame()
	{
		super( "TextArea Demo" );
		Box box = Box.createHorizontalBox();	// create box
		String demo = "This is a demo string to\nillustrate copying text"
				+ "\nfrom one textarea to \nanother textarea using an\n"
				+ "external event.";
		
		textArea1 = new JTextArea( demo, 10, 15 );	// create textArea1;
		textArea1.setLineWrap( true );
		box.add( new JScrollPane( textArea1 ) );
		
		
		copyJButton = new JButton( "Copy >>>" );
		box.add( copyJButton );				// add copy button to the box
		copyJButton.addActionListener(
			new ActionListener()
			{
				// set text in textArea2 to the text selected in textArea1
				public void actionPerformed( ActionEvent event )
				{
					textArea2.setText( textArea1.getSelectedText() );
				}	// end method actionPerformed
			}	// end anonymous inner class
		);	// end call to addActionListener
		
		textArea2 = new JTextArea( 10, 15 );	// create a second textarea
		textArea2.setEditable( false );			// disable editing
		textArea2.setLineWrap( true );
		box.add( new JScrollPane( textArea2 ) );	// add scrollpane
		
		add( box );		// add box to the frame
	}	// end constructor
}	// end class TextAreaFrame