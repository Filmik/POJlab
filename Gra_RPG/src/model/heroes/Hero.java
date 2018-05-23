package model.heroes;

import java.util.Scanner;

public class Hero 
{
	
	protected String imie;
	
	Scanner odczyt = new Scanner(System.in);
	
	protected int si³a;
	protected int obrona;
	protected int inteligencja;
	protected int celnoœæ;
	protected int zrêcznoœæ;
	protected int szybkoœæ;
	
	protected int exp=50;
	protected int level=1;
	
	public int Podaj_si³e(){
		return si³a;}
	
	public int Podaj_obrona(){
		return obrona;}
	
	public int Podaj_inteligencja(){
		return inteligencja;}
	
	public int Podaj_celnoœæ(){
		return celnoœæ;}
	
	public int Podaj_zrêcznoœæ(){
		return zrêcznoœæ;}
	
	public int Podaj_szybkoœæ(){
		return szybkoœæ;}
	
	public String Podaj_imie(){
		return imie;}
	
	public int Podaj_exp(){
		return exp;}
	
	public int Podaj_level(){
		return level;}
	
	public void Ustaw_exp(int exp) 
	{
		this.exp=exp;
	}
	
	public void Level_Up()
	{
		exp+=10;
		level+=1;
	}
	
	public void Ustaw_imie() 
	{
		System.out.println("Podaj imie maga");
		imie = odczyt.nextLine();
	}
	
	public void Statystyki_Bohatera() 
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println(Podaj_imie());
		System.out.println("Level: "+Podaj_level()+"\t|"
				+"si³: "+Podaj_si³e()+"\t|"
				+"obr: "+Podaj_obrona()+"\t|"
				+"int: "+Podaj_inteligencja()+"\t|"
				+"cel: "+Podaj_celnoœæ()+"\t|"
				+"zrê: "+Podaj_zrêcznoœæ()+"\t|"
				+"szyb: "+Podaj_szybkoœæ());
		System.out.println("--------------------------------------------------------------------");
	}
}
