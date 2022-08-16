package Assignment_2;

	public class CS {
		// declaration
			int a;
			int b;
		    int c;

		
		  public CS()
		  {
			   a=5;
			   b=5;
			   c=5;
		  }
		    
		    
		    public CS(int x) // single parameterized
		{
			a=x;
		}

		public CS(int x, int y) //double parameter
		{
			a=x;
			b=y;	
		}
		public  CS(int x, int y,int z) //tripple parameter

		{
			a=x;
			b=y;
			c=z;
		}






		public static void main(String[]args) {

			CS c = new CS();
			c.Result();
		    CS c1 = new CS(30);
			c1.Result();
			CS c2 = new CS(30,40);
			c2.Result();
			CS c3 = new CS(50,50,50);
			c3.Result();
		
		}

		public void Result()
		{
			int add =a+b+c;
			System.out.println("addition is "+add);
		}
	}

	
