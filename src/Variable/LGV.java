package Variable;

public class LGV { 

	int a=40;
	static int b=50;

public static void main(String[]args){

	LGV O1 = new LGV();
	LGV1 O2 = new LGV1();
	System.out.println(" calling global "+O1.a);
	System.out.println(" calling global static "+b);
	System.out.println("-----------------------------");
	System.out.println(" My name is "+LGV1.name);
	System.out.println(" My height is "+O2.height);
	System.out.println("---------------------------------------");
	O1.dispaly1();
	
	display();
	LGV1.sample();
	O2.sample1();

	
}
	public static void display()

{
 	int add=100+b;
	int sub=100-b;

        System.out.println(" Addition is "+add);
        System.out.println(" Subtraction  is "+sub);
        System.out.println("--------------------------------");

}

	public void dispaly1()

{
	int mul=a*b;
	int div=b/a;

	System.out.println(" Multiplicatin is "+mul);
	System.out.println(" div is "+div);
	System.out.println("-----------------------------------");
}
}