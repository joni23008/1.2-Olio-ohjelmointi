package app;
import data.Puhelin;

public class PuhelinKauppa {
    public static void main(String[] args) {
        Puhelin[] puhelin = new Puhelin[3];

        puhelin[0] = new Puhelin();
        puhelin[0].setId(01);
        puhelin[0].setMerkki("Nokia");
        puhelin[0].setTyyppi("Vanha kapula");
        puhelin[0].setTaajuus(450);

        puhelin[1] = new Puhelin(2,"Samsung","lanka");

        puhelin[2] = new Puhelin(3,"Apple","älypuhelin", 900);

        tulostaPuhelimet(puhelin);

    }

    private static void tulostaPuhelimet(Puhelin[] puhelin) {
        for (int i = 0; i < puhelin.length; i++) {
            System.out.println(puhelin[i]);
        }

    }

}
