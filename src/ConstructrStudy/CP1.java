package ConstructrStudy;

public class CP1{

	// Kisan Bima Sceme Nanded
	// name,age,land,gender,village,amount,crop
	// variable declaration
		
		String name;
		byte age;
		char gender;
		String land;
		String village;
		int amount;
		String crop;


	public static void main (String[]args){
		CP1 O1 = new CP1();  // object for CP1 constructor
		CP2 O2 = new CP2();  // object for CP2 constructor
		
		demo();              // calling static method
	 	O1.demo1();          // calling Non static method

	}
	public CP1()

	{
		// variable assigning

		name="Dadarao";	
		age=50;
		gender='M';
		land="5 acres";
		village="Yedur";
		amount=50000;
		crop="kapas";

		// usage or printing output
		
		System.out.println(" Farmer name is "+name);
		System.out.println(" Farmer age is "+age);
		System.out.println(" Farmer gender is "+gender);
		System.out.println(" Farmer land is "+land);
		System.out.println(" Farmer village name is "+village);
		System.out.println(" Farmer bima amount  is "+amount+" Rupees");
		System.out.println(" Farmer name is "+name);
		System.out.println(" Farmer crop is "+crop);
		System.out.println(" ---------------------------");
	}
	
	public static void demo()
	{
		System.out.println("  Hi iam static demo method from same class ");
		System.out.println("-----------------------------");
	}
	public void demo1()
	{ 
		System.out.println("  Hi iam non static demo1 method from same class ");
	}
	}
	