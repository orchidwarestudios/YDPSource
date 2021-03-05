import java.lang.Math;

class RandomExample
{
	public static void main(String args[])
	{
		double random = Math.random();
		int normalized = (int)(random * 10.0) + 1;

		System.out.println(
			"A random number between 1 and 10 is: " + 
			normalized);
	}
}

	