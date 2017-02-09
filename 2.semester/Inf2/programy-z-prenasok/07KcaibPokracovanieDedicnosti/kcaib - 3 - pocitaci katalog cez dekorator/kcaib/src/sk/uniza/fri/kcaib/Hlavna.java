/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kcaib;

import java.util.ArrayList;
import sk.uniza.fri.kcaib.databaza.Katalog;
import sk.uniza.fri.kcaib.databaza.PocitaciKatalog;
import sk.uniza.fri.kcaib.polozky.AudiovizualneDielo;
import sk.uniza.fri.kcaib.polozky.CD;
import sk.uniza.fri.kcaib.polozky.DVD;

/**
 *
 * @author janik
 */
public class Hlavna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PocitaciKatalog katalog = new PocitaciKatalog(new Katalog());

        katalog.pridaj(new CD("The Best of", "The Beatles", 12, 30));
        katalog.pridaj(new CD("Brave New World", "Styx", 14, 45));

        katalog.pridaj(new DVD("Tenkrat na zapade", "Neznamy", 90));
        katalog.pridaj(new DVD("The Avengers", "The Avengers", 142));
        
        ArrayList<AudiovizualneDielo> diela = new ArrayList<>();
        diela.add(new DVD("Autá", "AudiovizualneDielo", 116));
        katalog.pridajZoznam(diela);

        katalog.vypisPolozky();
        
        // Mal by vypisat 5
        System.out.println(katalog.dajPocet());
    }
}
