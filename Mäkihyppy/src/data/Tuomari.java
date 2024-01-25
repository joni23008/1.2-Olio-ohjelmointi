package data;

public class Tuomari {
    
    private int id;
    private String nimi;
    private String maa;


    public Tuomari(int id, String nimi, String maa) {
        this.id=id;
        this.nimi=nimi;
        this.maa=maa;
    }


    public Tuomari() {
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
    
    public String toString(){
        return  "ID: " + id + "\n" +
                "Nimi: " + nimi + "\n" +
                "Maa: " + maa + "\n";
        
    }

}
