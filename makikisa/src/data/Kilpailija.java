package data;

import java.util.ArrayList;

public class Kilpailija {
    private int numero;
    private String nimi;
    private String maa;
    
    private ArrayList<Pisteet> tuomariPisteet;

    public Kilpailija() {
    }
    public Kilpailija(int numero, String nimi, String maa) {
        this.numero = numero;
        this.nimi = nimi;
        this.maa = maa;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public String getMaa() {
        return maa;
    }
    public void setMaa(String maa) {
        this.maa = maa;
    }
    @Override
    public String toString() {
        return "Kilpailija [numero=" + numero + ", nimi=" + nimi + ", maa=" + maa + "]";
    }
    public ArrayList<Pisteet> getTuomariPisteet() {
        return tuomariPisteet;
    }
    public void setTuomariPisteet(ArrayList<Pisteet> tuomariPisteet) {
        this.tuomariPisteet = tuomariPisteet;
    }

    public void adddTuomariPisteet(Pisteet pisteet){
        if (tuomariPisteet==null){
            tuomariPisteet=new ArrayList<>();
        }
        tuomariPisteet.add(pisteet);
    }
}
