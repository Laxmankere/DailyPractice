package Assignment_2;

public class CS_P1 {
	
	String name;
	int marks;
	
	
	public CS_P1(String x,int y) 
	{
		name=x;
		marks=y;
	}
	
	

	public static void main(String[] args) 
	{
		
		CS_P1 c = new CS_P1("Lakshaman", 75);
		CS_P1 c1 = new CS_P1("Lucky", 85);
		
		c.display();
		c1.display();
		
				
	}
	public void display ()
	{
		System.out.println("name is "+name+" "+" mark "+marks);
	}

}
