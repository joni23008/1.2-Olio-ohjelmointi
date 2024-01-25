package abstrakti;

public abstract class Tasokuvio {
	private double leveys;
	private double korkeus;
    private double pi = Math.PI;

	public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    public double getLeveys() {
		return leveys;
	}
	public void setLeveys(int leveys) {
		this.leveys = leveys;
	}
	
	public double getKorkeus() {
		return korkeus;
	}
	public void setKorkeus(int korkeus) {
		this.korkeus = korkeus;
	}
	public abstract double getPintaAla();
}