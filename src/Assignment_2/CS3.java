package Assignment_2;

public class CS3 {
	// example for user defined constructor with parameters
		int num1;
		int num2;
		int num3;
		
		public CS3() // user defined without parameters
		{
			num1=25;
			num2=25;
			num3=25;
		}
		
		public CS3(int a)// user defined with single parameter constructor 
		{
		num1=a;	
		}
		
		public CS3(int a, int b)// user defined with two parameter constructor
		{
			num1=a;
			num2=b;
			
		}
		
		public CS3(int a, int b, int c)
		{
			num1=a;
			num2=b;
			num3=c;
			
		}
		
		public static void main(String[] args) 
		{
			CS3 c1= new CS3();// object created with default value zero
			c1.addition();
			
			CS3 c2= new CS3(50);// object created with some default vaule
			c2.addition();
			
			CS3 c3= new CS3(50, 50);
			c3.addition();
			
			CS3 c4= new CS3(50, 50, 50);
			c4.addition();

		}

		public void addition()// non static method
		{
			int sum= num1+num2+num3;
			System.out.println("Addition is "+sum);
		}
}
		
