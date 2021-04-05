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
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

// To run this file, make sure there is a directory
// C://temp in your file system.
public class WriteFile
{
    public static void main(String args[])
    {
        String s = "This text will be appended to the end of the file\n";
        byte [] data = s.getBytes();

        Path p = Paths.get("C://temp//log.txt");

        try
        {
            OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND));

            out.write(data, 0, data.length);
            out.flush();
            out.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}