package myproject;

public class main extends vehicle {
	
	public main(int year,String model,String make) {
		super(year,model,make);
		
	}
	
	public static void main(String [] args) {
		
		car c1=new car(2002,"AUDI","chevy",4);
		c1.display();
		
		motorcycle m1=new motorcycle(2003,"SUZUKI","Harley",200);
		m1.display();
		
		
		
	}

}
