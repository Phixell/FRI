  


/**
 * Interface Prepravitelny.
 * 
 * @author Bene
 * @version 30.3.2012
 */
public interface Prepravitelny // rozhranie, ktore zabezpecuje ze objekt bude prepravitelny, a zadefinuje svoje
                               // poziadavky na prepravu => vahu, objem
{
//     public int koef = 10; // v rozhrani je mozne zadeklarovat konstanty
    
    // hlavicky metod, metody nemaju telo. kazdy objekt, ktory bude implementovat toto rozhranie, tak to telo metody
    // vyplni
    public double poziadavkaObjemu();   // vrat poziadavku na objem ako realnu hodnotu
    public double poziadavkaVahy();     // vrat poziadavku na vahu ako realnu hodnotu

}
