package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import data.Kala;

public class OliotTiedostoon {
	private static int id=1;
	private static FileOutputStream fos=null;
	private static ObjectOutputStream oos=null;
	private static NoHeaderObjectOutputStream noos=null;
	private static String fileName="kalat.dat";

	public static boolean fileExists=false;
	
	public static void main(String[] args) {
		
		File f=new File(fileName);
		if (f.exists()) {
			fileExists=true;
		}
		if (avaaTiedosto()) {
			while (lisaaKala()) {
				Kala k=lueKalanTiedot();
				tallennaKala(k);
			}
			suljeTiedosto();
		}
	}

	private static Kala lueKalanTiedot() {
		Kala k=new Kala();
		k.setId(id++);
		System.out.print("Kalan laji: ");
		k.setLaji(new Scanner(System.in).nextLine());
		k.setPaino((float)(Math.random()*5000+1));//Satunnainen paino 1-5000
		return k;
	}

	private static boolean avaaTiedosto() {
		try {
			fos=new FileOutputStream(fileName, true);
			noos=new NoHeaderObjectOutputStream(fos);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	private static void suljeTiedosto() {
		try {
			noos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			
		}
	}
	private static void tallennaKala(Kala k) {
		try {
			noos.writeObject(k);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean lisaaKala() {
		System.out.print("Uusi kala (k/e)? ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		try {
			if (s.charAt(0)=='k') {
				return true;
			}
		}
		catch(IndexOutOfBoundsException e) {
			
		}
		return false;
	}

}

class NoHeaderObjectOutputStream extends ObjectOutputStream{

	public NoHeaderObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}
	@Override
	protected void writeStreamHeader() throws IOException {
		// do not write a header
		if (!OliotTiedostoon.fileExists) {
			super.writeStreamHeader();
		}
	}	
}
