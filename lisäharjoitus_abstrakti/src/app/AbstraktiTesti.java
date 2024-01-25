package app;

import java.text.DecimalFormat;
import abstrakti.Tasokuvio;
import data.Ellipsi;
import data.Kolmio;
import data.SuoraKaide;
import java.util.ArrayList;

public class AbstraktiTesti {

	public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
		ArrayList<Tasokuvio> lista=new ArrayList<>();


		Tasokuvio kolmio = new Kolmio();
		kolmio.setKorkeus(3);
		kolmio.setLeveys(6);
		
		Tasokuvio suoraKaide=new SuoraKaide();
		suoraKaide.setKorkeus(8);
		suoraKaide.setLeveys(5);

        Tasokuvio ellipsi=new Ellipsi();
				ellipsi.setKorkeus(10);
				ellipsi.setLeveys(15);

				lista.add(kolmio);
				lista.add(suoraKaide);
				lista.add(ellipsi);
				
				
				for (int i = 0; i < lista.size(); i++) {
					System.out.println(decimalFormat.format(lista.get(i).getPintaAla()));
				}
        
	}

}
