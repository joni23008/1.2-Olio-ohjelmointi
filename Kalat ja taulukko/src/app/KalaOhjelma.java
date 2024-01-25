package app;
import data.Kala;
import java.util.Scanner;

public class KalaOhjelma {
    public static void main(String[] args) 
    {
        
            Kala [] taulu=new Kala[3];

            lueKalanTiedot(taulu);
            tulostaKalat(taulu);
            
        
	}

	private static void lueKalanTiedot(Kala[] taulu) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            for (int i=0;i<taulu.length;i++) 
            {
                taulu[i]=new Kala();
                System.out.println("Kalan " + (i+1) + " id?");
                taulu[i].setId(sc.nextLine());
                System.out.println("Kalan " + (i+1) + " paino?");
                taulu[i].setPaino(sc.nextLine());
                System.out.println("Kalan " + (i+1) +" laji?");
                taulu[i].setLaji(sc.nextLine());
                System.out.println("\n");
            }
        }
        
    }
    private static void tulostaKalat(Kala[] taulu) 
    {
		
		for (int i=0;i<taulu.length;i++) 
        {
			System.out.println(taulu[i]);
		}
	}
}
