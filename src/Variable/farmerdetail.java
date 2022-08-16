package Variable;

public class farmerdetail{

public static void main(String[]args){

	farmer O1 = new farmer();
	
	O1.name= "dadarao";
	O1.age=50;
	O1.gender='M';
	O1.crop="kapus";
	O1.amount=100000;
	
	farmer s = new farmer();
	s.name="Subhash";
	s.age=45;
	s.gender='M';
	s.crop="soyabin";
	s.amount=200000;
	
	O1.farmers();
	s.farmers();
	
	
}
}
