package kala;

import java.io.Serializable;


public class data {
	private int id;
	private String laji;
	private int pituus;
	private float paino;
    
    public class kala implements Serializable
    {

    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLaji() {
		return laji;
	}
	public void setLaji(String laji) {
		this.laji = laji;
	}
	public int getPituus() {
		return pituus;
	}
	public void setPituus(int pituus) {
		this.pituus = pituus;
	}
	public float getPaino() {
		return paino;
	}
	public void setPaino(float paino) {
		this.paino = paino;
	}
    @Override
    public String toString() {
        return "data [id=" + id + ", laji=" + laji + ", pituus=" + pituus + ", paino=" + paino + "]";
    }
}