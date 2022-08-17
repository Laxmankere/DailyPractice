package Assignment_2;

public class Constr {
	String emp_id;
	int pfno;
	long acc;

// hellow chanages done please check
	public Constr(String a)
	{
		emp_id="55555";
	}

	public Constr(String a, int b)

	{
	    emp_id="666666";
		pfno= 3483;
	}
	public Constr(String a, int b,long c)
	{
		emp_id="666666";
		pfno= 3483;
	    acc=46948987632l;
	}
//---comment -clone--1708

	public static void main (String[]args){

	 	Constr c= new Constr("12345");
		Constr c1= new Constr("54321",4444);
		Constr c2= new Constr("56789",5555,92919292929l);
		c.Details();
		c1.Details();
		c2.Details();
	}

	public void Details()
	{
	System.out.println("My Emp Id "+emp_id +" "+ " My PFNO is "+pfno +" "+"My Acc No is " +acc);
	System.out.println("=============================================================================");
	}
}