package app;

import java.util.ArrayList;
import java.util.Scanner;
import data.kala;

public class kalaOhjelma {
    public static void main(String [] args){
// ....jotain koodia mahdollisesti
	ArrayList<kala> lista=new ArrayList<>();
	char lisaaUusi='e';
	do{

		kala k=new kala(); //Luodaan uusi Kala-olio
		kysyKalanTiedot(k);//Kysytään sille tiedot aliohjelmassa (aliohjelman toteutus tehtävänä)
		lista.add(k); //Lisätään uusi olio ArrayList:iin
		lisaaUusi=lisataankoUusiKala();//Kysytään käyttäjältä, haluaako lisätä uuden kalan

	}while(lisaaUusi=='k');

    tulostaKalat(lista);
	
// .....jotain koodia mahdollisesti

}//End of main

private static void tulostaKalat(ArrayList<kala> lista) {
    for (int i = 0; i < lista.size(); i++) {
        System.out.println(lista.get(i));
      }


    }

private static void kysyKalanTiedot(kala k) {
    try (Scanner sc = new Scanner(System.in)) {

        System.out.println("Kalan id?");
        k.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Kalan laji?");
        k.setLaji(sc.nextLine());
        
    } catch (NumberFormatException e) {
        
        e.printStackTrace();
    }


}


public static char lisataankoUusiKala(){
	try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Lisätäänkö uusi kala? (k/e) ");
        String s=sc.nextLine();
        
        try{
        	return s.charAt(0); //Jos käyttäjä antaa tyhjän, aiheuttaa s.charAt(0) poikkeuksen
        }
        catch(IndexOutOfBoundsException e){
        	return 'e';
        }
    }
} 




}
