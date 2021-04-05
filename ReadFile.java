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
import java.nio.charset.Charset;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

// To run this file, download the file datafile.txt,
// create a directory C:/temp and place datafile.txt at
// C:/temp/datafile.txt
public class ReadFile
{
    public static void main(String args[])
    {
        Charset charset = Charset.forName("US-ASCII");

        try 
        {
            Path file = Paths.get("C://temp//datafile.txt");

            BufferedReader reader = 
                Files.newBufferedReader(file, charset);

            String line = null;

            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }    
    }
}