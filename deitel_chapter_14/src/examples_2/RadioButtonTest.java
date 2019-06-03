// Example 14.6b - RadioButtonTest
// Testing RadioButtonFrame
package examples_2;

import javax.swing.JFrame;

public class RadioButtonTest
{
	public static void main( String[] args )
	{
		// instantiation
		RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
		
		// settings
		radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioButtonFrame.setSize( 300, 100 );
		radioButtonFrame.setVisible( true );
	}	// end method main
}	// end class RadioButtonTest