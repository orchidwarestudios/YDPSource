import java.io.*;
import java.util.Hashtable;

public class HashtableExample
{
	public static void main(String args[])
	{
		Hashtable<String, String> products = 
			new Hashtable<String, String>();

		products.put("id1", "Rhubarb");
		products.put("id2", "Prunes");
		products.put("id3", "Dragon Fruit");

		System.out.println(products.get("id2"));
		System.out.println(products.get("id3"));
		System.out.println(products.get("id1"));
	}
}