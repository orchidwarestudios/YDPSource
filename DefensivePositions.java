/*****************************************************************************
The MIT License (MIT)
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

/*****************************************************************************
 For more information, visit us at http://orchidwarestudios.com 
*****************************************************************************/

import java.io.*;

class DefensivePositions
{
	public static void main(String args[])
	{
		DefensivePositions dp = new DefensivePositions();
		System.out.println(dp.translate(2));
		System.out.println(dp.translate(3));
		System.out.println(dp.translate(6));
		System.out.println(dp.translate(8));
	}	

	/** 
	* This code uses Java 12-style features 
	* and needs special commands to run it.
	* To compile, enter the following on the command line
	*   javac --release 12 --enable-preview DefensivePositions.java
	* To run, enter the following on the command line
	*   java --enable-preview DefensivePositions
        */
	public String translate(int position)
	{
		return switch (position)
		{
			case 1, 2 ->
			{
				break "Battery";
			}

			case 3, 5 ->
			{
				break "Corner Infielder";
			}
	
			case 4, 6 ->
			{
				break "Middle Infielder";
			}

			case 7, 8, 9 ->
			{
				break "Outfielder";
			}

			default ->
			{
				break "INVALID";
			}
		};
	}
}