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
import java.util.LinkedList;

public class ShapeExample
{
    public static void main(String [] args)
    {
        LinkedList<Shape> shapes = new LinkedList<Shape>();

        shapes.add(new Circle(4.5f));
        shapes.add(new Triangle(3.5f, 7.0f));
        shapes.add(new Square(2.5f));

        for (Shape shape : shapes)
            System.out.println(shape.calculateArea());        
    }
}