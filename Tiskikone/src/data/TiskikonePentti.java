package data;

public class TiskikonePentti {
	private int id;
	private String merkki;
	private String malli;
	private int pesuohjelma;
	
	public TiskikonePentti() {}
	
	public TiskikonePentti(int id, String merkki, String malli, int po) {
		this.id=id;
		this.merkki=merkki;
		this.malli=malli;
		this.pesuohjelma=po;
	}
	
    public int getId() {
        return id;
    }
    public boolean setId(int id){
        if (id>0){
            this.id=id;
            return true;
        }     
        return false;
    }
    
    public boolean setId(String id){
        int p=0;
        try{
            p=Integer.parseInt(id);
            if (p>0){
                this.id=p;
                return true;
            }
        }
        catch(NumberFormatException e){
            //Jos tulee poikkeus, arvo ei muutu
        }
        return false;
    }
	// public String getMerkki() {
	// 	return merkki;
	// }
	// public void setMerkki(String merkki) {
	// 	this.merkki = merkki;
	// }
	// public String getMalli() {
	// 	return malli;
	// }
	// public void setMalli(String malli) {
	// 	this.malli = malli;
	// }
    public int getPesuohjelma() {
        return id;
    }
    public boolean setPesuohjelma(int pesuohjelma){
        if (pesuohjelma>0){
            this.pesuohjelma=pesuohjelma;
            return true;
        }     
        return false;
    }
    
    public boolean setPesuohjelma(String pesuohjelma){
        int p=0;
        try{
            p=Integer.parseInt(pesuohjelma);
            if (p>0){
                this.pesuohjelma=p;
                return true;
            }
        }
        catch(NumberFormatException e){
            //Jos tulee poikkeus, arvo ei muutu
        }
        return false;
    }

	@Override
	public String toString() {
		return "Tiskikone [id=" + id + ", merkki=" + merkki + ", malli=" + malli + ", pesuohjelma=" + pesuohjelma + "]";
	}
}
