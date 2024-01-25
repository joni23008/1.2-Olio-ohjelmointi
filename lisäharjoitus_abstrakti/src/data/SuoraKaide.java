package data;

import abstrakti.Tasokuvio;

public class SuoraKaide extends Tasokuvio{

	@Override
	public double getPintaAla() {
		return super.getLeveys()*super.getKorkeus();
	}

}