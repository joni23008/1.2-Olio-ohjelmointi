package data;

public class kulkuneuvo {
	protected float hinta;
	protected String vari;
	protected int maksimiNopeus;
    protected int nopeus;
    protected int kiihdytä;
    protected int hidasta;


    public float getHinta() {
        return hinta;
    }
    public void setHinta(float hinta) {
        this.hinta = hinta;
    }
    public String getVari() {
        return vari;
    }
    public void setVari(String vari) {
        this.vari = vari;
    }
    public int getMaksimiNopeus() {
        return maksimiNopeus;
    }
    public void setMaksimiNopeus(int maksimiNopeus) {
        this.maksimiNopeus = maksimiNopeus;
    }
    public int getNopeus() {
        return nopeus;
    }
    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }

    public void setKiihdytä(int k){
        this.nopeus= nopeus + k;
        if (nopeus>maksimiNopeus){
            this.nopeus=maksimiNopeus;
        }

    }
        public void setHidasta(int h){
        this.nopeus= nopeus - h;
        if (nopeus<0){
            this.nopeus=0;
        }

    }
    

    // tee metodit kiihdytä ja hidasta. if lause ja perus plussaus miinus hommia. ja rajota maksimiin


}
