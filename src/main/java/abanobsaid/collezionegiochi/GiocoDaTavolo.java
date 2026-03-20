package abanobsaid.collezionegiochi;

public class GiocoDaTavolo extends Gioco {
    // dati in più solo per il gioco da tavolo
    private int numeroGiocatori;
    private int durataMediaPartita;

    public GiocoDaTavolo(String id, String titolo, int annoPubblicazione, double prezzo,
                         int numeroGiocatori, int durataMediaPartita) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.numeroGiocatori = numeroGiocatori;
        this.durataMediaPartita = durataMediaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public int getDurataMediaPartita() {
        return durataMediaPartita;
    }

    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                super.toString() +
                ", numeroGiocatori=" + numeroGiocatori +
                ", durataMediaPartita=" + durataMediaPartita +
                '}';
    }
}