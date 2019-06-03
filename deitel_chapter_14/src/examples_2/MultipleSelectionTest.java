// Example 14.8b - MultipleSelectionTest.java
// Testing MultipleSelectionFrame
package examples_2;

import javax.swing.JFrame;

public class MultipleSelectionTest
{
	public static void main( String[] args )
	{
		MultipleSelectionFrame msFrame = new MultipleSelectionFrame();
		
		msFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		msFrame.setSize( 350, 150 );
		msFrame.setVisible( true );
	}	// end method main	
}	// end class MultipleSelectionTest