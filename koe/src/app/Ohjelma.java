package app;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
import data.*;

public class Ohjelma {
        public static void main(String[] args) throws Exception 
    {
        
        ArrayList<Kyna> lista=new ArrayList<>();

        //Luodaan ensmmäinen kynä
        LyijyKyna kyna1 = new LyijyKyna();
        kyna1.setHinta(2.50);
        kyna1.setVari("Punainen");
        kyna1.setKovuus("Kova");
        lista.add(kyna1);

        //Luodaan toinen kynä
        LyijyKyna kyna2 = new LyijyKyna();
        kyna2.setHinta(1.50);
        kyna2.setVari("Sininen");
        kyna2.setKovuus("Pehmeä");
        lista.add(kyna2);

        //Käyetään metodeja tallentamiseen ja lukemiseen
        tallennaOlio(lista);
		lueOlio(lista);
            
    }//Mainin loppu


        //Tallennetaan oliot
        private static void tallennaOlio(ArrayList<Kyna> lista) 
        {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("kynatdsto.txt");
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


        }
        //Luetaan oliot
        private static void lueOlio(ArrayList<Kyna> lista) 
        {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("kynatdsto.txt");
			ois=new ObjectInputStream(fis);
			ois.readObject();
			System.out.println(lista);
		}
		catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


        }
    
}
