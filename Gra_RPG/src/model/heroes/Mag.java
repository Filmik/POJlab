package model.heroes;

public class Mag extends Hero
{
	
	public void Ustaw_si³a() 
	{
		if(exp>0)
		{
		int	si³a2=si³a;
		int exp2=exp;
		System.out.println("Podaj punkty si³y/2, exp="+exp);
		do {
		exp=exp2;
		si³a=si³a2;
		si³a= odczyt.nextInt();
		exp=exp - si³a;
		if(si³a%2==1 && si³a>0 ){
			si³a=si³a+1;}
		si³a=si³a/2;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		si³a=si³a+si³a2;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punktów exp");
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
			System.out.println("Brak punktów exp");
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
			System.out.println("Brak punktów exp");
		}
	}
	public void Ustaw_celnoœæ() 
	{
		if(exp>0)
		{
		int	pojemnik=celnoœæ;
		int exp2=exp;
		System.out.println("Podaj punkty celnoœci*2, exp="+exp);
		do {
		exp=exp2;
		celnoœæ=pojemnik;
		celnoœæ= odczyt.nextInt();
		exp=exp - celnoœæ;
		celnoœæ=celnoœæ*2;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		celnoœæ=celnoœæ+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punktów exp");
		}
	}
	public void Ustaw_zrêcznoœæ() 
	{
		if(exp>0)
		{
		int	pojemnik=zrêcznoœæ;
		int exp2=exp;
		System.out.println("Podaj punkty zrêcznoœci*1, exp="+exp);
		do {
		exp=exp2;
		zrêcznoœæ=pojemnik;
		zrêcznoœæ= odczyt.nextInt()*1;
		exp=exp - zrêcznoœæ;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		zrêcznoœæ=zrêcznoœæ+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punktów exp");
		}
	}
	public void Ustaw_szybkoœæ() 
	{
		if(exp>0)
		{
		int	pojemnik=szybkoœæ;
		int exp2=exp;
		System.out.println("Podaj punkty szybkoœci*1, exp="+exp);
		do {
		exp=exp2;
		szybkoœæ=pojemnik;
		szybkoœæ= odczyt.nextInt();
		exp=exp - szybkoœæ;
		if(exp<0) {
			System.out.println("Masz tylko "+exp2+" do wydania");
		}
		szybkoœæ=szybkoœæ+pojemnik;
		}while(exp<0);
			
		}else {
			System.out.println("Brak punktów exp");
		}
	}
	
}
