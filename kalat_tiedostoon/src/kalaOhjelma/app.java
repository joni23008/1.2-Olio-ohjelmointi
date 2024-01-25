package kalaOhjelma;
import java.io.*;


import kala.data;
public class app {

	public static void main(String[] args) {
		tallennaOlio();
		lueOlio();
	}

	private static void tallennaOlio() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("kalatdsto.dat");
			oos=new ObjectOutputStream(fos);
			
			data kala=new data();
            kala.setId(1);
            kala.setLaji("Hauki");
            kala.setPaino(3000);
            kala.setPituus(82);
			oos.writeObject(kala);
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
			fis=new FileInputStream("kalatdsto.dat");
			ois=new ObjectInputStream(fis);
			data kala=(data) ois.readObject();
			System.out.println(kala);
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

