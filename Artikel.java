public class Artikel {
    private int Artikelnummer;
    private double Steuersatz;
    private String Beschreibung;
    private double Nettopreis;
    private int ArtikelAnzahl;
    private int LastArtikel;

    Artikel(int _Artikelnummer, int _Steuersatz, double _Nettopreis, String _Beschreibung){
        //doublettenprüfung auf art no
        Artikelnummer=_Artikelnummer;
        Beschreibung=_Beschreibung;
        ArtikelAnzahl=1;
        if (_Nettopreis > 0 && _Steuersatz > 0) {
            Nettopreis=_Nettopreis;
            Steuersatz=_Steuersatz;
        }
        else {
            throw new IllegalArgumentException("Preis und Steuersatz darf nicht kleiner 0 sein.");
        }
    }

    public int getArtikelAnzahl(){
        return ArtikelAnzahl;
    }

    public int setArtikelAnzahl(int _Anzahl){
        ArtikelAnzahl =_Anzahl;
        return ArtikelAnzahl;
    }

    public int getArtikelnummer(){
        return Artikelnummer;
        }
    public String getBeschreibung(){
        return Beschreibung;
    }

    // Hier könnte man auch eine allgemeinere Methode getprice implementieren.
    // Diese fragt ab, ob der Kunde geschäftlich oder privat ist. Der Netto oder Bruttopreis wird dementsprechend berechnet.
    // Da eine Klasse für den Benutzer nicht existiert, kann dies hier nicht abgefragt werden.
    public double getNettopreis(){
        return Nettopreis;
    }

    // Rechnet den Bruttopreis basierend auf dem Nettopreis aus. Zuerst wird der Steuersatz durch 100 geteilt, da er Prozentual angegeben wurde.
    // Danach wird durch eine Mathematische Funktion gewährleistet, dass nur 2 Nachkommastellen angezeigt werden
    // Da Artikel artikelpreis immer gleich ist, aber im warenkorb durch die anzahl der artikel ein mehrfaches ist, bleibt im artikel alles wie gehabt
    public double getBruttopreis(){
        return Math.floor((Nettopreis + (Nettopreis * (Steuersatz / 100)))*100) / 100d;
    }

    //Macht den Steuersatz für den Warenkorb zugänglich
    public double getSteuersatz() {
        return Steuersatz;
    }

    public double setNettopreis(double _Nettopreis){
        Nettopreis=_Nettopreis;
        return Nettopreis;
    }
}
