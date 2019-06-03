// Example 14.16b - TextAreaDemo.java
// Copying selected text from one textarea to another
package examples_2;

import javax.swing.JFrame;

public class TextAreaDemo
{
	public static void main( String[] args )
	{
		TextAreaFrame textAreaFrame = new TextAreaFrame();
		textAreaFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		textAreaFrame.setSize( 425, 200 );
		textAreaFrame.setVisible( true );
	}	// end method main
}	// end class TextAreaDemo