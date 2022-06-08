package Ingo.Instrumentenverleih.model;

public class InstrumentRequestObject {

    public String name;
    public String beschreibung;
    public double preis;
    public String kategorie;
    public boolean isAusgeliehen;

    public InstrumentRequestObject(String name, String beschreibung, double preis, String kategorie, boolean isAusgeliehen) {
        super();
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.kategorie = kategorie;
        this.isAusgeliehen = false;
    }
}
