package This_Super_keyword;

public class A extends B {

	String name ="Laxman1";
	int Num= 22343;
	static String Position="tester";

public static void main(String[]args)

{
A a = new A();
a.disply();
}
 public void disply()

{
 String name = "Laxman2";
 int Num = 12344;
  int num1=51;

System.out.println("Local "+name);
System.out.println("local "+Num);
System.out.println("Local Static "+num1);
System.out.println("============================");

System.out.println("Global "+this.name);
System.out.println("Global "+this.Num);
System.out.println("Global Static  "+this.Position);
System.out.println("===================================");

System.out.println("this is Super "+super.name);
}
}