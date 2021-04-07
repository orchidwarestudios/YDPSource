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

// From Parts 1 and 2 of "Inner Classes"
public class Member
{
    private String firstName;
    private String lastName;
    private String id;
    private Address address = null;
    
    public static void main(String args[])
    {
        Member m = new Member(
            "Roland",
            "Francisco",
            "12-345",
            "789 Imagination Way",
            "Zzyzx",
            "CA",
            "92309");        

        System.out.println(
            "First Name: " + m.getFirstName() + "\n" +
            "Last Name: " + m.getLastName() + "\n" +
            "Id: " + m.getId() + "\n" +
            "Street: " + m.getAddress().getStreet() + "\n" +
            "City: " + m.getAddress().getCity() + "\n" +
            "State: " + m.getAddress().getState() + "\n" +
            "Zip: " + m.getAddress().getZip());

    }
       
    public Member(
        String firstName, 
        String lastName, 
        String id,
        String street,
        String city,
        String state,
        String zip)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        this.address = new Address(street, city, state, zip);
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getId() { return id; }

    public Address getAddress() { return address; }

    public class Address
    {
        private String street;
        private String city;
        private String state;
        private String zip;

        public Address(String street, String city, String state, String zip)
        {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }
 
        String getStreet() { return street; }

        String getCity() { return city; }
  
        String getState() { return state; }

        String getZip() { return zip; }
    }
}