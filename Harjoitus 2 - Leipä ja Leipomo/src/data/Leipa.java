package data;

public class Leipa {
    // Tee luokka Leipa, jossa on muutama leivälle tyypillinen ominaisuus:
    // id voisi olla leivän tunniste (vrt. tietokannat)
    // tyyppi (esim. reikäleipä, limppu, vuokaleipä tms.)
    // hinta (esim. 2.99, 6.81)
    // valmistusaineet (yhtenä merkkijonona lueteltuna kaikki valmistusaineet. Esim: suola, sokeri, jauhoparanne, e255)
    
    // Tee luokalle myös getterit ja setterit, sekä muodostinfunktio, jolla voidaan kerralla antaa arvot kaikille attribuuteille

    private int id;
    private String tyyppi;
    private double hinta;
    private String valmistusaineet;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTyyppi() {
        return tyyppi;
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    public double getHinta() {
        return hinta;
    }
    public void setHinta(double hinta) {
        this.hinta = hinta;
    }
    public String getValmistusaineet() {
        return valmistusaineet;
    }
    public void setValmistusaineet(String valmistusaineet) {
        this.valmistusaineet = valmistusaineet;
    }
    
    public Leipa(int id, String tyyppi, double hinta, String valmistusaineet) {
        this.id = id;
        this.tyyppi = tyyppi;
        this.hinta = hinta;
        this.valmistusaineet = valmistusaineet;
    }

    @Override
    public String toString() {
        return "Leipä [id=" + id + ", tyyppi=" + tyyppi + ", hinta=" + hinta + ", valmistusaineet=" + valmistusaineet
                + "]";
    }
    
}
