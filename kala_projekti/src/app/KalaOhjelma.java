package app;

import data.Kala;

public class KalaOhjelma {

	public static void main(String[] args) {
		//Muodostetaan kolme Kala tyyppistä oliota
		Kala kala1=new Kala();
		Kala kala2=new Kala();
		Kala kala3=new Kala();
		
		//Annetaan arvot oliolle kala1 
		kala1.setId(1);
		kala1.setLaji("Hauki");
		kala1.setPaino(3000);
		kala1.setPituus(82);
		
		//Annetaan arvot oliolle kala2 
		kala2.setId(2);
		kala2.setLaji("Ahven");
		kala2.setPaino(500);
		kala2.setPituus(33);
		
		//Annetaan arvot oliolle kala3 
		kala3.setId(3);
		kala3.setLaji("Särki");
		kala3.setPaino(120);
		kala3.setPituus(25);
		
		//Tulostetaan kalojen tiedot
		//Tässä viedään kala-olioiden osoite (muistiviittaus) aliohjelmalle tulosta
		//ja aliohjelma parametri kala saa tuon arvon ja käyttää sitä tulostuksessa.
		tulosta(kala1);
		tulosta(kala2);
		tulosta(kala3);
	}

	/**
	 * Aliohjelma tulosta saa parametrinaan Kala-tyyppisen olion viittauksen ja
	 * käyttää sitä tulostaessaa kalan tiedot.
	 * 
	 * @param kala tulostettava kala
	 */
	private static void tulosta(Kala kala) {
		System.out.println(kala.getId());
		System.out.println(kala.getLaji());
		System.out.println(kala.getPituus());
		System.out.println(kala.getPaino());
	}

}
