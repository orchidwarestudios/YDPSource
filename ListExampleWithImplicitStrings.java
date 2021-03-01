import java.io.*;
import java.util.*;

class ListExampleWithImplicitStrings
{
	public static void main(String args[])
	{
		LinkedList<String> items = 
			new LinkedList<String>();

		items.add("Rock");
		items.add("Paper");
		items.add("Scissors");

		System.out.println(items.getFirst());
		System.out.println(items.getLast());
	}
}