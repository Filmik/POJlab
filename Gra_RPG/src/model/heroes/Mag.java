package model.heroes;

public class Mag extends Hero
{
	
	public void Ustaw_si�a() 
	{
		if(exp>0)
		{
		int	si�a2=si�a;
		int exp2=exp;
		System.out.println("Podaj punkty si�y/2, exp="+exp);
		do {
		exp=exp2;
		si�a=si�a2;
		si�a= odczyt.nextInt();
		exp=exp - si�a;
		if(si�a%2==1 && si�a>0 ){
			si�a=si�a+1;}
		si�a=si�a/2;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		si�a=si�a+si�a2;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punkt�w exp");
		}
	}
	
	public void Ustaw_obrona() 
	{
		if(exp>0)
		{
		int	pojemnik=obrona;
		int exp2=exp;
		System.out.println("Podaj punkty obronz*1, exp="+exp);
		do {
		exp=exp2;
		obrona=pojemnik;
		obrona= odczyt.nextInt();
		exp=exp - obrona;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		obrona=obrona+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punkt�w exp");
		}
	}
	
	public void Ustaw_inteligencja() 
	{
		if(exp>0)
		{
		int	pojemnik=inteligencja;
		int exp2=exp;
		System.out.println("Podaj punkty inteligencji*3, exp="+exp);
		do {
		exp=exp2;
		inteligencja=pojemnik;
		inteligencja= odczyt.nextInt();
		exp=exp - inteligencja;
		inteligencja=inteligencja*3;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		inteligencja=inteligencja+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punkt�w exp");
		}
	}
	public void Ustaw_celno��() 
	{
		if(exp>0)
		{
		int	pojemnik=celno��;
		int exp2=exp;
		System.out.println("Podaj punkty celno�ci*2, exp="+exp);
		do {
		exp=exp2;
		celno��=pojemnik;
		celno��= odczyt.nextInt();
		exp=exp - celno��;
		celno��=celno��*2;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		celno��=celno��+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punkt�w exp");
		}
	}
	public void Ustaw_zr�czno��() 
	{
		if(exp>0)
		{
		int	pojemnik=zr�czno��;
		int exp2=exp;
		System.out.println("Podaj punkty zr�czno�ci*1, exp="+exp);
		do {
		exp=exp2;
		zr�czno��=pojemnik;
		zr�czno��= odczyt.nextInt()*1;
		exp=exp - zr�czno��;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		zr�czno��=zr�czno��+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punkt�w exp");
		}
	}
	public void Ustaw_szybko��() 
	{
		if(exp>0)
		{
		int	pojemnik=szybko��;
		int exp2=exp;
		System.out.println("Podaj punkty szybko�ci*1, exp="+exp);
		do {
		exp=exp2;
		szybko��=pojemnik;
		szybko��= odczyt.nextInt();
		exp=exp - szybko��;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		szybko��=szybko��+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punkt�w exp");
		}
	}
	
}
