package app;

import data.Leipa;

public class Leipomo {
    public static void main(String[] args) {

    // Tee myös luokka Leipomo, jonka main-metodissa luodaan kaksi leipää
    // käyttäen em. muodostinta. Lisää ohjelmaan (Leipomo) metodi, jolla voidaan tulostaa yhden leivän tiedot.
    // lisää main-metodin loppuun koodi, joka tulostaa kummankin leivän tiedot käyttäen em. metodia.
    Leipa[] leivat = new Leipa[2];
    leivat[0] = new Leipa(1, "ruisleipä", 2.99, "vesi,ruisjauho,suola,hiiva");
    leivat[1] = new Leipa(2, "paahtoleipä", 3.50, "vesi,ruisjauho,ohrajauho,suola,hiiva");
        
        tulostaLeipa(leivat);
        tulostaLeivat(leivat);

    }

    private static void tulostaLeipa(Leipa[] leivat) {
        System.out.println(leivat[0]);
    }

    private static void tulostaLeivat(Leipa[] leivat) {
        for (int i = 0;i <= 1;i++)
        {
            System.out.println(leivat[i]);
        }

    }

}
