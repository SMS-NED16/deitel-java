// Example 14.6b - RadioFrameTest.java
// Testing JRadioButtons application
package examples_1;

import javax.swing.JFrame;

public class RadioFrameTest
{
	public static void main( String[] args )
	{
		RadioButtonFrame radioFrame = new RadioButtonFrame();
		radioFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioFrame.setSize(300, 100 );
		radioFrame.setVisible( true );
	}	// end method main
}	// end class RadioFrameTest