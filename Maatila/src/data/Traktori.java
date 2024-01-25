package data;

public class Traktori {
    private int id;
    private String merkki;
    private String malli;
    private int teho;

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
    
    public String getMerkki() {
        return merkki;
    }
    public boolean setMerkki(String merkki){
        if (merkki != null && merkki.length()>=5){
            this.merkki = merkki;
            return true;
        }
            return false;
    }
    public String getMalli() {
        return malli;
    }
    public boolean setMalli(String malli){
        if (malli != null && malli.length()>=5){
            this.malli = malli;
            return true;
        }
            return false;
    }
    public int getTeho() {
        return teho;
    }
    public boolean setTeho(int teho){
        if (teho>=30 && teho<=250){
            this.teho=teho;
            return true;
        }
        return false;
    }
    
    public boolean setTeho(String teho){
        int p=0;
        try{
            p=Integer.parseInt(teho);
            if (p>=30 && p<=250){
                this.teho=p;
                return true;
            }
        }
        catch(NumberFormatException e){
            //Jos tulee poikkeus, arvo ei muutu
        }
        return false;
    }
    public String toString(){
        return  "ID: " + id + "\n" +
                "Merkki: " + merkki + "\n" +
                "Malli: " + malli + "\n" +
                "Teho: " + teho + "\n" ;
        
    }
    
}
