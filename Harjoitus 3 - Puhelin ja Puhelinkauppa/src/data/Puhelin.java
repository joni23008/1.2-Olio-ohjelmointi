package data;

public class Puhelin {
    // Tee luokka Puhelin, jossa on ominaisuuksina (attribuutteina)
    // id, merkki, tyyppi ja taajuus. Puhelin voi olla lankapuhelin, jolloin siinä
    // ei ole taajuutta lainkaan, vaan se jätetään null-arvoiseksi. Muissa puhelimissa
    // taajuus voi olla 450, 900 tai 900/1800.
    
    // Tee luokkaan oletusmuodostimen näköinen parametriton muodostin sekä
    // muodostimet, joilla voidaan antaa arvot attribuuteille id, merkki ja tyyppi sekä ominaisuuksille
    // id, merkki, tyyppi ja taajuus.
    
    // Tee luokkaan myös getterit ja setterit kaikille attribuuteille.
    private int id;
    private String merkki;
    private String tyyppi;
    private int taajuus;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMerkki() {
        return merkki;
    }
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
    public String getTyyppi() {
        return tyyppi;
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    public int getTaajuus() {
        return taajuus;
    }
    public void setTaajuus(int taajuus) {
        this.taajuus = taajuus;
    }

    public Puhelin() {
    }
    
    public Puhelin(int id, String merkki, String tyyppi) {
        this.id = id;
        this.merkki = merkki;
        this.tyyppi = tyyppi;
    }
    
    public Puhelin(int id, String merkki, String tyyppi, int taajuus) {
        this.id = id;
        this.merkki = merkki;
        this.tyyppi = tyyppi;
        this.taajuus = taajuus;
    }
    
    @Override
    public String toString() {
        return "Puhelin [id=" + id + ", merkki=" + merkki + ", tyyppi=" + tyyppi + ", taajuus=" + taajuus + "]";
    }

    
}
