package exercise1;


import java.util.Scanner;


public class UniTester 
{
    public static UEmployee assign() 
    {
        Scanner input = new Scanner(System.in);

    	System.out.println("Enter employee first name");
    	
    	String fn = input.next();
    	System.out.println("Enter employee last name");
    	String ln = input.next();
    	 System.out.println("Enter employee salary");
    	 
    	 double sal = input.nextDouble();
		
    	 System.out.println("Enter employee type: Faculty or Staff");
    	  String empT;
    	  empT = input.next();
    	  if(empT.equalsIgnoreCase("F")) 
    	  {
    		  System.out.println("Enter Department name");
    		  String d = input.next();
    		
    		  return new Faculty(fn, ln, sal, d);
    		  
    		  
    	  } 
    	  else 
    	  {
    		  System.out.println("Enter Job title");
    		  String jb = input.next();
    		  return new Staff(fn, ln, sal, jb);
    		  
    		 
    		  
    	  }  	
    			
    }
    
   
	
	
	
	
	public static void main(String[] args) 
    {
      UEmployee emp1, emp2, emp3;
      
      //creat employees for the university
      
      emp1 = assign() ;
      emp2 = assign();
      emp3 = assign();
      
      
      System.out.println("University Employees: ");
      
      System.out.println(emp1);
      System.out.println(emp2);
      System.out.println(emp3);
      
      
      
}
}
