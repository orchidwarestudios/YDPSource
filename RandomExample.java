import java.lang.Math;

class RandomExample
{
	public static void main(String args[])
	{
		// Math.random() return a floating-point
		// number in the range of 0.0 to 1.0.
		double random = Math.random();
		
		// Normalize the random double to a number
		// within 1 to 10.
		int normalized = (int)(random * 10.0) + 1;

		System.out.println(
			"A random number between 1 and 10 is: " + 
			normalized);
	}
}

	
