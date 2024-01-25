package app;

import java.util.Scanner;

import data.TiskikonePentti;

public class Suurkeittio {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TiskikonePentti tk1=new TiskikonePentti();
		lueTiskikone(tk1);
		TiskikonePentti tk2=new TiskikonePentti();
		lueTiskikone(tk2);
		tulosta(tk1);
		tulosta(tk2);
		
		TiskikonePentti tk3=new TiskikonePentti(103, "Bosch", "Iso", 100);
		tulosta(tk3);
		
	}

	
	private static void lueTiskikone(TiskikonePentti x) {


		// while (x.getId() == 0) 
		// {
		// 	System.out.print("Anna id: ");
		// 	String s=sc.nextLine();
		// 	x.setId(s);
		// 	if (x.getId() == 0) 
		// 	{
		// 		System.out.println("ID voi sisältää vain kokonaislukuja");
		// 	}
		// }

		// System.out.print("Anna merkki: ");
		// s=sc.nextLine();
		// x.setMerkki(s);
		
		// System.out.print("Anna malli: ");
		// s=sc.nextLine();
		// x.setMalli(s);
		

		while (x.getPesuohjelma() == 0) 
		{
			System.out.print("Anna pesuohjelma: ");
			String s=sc.nextLine();
			x.setPesuohjelma(s);
			if (x.getPesuohjelma() == 0) 
			{
				System.out.println("Pesuohjelma saa sisältää vain kokonaislukuja");
			}
		}
	}


	private static void tulosta(TiskikonePentti tk) {
		System.out.println(tk);
	}
}

