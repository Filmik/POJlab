package demo;

public class main 
{

	public static void main(String[] args) 
	{
		System.out.println("Poczatek");
		
		Car car= new Car();
		car.marka ="BMW";
		car.stan = true;
		car.przebieg =0;
		car.cena= 100000.99;
		
		car.printCar();
		
		// TODO Auto-generated method stub

	}

}
