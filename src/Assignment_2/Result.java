package Assignment_2;

public class Result {

	String physics;

     int marks;


public Result(String sub,int m)
{
	physics=sub;
	marks=m;
}

void info()
{
System.out.println("sub "+physics+" " +"marks "+marks);
}
public static void main(String[]args){

Result r = new Result("physics", 90);

Result r1 = new Result("chemistry",80);
r.info();
r1.info();

}
}