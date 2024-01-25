package app;
import data.Traktori;
import java.util.Scanner;
public class Maatila {
    public static void main(String[] args) 
    {
        
            Traktori[] taulu=new Traktori[3];

            lueTraktorinTiedot(taulu);
            tulostaTraktorit(taulu);
            
        
	}
    private static void lueTraktorinTiedot(Traktori[] taulu) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {

            for (int i=0;i<taulu.length;i++) 
                {
                taulu[i]=new Traktori();

                while (taulu[i].getId() == 0) 
                {
                    System.out.println("Traktorin " + (i + 1) + " id?");
                    String idInput = sc.nextLine();
                    taulu[i].setId(idInput);
                    if (taulu[i].getId() == 0) 
                    {
                        System.out.println("ID:n pitää sisältää vähintään yksi numero,yritä uudelleen");
                    }
                }
                while (taulu[i].getMerkki() == null) 
                {
                    System.out.println("Traktorin " + (i + 1) + " merkki?");
                    String merkkiInput = sc.nextLine();
                    taulu[i].setMerkki(merkkiInput);
                    if (taulu[i].getMerkki() == null) 
                    {
                        System.out.println("Merkin täytyy pitää sisältää väh.5 kirjainta,yritä uudelleen");
                    }
                }
                while (taulu[i].getMalli() == null) 
                {
                    System.out.println("Traktorin " + (i + 1) + " malli?");
                    String malliInput = sc.nextLine();
                    taulu[i].setMalli(malliInput);
                    if (taulu[i].getMalli() == null) 
                    {
                        System.out.println("Mallin täytyy pitää sisältää väh.5 kirjainta,yritä uudelleen");
                    }
                }
                while (taulu[i].getTeho() == 0) 
                {
                    System.out.println("Traktorin " + (i + 1) + " teho?");
                    String tehoInput = sc.nextLine();
                    taulu[i].setTeho(tehoInput);
                    if (taulu[i].getTeho() == 0) 
                    {
                        System.out.println("Tehon pitää olla 30-250 arvojen välillä,yritä uudelleen");
                    }
                }
                    System.out.println("\n");

                }
        }
    }
        private static void tulostaTraktorit(Traktori[] taulu) 
        {
            
            for (int i=0;i<taulu.length;i++) 
            {
                System.out.println(taulu[i]);
            }
        }
}
