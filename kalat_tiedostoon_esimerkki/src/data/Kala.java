package data;

import java.io.Serializable;

public class Kala implements Serializable{
	private int id;
	private String laji;
	private float paino;
	public Kala() {
		
	}
	public Kala(int id, String laji, float paino) {
		this.id=id;
		this.laji=laji;
		this.paino=paino;
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
	public float getPaino() {
		return paino;
	}
	public void setPaino(float paino) {
		this.paino = paino;
	}
	public String toString() {
		return this.id+": "+this.laji+" ("+this.paino+")";
	}
}
