package model.heroes;

import java.util.Scanner;

public class Hero 
{
	
	protected String imie;
	
	Scanner odczyt = new Scanner(System.in);
	
	protected int si�a;
	protected int obrona;
	protected int inteligencja;
	protected int celno��;
	protected int zr�czno��;
	protected int szybko��;
	
	protected int exp=50;
	protected int level=1;
	
	public int Podaj_si�e(){
		return si�a;}
	
	public int Podaj_obrona(){
		return obrona;}
	
	public int Podaj_inteligencja(){
		return inteligencja;}
	
	public int Podaj_celno��(){
		return celno��;}
	
	public int Podaj_zr�czno��(){
		return zr�czno��;}
	
	public int Podaj_szybko��(){
		return szybko��;}
	
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
				+"si�: "+Podaj_si�e()+"\t|"
				+"obr: "+Podaj_obrona()+"\t|"
				+"int: "+Podaj_inteligencja()+"\t|"
				+"cel: "+Podaj_celno��()+"\t|"
				+"zr�: "+Podaj_zr�czno��()+"\t|"
				+"szyb: "+Podaj_szybko��());
		System.out.println("--------------------------------------------------------------------");
	}
}
