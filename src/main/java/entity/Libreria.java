package entity;

public class Libreria {
    private int id;
    private String autore;
    private String titolo;
    private int codice;

    public Libreria () {

    }

    public Libreria(int id, String autore, String titolo, int codice) {
        this.id = id;
        this.autore = autore;
        this.titolo = titolo;
        this.codice = codice;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }
}
