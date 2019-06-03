// Exercise 15.9a - RandomTriangles.java
// Draws randomly generated triangles in different colors using
// the GeneralPath and Graphics2D classes
package exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;
import java.util.Random;

public class RandomTriangles extends JPanel
{	
	// Random number generator
	private final static Random random = new Random();
	
	// Arbitrary number of triangles to draw
	private final static int MAX_SHAPES = 15;
	
	// number of triangles that will be drawn - init in constructor
	private int trianglesToDraw;
	
	// Array to store GeneralPaths for triangles
	private GeneralPath[] trianglePaths; 
	
	// Array to store color of each GeneralPath shape
	private Color[] triangleColors;
	
	
	// class constructor does the following
	// - generates a random number of triangles that will be draw
	// - generates random coordinates for each triangle's path
	// - adds the path to the array of triangle paths
	// - adds a randomized color to triangleColors for each triangle
	public RandomTriangles()
	{
		// Generate a random number of shapes to draw
		trianglesToDraw = 1 + random.nextInt( 1 + MAX_SHAPES ); 	// 1 - MAX_SHAPES triangles
		
		// create arrays for paths and colors with required number of elements
		// otherwise NullPointerException thrown
		trianglePaths = new GeneralPath[ trianglesToDraw ];
		triangleColors = new Color[ trianglesToDraw ];
		
		// Generate array of random triangular paths and corresponding colors
		for ( int i = 0; i < trianglesToDraw; i++ )
		{
			trianglePaths[ i ] = getRandomTrianglePath();
			triangleColors[ i ] = getRandomColor();
		}	// end for loop to generate random paths and colors
	}	// end constructor
	
	
	// paintComponent called every time the panel has to be rendered
	public void paintComponent( Graphics g )
	{
		// call superclass' paintComponent method
		super.paintComponent( g );
		
		// Cast the Graphics object to Graphics2D for using Java2D API
		Graphics2D g2d = ( Graphics2D ) g;
		
		// iterate over path and color arrays simultaneously to 
		// draw the paths in the specified color
		for ( int i = 0; i < MAX_SHAPES; i++ )
		{
			g2d.setPaint( triangleColors[ i ] );
			g2d.fill( trianglePaths[ i ] );
		}	// end for loop
	}	// end method paintComponent
	

	
	// returns a GeneralPath object in the shape of a triangle
	private GeneralPath getRandomTrianglePath()
	{
		// get set of x-coordinates for this path
		int[] pathX = getRandomCoordinates();
		
		// get set of y-coordinates for this path
		int[] pathY = getRandomCoordinates();
		
		// create a GeneralPath for the triangle
		GeneralPath triangle = new GeneralPath();
		
		// move to the initial point in the path coordinates
		triangle.moveTo( pathX[ 0 ], pathY[ 0 ] );
		
		// create the triangular path
		for ( int count = 1; count < pathX.length; count++ )
		{
			triangle.lineTo( pathX[ count ], pathY[ count ] );
		}
		
		// close the path
		triangle.closePath();
	
		// return the triangular path
		return triangle;
	}	// end method getRandomTrianglePath
	
	
	// returns set of 3 coordinates for a GeneralPath defining a triangle
	private int[] getRandomCoordinates() 
	{
		// create a new integer array to store 3 random x or y coordinates
		int[] resultArray = new int[ 3 ];
		
		// iterate over array, assigning random int value to each element
		for ( int i = 0; i < resultArray.length; i++ )
			resultArray[ i ] = random.nextInt( 300 );	// arbitrary dimension choice - must fix
		
		// return the element
		return resultArray;
	}	// end method getRandomCoordinates
	

	// returns a random color
	private Color getRandomColor()
	{
		return new Color( random.nextInt( 256 ),random.nextInt( 256 ), 
				random.nextInt( 256 ) );
	}	// end method getRandomColor
}	// end class RandomTriangles