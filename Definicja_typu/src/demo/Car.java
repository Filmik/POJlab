package demo;

public class Car 
{
	String marka;
	boolean stan;
	int przebieg;
	double cena;
	
	void printCar()
	{
		System.out.println("Marka: "+ marka);
		System.out.println("Stan: "+ stan);
		System.out.println("Przebieg: "+przebieg);
		System.out.println("Cena: "+ cena);
	}
	
	Car()
	{
		System.out.println("Inicjacja z nowego konstruktora");
	}
	
	Car(String brand)
	{
		this.marka=marka;
	}
	
	Car(String marka, boolean stan, int przebieg,double cena)
	{
		this(marka);
		this.stan=stan;
		this.przebieg=przebieg;
		this.cena=cena;
	}
	
}
