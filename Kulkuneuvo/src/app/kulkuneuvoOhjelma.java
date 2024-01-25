package app;
import java.util.ArrayList;
import java.util.Scanner;

import data.*;
public class kulkuneuvoOhjelma {
    public static void main(String[] args) {


        ArrayList<kulkuneuvo> lista=new ArrayList<>();


        // while loop. mis kysytään kiihdytys tai hidastus
        // if luase. jos kiihdyttys on valittu kysy paljonko
        // samanlainen. else if, jos halutaan hidastaa
        // else. break

        mopo mopo1 = new mopo();
        mopo1.setTyyppi("enduro");
        mopo1.setMoottoriMerkki("Sachs");
        mopo1.setVari("sininen");
        mopo1.setMaksimiNopeus(45);

        // mopo mopo2 = new mopo();
        // mopo2.setTyyppi("pappa");
        // mopo2.setMoottoriMerkki("Solifer");
        // mopo2.setVari("musta");

        // tää lisää ylläolevat
        // lista.add(kn);
        lista.add(mopo1);
    

        // tää lisää uudet joilla ei vielä mitään tietoja
        // lista.add(new kulkuneuvo());
        // lista.add(new mopo());
        // lista.add(new mopo());

  
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
                }

    do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Haluatko kiihdyttää vai hidastaa");
            System.out.println("Paina K tai H");
            String s = sc.nextLine();

                if (s.length() == 1) 
            {
                char p = s.charAt(0);
    
                if (p == 'K' || p == 'k') 
                {
                    System.out.println("Paljonko kiihdytetään");
                    int k = Integer.parseInt(sc.nextLine());
                    mopo1.setKiihdytä(k);
                    System.out.println("nopeus: " + mopo1.getNopeus() + "km/h" + "\n");

                } 
                else if (p == 'H' || p == 'h') 
                {

                    System.out.println("Paljonko hidastetaan");
                    int h = Integer.parseInt(sc.nextLine());
                    mopo1.setHidasta(h);
                    System.out.println("nopeus: " + mopo1.getNopeus() + "km/h" + "\n");


                }
                else
                {
                    break;
                }

	        }
    }while(true);







            
	}
}
