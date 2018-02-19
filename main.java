

public class main {
    public static void main(String[] args) {

        //Initiale Anlage von Artikeln
        Artikel Weinkühler = new Artikel(1234,19,9.58,"CoolestThing");
        Artikel Wein = new Artikel(1233,19,8.98,"VinoGrigio");
        Artikel Korkenzieher = new Artikel(1334,19,14.90,"Zieher0815");
        Artikel Kaffeebohnen = new Artikel(2313,7,4.90,"BeansFromJava");

        //Initiale Anlage von Warenkoerben fuer Kunden
        Warenkorb Kunde1 = new Warenkorb();
        Warenkorb Kunde2 = new Warenkorb();
        Warenkorb Kunde3 = new Warenkorb();

        //Aktionen Kunde 1
        Kunde1.artikelHinzu(Weinkühler);
        Kunde1.artikelHinzu(Wein);
        Kunde1.getWarenkorbSize();
        Kunde1.getWarenkorbInhalt();
        Kunde1.getWarenkorbWert();

        //Aktionen Kunde 2
        //Kunde 2 kauft Artikel mit unterschiedlichen Steuersaetzen
        Kunde2.artikelHinzu(Kaffeebohnen);
        Kunde2.artikelHinzu(Wein);
        Kunde2.getWarenkorbInhalt();
        Kunde2.getWarenkorbWert();


        //Aktionen Kunde 3
        //Kunde 3 tippt ausversehen 2 mal auf den korkenzieher und loescht deshalb einen wieder.
        Kunde3.artikelHinzu(Korkenzieher);
        Kunde3.artikelHinzu(Korkenzieher);
        Kunde3.artikelLoeschen(Korkenzieher);
        Kunde3.artikelHinzu(Kaffeebohnen);
        Kunde3.getWarenkorbInhalt();
        Kunde3.getWarenkorbWert();
    }
}
