// Example 15.3b - Fonts.java
// Using fonts
import javax.swing.JFrame;

public class Fonts 
{
	public static void main( String[] args )
	{
		// create frame for FontJPanel
		JFrame frame = new JFrame( "Using Fonts" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		FontJPanel fontJPanel = new FontJPanel();	
		frame.add( fontJPanel );
		frame.setSize( 420, 150 );
		frame.setVisible( true );
	}	// end method main
}	// end class Fonts