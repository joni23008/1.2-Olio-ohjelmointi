package data;



public class HyllyKaappi extends Kaappi{


	public double getHyllyPintaAla() {
		return super.getSyvyys()*super.getLeveys();
	}
}