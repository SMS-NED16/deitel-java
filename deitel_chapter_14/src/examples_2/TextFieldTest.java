// Example 14.3b - TextFieldTest.java
// Testing TextFieldFrame
package examples_2;

import javax.swing.JFrame;

public class TextFieldTest
{
	public static void main( String[] args )
	{
		// instantiate a TextFieldFrame object to create/render a window
		TextFieldFrame textFieldFrame = new TextFieldFrame();

		// Use JFrame boilerplate to setup textFieldFrame
		textFieldFrame.setSize( 350, 100 );
		textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		textFieldFrame.setVisible( true );
	}	// end method main
}	// end class TextFieldFrame