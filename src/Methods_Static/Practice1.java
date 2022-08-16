package Methods_Static;

public class Practice1 {

	public static void main(String[]args){
		Lucky1(); // Calling Lucky1 static method from same class
		Lucky2(); // Calling Lucky2 static method from same class
		Practice2.Lucky3(100, 100);
		Practice2.Lucky3(25, 25);
		Practice2.Lucky4("lakshaman", "Mechanical1", 4, 'A', 60.75);
		Practice2.Lucky4("Anil","Mech", 4, 'A', 75.5);
		System.out.println("--------------------------------");
	   }

	public static void Lucky1() // zero parameter Lucky1 static method from same class
	   { 
		int a =500;
		int b =500;
		int C =a+b;
		int D =a-b;
		int E =a*b;
		int F =a/b;
		
		
        
		System.out.println(" addition is = "+C);
		System.out.println(" subtraction is = "+D);
		System.out.println(" multiplication is = "+E);
		System.out.println(" dividation is = "+F);
		System.out.println("----------------------------");
	   }
	public static void Lucky2() // zero parameter Lucky2 static method from same class
	   {
		String name = "Lakshaman";
		float height =5.5f;
		String DOB ="2nd June";
		char gender= 'M';

		System.out.println("My name is "+name);
		System.out.println("My height is "+height);
		System.out.println("My DOB is "+DOB);
		System.out.println("My gender is "+gender);
		System.out.println("----------------------------");
	   }
	  }	

