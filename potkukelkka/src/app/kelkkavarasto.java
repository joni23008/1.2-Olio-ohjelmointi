package app;
import data.potkukelkka;
public class kelkkavarasto {
    public static void main(String[] args) {

        potkukelkka kelkka1 = new potkukelkka();

        kelkka1.setleveys(50.0);
        kelkka1.setpituus(100.0);
        kelkka1.setvari("musta");
        kelkka1.setvalmistaja("Joulupukki");


        tulosta(kelkka1);
    }


	private static void tulosta(potkukelkka kelkka1) {
		System.out.println(kelkka1.getleveys() + " cm");
        System.out.println(kelkka1.getpituus() + " cm");
        System.out.println(kelkka1.getvari());
        System.out.println(kelkka1.getvalmistaja());

	}
    
}
