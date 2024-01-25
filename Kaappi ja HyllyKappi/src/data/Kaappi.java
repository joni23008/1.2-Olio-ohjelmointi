package data;
import java.io.Serializable;

public class Kaappi implements Serializable {
    protected double syvyys;
    protected double leveys;
    protected double korkeus;
    protected double hyllymaara;

    public double getSyvyys() {
        return syvyys;
    }
    public void setSyvyys(double syvyys) {
        this.syvyys = syvyys;
    }
    public double getLeveys() {
        return leveys;
    }
    public void setLeveys(double leveys) {
        this.leveys = leveys;
    }
    public double getKorkeus() {
        return korkeus;
    }
    public void setKorkeus(double korkeus) {
        this.korkeus = korkeus;
    }
    public double getHyllymaara() {
        return hyllymaara;
    }
    public void setHyllymaara(double hyllymaara) {
        this.hyllymaara = hyllymaara;
    }
    
    
	public double getTilavuus() {
		return getSyvyys()*getLeveys()*getKorkeus();
	}

    @Override
    public String toString() {
        return "[syvyys=" + syvyys + "m, leveys=" + leveys + "m, korkeus=" + korkeus + "m, hyllymäärä=" + hyllymaara
                + "]";
    }

   
}
