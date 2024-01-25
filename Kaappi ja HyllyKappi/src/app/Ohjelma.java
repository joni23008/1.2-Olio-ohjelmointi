package app;

import data.Kaappi;
import data.HyllyKaappi;
import java.io.*;

public class Ohjelma {
    public static void main(String[] args) {
        tallennaOlio();
		lueOlio();

        Kaappi kaappi = new Kaappi();
        kaappi.setSyvyys(0.50);
        kaappi.setLeveys(0.60);
        kaappi.setKorkeus(1.80);


        HyllyKaappi hyllykaappi = new HyllyKaappi();
        hyllykaappi.setSyvyys(0.68);
        hyllykaappi.setLeveys(0.70);
        hyllykaappi.setKorkeus(2.00);
        hyllykaappi.setHyllymaara(5);

        // System.out.println("Kaapin tiedot " + kaappi);
        // System.out.println("Kaapin tilavuus on " + kaappi.getTilavuus() + " kuutiometriä.");
        // System.out.println("Hyllykaapin tiedot " + hyllykaappi);
        // System.out.println("Hyllykaapin pinta-ala on " + hyllykaappi.getHyllyPintaAla() + " neliömetriä.");

    }
    private static void tallennaOlio() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("kaapit.dat");
			oos=new ObjectOutputStream(fos);
		Kaappi kaappi = new Kaappi();
        kaappi.setSyvyys(0.50);
        kaappi.setLeveys(0.60);
        kaappi.setKorkeus(1.80);

        HyllyKaappi hyllykaappi = new HyllyKaappi();
        hyllykaappi.setSyvyys(0.68);
        hyllykaappi.setLeveys(0.70);
        hyllykaappi.setKorkeus(2.00);
        hyllykaappi.setHyllymaara(5);

			oos.writeObject(kaappi);
            oos.writeObject(hyllykaappi);
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

	private static void lueOlio() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("kaapit.dat");
			ois=new ObjectInputStream(fis);
			Kaappi kaappi=(Kaappi) ois.readObject();
            Kaappi hyllykaappi=(Kaappi) ois.readObject();
			System.out.println(kaappi);
            System.out.println(hyllykaappi);
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
