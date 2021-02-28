import java.io.*;
import java.util.*;

class ListExampleWithExplicitStrings
{
	public static void main(String args[])
	{
		LinkedList<String> items = 
			new LinkedList<String>();

		items.add(new String("Rock"));
		items.add(new String("Paper"));
		items.add(new String("Scissors"));

		System.out.println(items.getFirst());
		System.out.println(items.getLast());
	}
}