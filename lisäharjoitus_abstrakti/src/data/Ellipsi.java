package data;

import abstrakti.Tasokuvio;

public class Ellipsi extends Tasokuvio{

	@Override
	public double getPintaAla() {
        return super.getPi()*super.getLeveys()*super.getKorkeus();
        
	}

}