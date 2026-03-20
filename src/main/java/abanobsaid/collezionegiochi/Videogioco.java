package abanobsaid.collezionegiochi;

public class Videogioco extends Gioco {
    // dati in più solo per i videogiochi
    private String piattaforma;
    private int durataGioco;
    private String genere;

    public Videogioco(String id, String titolo, int annoPubblicazione, double prezzo,
                      String piattaforma, int durataGioco, String genere) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.piattaforma = piattaforma;
        this.durataGioco = durataGioco;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public int getDurataGioco() {
        return durataGioco;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Videogioco{" +
                super.toString() +
                ", piattaforma='" + piattaforma + '\'' +
                ", durataGioco=" + durataGioco +
                ", genere='" + genere + '\'' +
                '}';
    }
}