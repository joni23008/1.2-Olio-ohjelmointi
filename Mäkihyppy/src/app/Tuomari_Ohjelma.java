package app;
import data.Tuomari;

public class Tuomari_Ohjelma {
    
    public static void main(String[] args){
    
    Tuomari tuomari1 = new Tuomari();
    tuomari1.setId(1);
    tuomari1.setNimi("Pekka");
    tuomari1.setMaa("Suomi");


    Tuomari tuomari2 = new Tuomari(2, "Svensson", "Ruotsi");
    
    tulosta(tuomari1);
    tulosta(tuomari2);

    }

    private static void tulosta(Tuomari tuomari) 
    {
     System.out.println(tuomari);
    }
    




}
