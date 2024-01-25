package data;

public class Pisteet {
    private int tyyli;
    private int pituus;
    private Tuomari tuomari;

    public Pisteet() {
    }
    public Pisteet(int tyyli, int pituus) {
        this.tyyli = tyyli;
        this.pituus = pituus;
    }
    
    public Pisteet(int tyyli, int pituus, Tuomari tuomari) {
        this.tyyli = tyyli;
        this.pituus = pituus;
        this.tuomari = tuomari;
    }
    public int getTyyli() {
        return tyyli;
    }
    public void setTyyli(int tyyli) {
        this.tyyli = tyyli;
    }
    public int getPituus() {
        return pituus;
    }
    public void setPituus(int pituus) {
        this.pituus = pituus;
    }
    public Tuomari getTuomari() {
        return tuomari;
    }
    public void setTuomari(Tuomari tuomari) {
        this.tuomari = tuomari;
    }
    
}
