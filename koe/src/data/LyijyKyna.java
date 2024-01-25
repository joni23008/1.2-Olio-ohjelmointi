package data;

public class LyijyKyna extends Kyna {
    
//atribuutit
protected String kovuus;

//kovuus
public String getKovuus() {
    return kovuus;
}

public void setKovuus(String kovuus) {
    this.kovuus = kovuus;
}

@Override
public String toString() {
    return "Hinta: " + hinta + "  Vari: " + vari + "  Kovuus: " + kovuus;
}



}
