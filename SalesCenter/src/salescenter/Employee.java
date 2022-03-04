/*

Program: Employee.java          Last Date of this Revision: 13-Oct-2020

Purpose: 

Author: Your Name 
School: CHHS
Course: Computer Programming ??
 

*/

package salescenter;


public abstract class Employee 
{
    String firstName, lastName;
    
    public Employee(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }
    
    public String toString()
    {
        return(firstName+" "+lastName);
    }
    
    abstract double pay(double period);

}

/* Screen Dump
 

 
 */
