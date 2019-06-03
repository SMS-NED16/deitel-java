// Example 14.13b - FlowLayoutDemo
// Testing FlowLayoutFrame
package examples_2;

import javax.swing.JFrame;

public class FlowLayoutDemo
{
	public static void main( String[] args )
	{
		FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
		flowLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		flowLayoutFrame.setSize( 300, 75 );
		flowLayoutFrame.setVisible( true );
	}	// end method main
}	// end class FlowLayoutDemo