package app;
import java.util.*;

import data.*;

public class HyppyKilpailu {
    public static void main(String [] args){
        Kilpailu kilpailu=new Kilpailu();
        kilpailu.setId(100);
        kilpailu.setPaikka("Falun");

        Tuomari t=new Tuomari(1, "Heikki Kahila", "Suomi");
        kilpailu.addTuomari(t);
        t=new Tuomari(2, "Esko Tommola", "Suomi");
        kilpailu.addTuomari(t);

        Kilpailija k=new Kilpailija(20, "Veikko Kankkonen", "Suomi");
        kilpailu.addKilpailija(k);
        k=new Kilpailija(21, "Siiri Rantanen", "Suomi");
        kilpailu.addKilpailija(k);
        k=new Kilpailija(21, "Ville Ritola", "Suomi");
        kilpailu.addKilpailija(k);

        ArrayList<Kilpailija> lista=kilpailu.getKilpailijaLista();
        ArrayList<Tuomari> tLista=kilpailu.getTuomariLista();
        for (Kilpailija x:lista){
            for (Tuomari y:tLista){
                int tyyli=(int)(Math.random()*10+1);
                int pituus=(int)(Math.random()*100+1);
                Pisteet pp=new Pisteet(tyyli, pituus, y);
                x.adddTuomariPisteet(pp);
            }
        }
    }
}
