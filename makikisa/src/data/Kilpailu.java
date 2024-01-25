package data;

import java.util.ArrayList;

public class Kilpailu {
    private int id;
    private String paikka;
    private ArrayList<Tuomari> tuomariLista;
    private ArrayList<Kilpailija> kilpailijaLista;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPaikka() {
        return paikka;
    }
    public void setPaikka(String paikka) {
        this.paikka = paikka;
    }
    public ArrayList<Tuomari> getTuomariLista() {
        return tuomariLista;
    }
    public void setTuomariLista(ArrayList<Tuomari> tuomariLista) {
        this.tuomariLista = tuomariLista;
    }
    public void addTuomari(Tuomari tuomari){
        if (tuomariLista==null){
            tuomariLista=new ArrayList<>();
        }
        tuomariLista.add(tuomari);
    }
    public ArrayList<Kilpailija> getKilpailijaLista() {
        return kilpailijaLista;
    }
    public void setKilpailijaLista(ArrayList<Kilpailija> kilpailijaLista) {
        this.kilpailijaLista = kilpailijaLista;
    }
    public void addKilpailija(Kilpailija kilpailija){
        if (kilpailijaLista==null){
            kilpailijaLista=new ArrayList<>();
        }
        kilpailijaLista.add(kilpailija);
    }
}
