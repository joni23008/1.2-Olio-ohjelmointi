package data;

public class mopo extends kulkuneuvo{
	protected String moottoriMerkki;
    protected String tyyppi;
    
    public String getMoottoriMerkki() {
        return moottoriMerkki;
    }
    public void setMoottoriMerkki(String moottoriMerkki) {
        this.moottoriMerkki = moottoriMerkki;
    }
    public String getTyyppi() {
        return tyyppi;
        
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    


    // kokeile laittaa tää takas kulkunevoo
    @Override
    public String toString() {
        return "Tyyppi: " + tyyppi + "  Moottorimerkki: " + moottoriMerkki + "  Väri: " + vari + "  Maksimi-nopeus: " + maksimiNopeus;
    }
}