package data;

import abstrakti.Tasokuvio;

public class Kolmio extends Tasokuvio {

	@Override
	public double getPintaAla() {
		return super.getLeveys()*super.getKorkeus()/2;
	}
}