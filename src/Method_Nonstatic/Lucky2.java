package Method_Nonstatic;

public class Lucky2{

public static void main (String[]args)

{
	Lucky2 P2 = new Lucky2(null, 0, 0, 0, false);
	Lucky1 P1 = new Lucky1();// maddi
	P2.Lucky2("Megha", 16, 5.2f, 72, true); // calling from same class
	P1.Result(); // calling from same class
	P2.Lucky2("Pooja", 18, 5.1f, 73, true); // calling from same class

}

private void Lucky2(String string, int i, float f, int j, boolean b) {
	// TODO Auto-generated method stub
	
}

public   Lucky2(String name,int age,float height,float percentage, boolean result)

{
	System.out.println(" My name is "+name);
	System.out.println(" My age is "+age);
	System.out.println(" My height is "+height);
	System.out.println(" i got percentage "+percentage);
	System.out.println(" My result is "+result);
	System.out.println("---------------------------------");
}
}
