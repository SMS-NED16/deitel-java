// Example 14.3a - TextFieldFrame.java
// Demonstrating the JTextField class
package examples_2;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{
	// FIELDS
	private JTextField textField1;			// text field with set size
	private JTextField textField2;			// text field constructed with text
	private JTextField textField3;			// text field with text and size
	private JPasswordField passwordField;	// password field with texdt

	// TextFieldFrame constructor adds JTextFields to JFrame
	public TextFieldFrame()
	{
		super( "Testing JTextField and JPasswordField" );
		setLayout( new FlowLayout() );		// set Frame layout

		// construct textField with 10 columns
		textField1 = new JTextField( 10 );
		add( textField1 );					// add textField1 to JFrame

		// construct textField with default text
		textField2 = new JTextField( "Enter text here" );
		add( textField2 );					// add textField2 to JFrame

		// construct textField with default text and 21 columns
		textField3 = new JTextField( "Uneditable text field", 21 );
		textField3.setEditable( false );	// disable editing 
		add( textField3 );					// add textField3 to JFrame

		// construct passwordField with default text
		passwordField = new JPasswordField( "Hidden text" );
		add( passwordField );				// add passwordField to JFrame

		// register event handlers
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener( handler );
		textField2.addActionListener( handler );
		textField3.addActionListener( handler );
		passwordField.addActionListener( handler );
	}	// end no-argument TextFieldFrame constructor

	// private inner class for event handling
	private class TextFieldHandler implements ActionListener
	{
		// process text field events
		public void actionPerformed( ActionEvent event )
		{
			String string = "";				// declare String to display

			// user pressed Enter in JTextField textField1
			if ( event.getSource() == textField1 )
				string = String.format( "textField1: %s", 
					event.getActionCommand() );

			// user pressed Enter in JTextField textField2
			if ( event.getSource() == textField2 )
				string = String.format( "textField2: %s", 
					event.getActionCommand() );

			// user pressed Enter in JTextField textField3
			if ( event.getSource() == textField3 )
				string = String.format( "textField3: %s", 
					event.getActionCommand() );

			// user pressed Enter in JTextField passwordField
			if ( event.getSource() == passwordField )
				string = String.format( "passwordField: %s", 
					event.getActionCommand() );

			// display JTextField content in a Dialog Box
			JOptionPane.showMessageDialog( null, string );
		}	// end method actionPerformed
	}	// end private class TextFieldHandler
}	// end class TextFieldFrame