import java.io.*;
import java.util.*;

class ListExampleWithExplicitStrings
{
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add(new String("One"));
		list.add(new String("Two"));
		list.add(new String("Three"));

		for (String s : list)
			System.out.println(s);
	}
}