//// Exercise 16.3 - RandomSentences.java
//// Generates random sentences using arrays and StringBuilder
//package exercises_16;
//
//import java.util.Random;
//
//public class RandomSentences 
//{
//	// Arrays to store articles, nouns, verbs, and prepositions
//	public static final String[] ARTICLES = { "the", "a", "one", "some", "any" };
//	public static final String[] NOUNS = { "boy", "girl", "dog", "town", "car" };
//	public static final String[] VERBS = { "drove", "jumped", "ran", "walked", "skipped" };
//	public static final String[] PREOPOSITIONS = { "to", "from", "over", "under", "on" };
//	
//	// Random number generator used in this class
//	public static final Random randomNumber = new Random();
//	
//	// Storing length of each sentence component array as a constant
//	public static final int OPTIONS = 5;
//	public static void main( String[] args )
//	{
//		StringBuilder sentence = new StringBuilder();
//		
//	}	// end method main
//	
//	public static String makeSentence( StringBuilder newSentence ) 
//	{
//		int[] sentenceOptions = getRandomIndexes();
//		System.out.printf( "Article = %d\t%s\n", 
//				sentenceOptions[ 0 ], ARTICLES[ sentenceOptions[ 0 ] ] );
//		System.out.printf( "Noun = %d\t%s\n", 
//				sentenceOptions[ 1 ], NOUNS[ sentenceOptions[ 1 ] ] );
//		System.out.printf( "Verb = %d\t%s\n", 
//				sentenceOptions[ 2 ], VERBS[ sentenceOptions[ 2 ] ] );
//		System.out.printf( "Preposition ")
//	}
//	
//	public static int[] getRandomIndexes() 
//	{
//		int[] randomIndexes = new int[ 5 ];
//		for ( int i = 0; i < randomIndexes.length; i++ )
//			randomIndexes[ i ] = randomNumber.nextInt( 5 );
//		return randomIndexes;
//	}	// end method getRandomIndexes
//}	// end class RandomSentences