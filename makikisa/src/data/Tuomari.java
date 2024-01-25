package data;

public class Tuomari {
    private int id;
    private String nimi;
    private String maa;
    
    public Tuomari() {
    }
    
    public Tuomari(int id, String nimi, String maa) {
        this.id = id;
        this.nimi = nimi;
        this.maa = maa;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
        return "Tuomari [id=" + id + ", nimi=" + nimi + ", maa=" + maa + "]";
    }

    
}
