/*****************************************************************************
Copyright (c) 2021 Orchidware Studios LLC

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*****************************************************************************/
import java.io.*;

public class StringComparisonExample
{
	public static void main(String args[])
	{
		// Placed in Heap
		String s1 = new String("Hello");
		String s2 = new String("World");

		// Placed in String Constant Pool
		String s3 = "Hello";
		String s4 = "World";

		String s5 = new String("Hello");

		// Compares memory references
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		// Compare contents of Objects
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s4.intern()));
	}
}