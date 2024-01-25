package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import data.Kala;

public class OliotTiedostosta {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		Kala k=null;
		try {
			fis=new FileInputStream("kalat.dat");
			ois=new ObjectInputStream(fis);
			while (fis.available()>0) {
				System.out.println(fis.available());
				k=(Kala) ois.readObject();
				System.out.println(k);
			}
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(k);
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
