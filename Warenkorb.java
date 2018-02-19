import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

    Warenkorb(){}

    //Liste mit Artikel Objekten namens Artikelliste wird erstellt
    private List<Artikel> Artikelliste = new ArrayList<>();
    private double WarenkorbWert;
    private double WarenkorbWertBrutto;

    public void artikelHinzu(Artikel NeuerArtikel) {
        for (Artikel artikel : Artikelliste) {
            if (artikel.getArtikelnummer() == NeuerArtikel.getArtikelnummer()) {
                artikel.setArtikelAnzahl(artikel.getArtikelAnzahl()+1);
                //artikel.Anzahl += NeuerArtikel.Anzahl;
                return;
}
}
        Artikelliste.add(NeuerArtikel);
    }

    public void artikelLoeschen(Artikel ObsoleterArtikel) {
        for (Artikel artikel : Artikelliste) {
            if ( artikel == ObsoleterArtikel && artikel.getArtikelAnzahl()>1) {
                artikel.setArtikelAnzahl(artikel.getArtikelAnzahl()-1);
            }
            else{
                Artikelliste.remove(ObsoleterArtikel);
                }
            }
        }


    //Anzahl aller Artikel i Warenkorb
    public void getWarenkorbSize(){
        System.out.println("Gesamtzahl aller Artikel in ihrem Warenkorb: "+Artikelliste.size());
        }

    //Wert des Warenkorbs inkl. aller Artikel bestimmen
    public double getWarenkorbWert() {
        for (Artikel Ausgabe : Artikelliste) {
            WarenkorbWert = WarenkorbWert + Ausgabe.getNettopreis()*Ausgabe.getArtikelAnzahl();
        }
        return Math.floor(WarenkorbWert*100)/100;
    }

    public double getWarenkorbWertBrutto() {
        for (Artikel Ausgabe : Artikelliste) {
            WarenkorbWertBrutto = WarenkorbWertBrutto + Ausgabe.getBruttopreis()*Ausgabe.getArtikelAnzahl();
        }
        return Math.floor(WarenkorbWertBrutto*100)/100;

    }

    //Gibt Artikel für Artikel aus, inklusiver der Preise sowie dem Gesamtpreis
    public void getWarenkorbInhalt(){
        int i=0;
        for (Artikel Ausgabe : Artikelliste){
            i++;
            System.out.println("\n\nArtikel "+i+"\n"+"Artikelbeschreibung: "+Ausgabe.getBeschreibung());
            System.out.println("Artikelnummer: "+Ausgabe.getArtikelnummer());
            System.out.println("Einzelpreis: "+Ausgabe.getNettopreis());
            System.out.println("Einzelpreis (inkl. "+Ausgabe.getSteuersatz()+"% MwSt) "+Ausgabe.getBruttopreis());
            if(Ausgabe.getArtikelAnzahl()>1) {
                System.out.println("Preis: " + Ausgabe.getNettopreis() * Ausgabe.getArtikelAnzahl());
                System.out.println("Preis (inkl. " + Ausgabe.getSteuersatz() + "% MwSt) " + Ausgabe.getBruttopreis() * Ausgabe.getArtikelAnzahl());
            }
            System.out.println("Anzahl "+Ausgabe.getArtikelAnzahl());
        }
        System.out.println("\n\n_______________\nGesamtpreis: "+getWarenkorbWert());
        System.out.println("Gesamtpreis (inkl. MwSt): "+getWarenkorbWertBrutto());
    }
}
