import java.io.*;
import java.util.LinkedList;

class ListExampleWithImplicitStrings
{
	public static void main(String args[])
	{
		LinkedList<String> items = 
			new LinkedList<String>();

		items.add("Rock");
		items.add("Paper");
		items.add("Scissors");

		for (String s : items)
			System.out.println(s);
	}
}