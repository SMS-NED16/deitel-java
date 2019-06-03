// Example 14.7b - ComboBoxTest.java
// Testing ComboBoxFrame
package examples_2;

import javax.swing.JFrame;

public class ComboBoxTest
{
	public static void main( String[] args )
	{
		// instantiate a ComboBoxFrame object
		ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
		
		// set parameters
		comboBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		comboBoxFrame.setSize( 350, 150 );
		comboBoxFrame.setVisible( true );
	}	// end method main
}	// end class ComboBoxTest