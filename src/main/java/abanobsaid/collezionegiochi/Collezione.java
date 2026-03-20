package abanobsaid.collezionegiochi;

import java.util.ArrayList;
import java.util.List;

public class Collezione {
    // lista di tutti i giochi
    private List<Gioco> giochi;

    public Collezione() {
        giochi = new ArrayList<>();
    }

    public boolean aggiungiGioco(Gioco gioco) {
        if (gioco == null) {
            return false;
        }

        // controllo id già presente
        for (Gioco g : giochi) {
            if (g.getId().equalsIgnoreCase(gioco.getId())) {
                return false;
            }
        }

        giochi.add(gioco);
        return true;
    }

    public Gioco cercaPerId(String id) {
        for (Gioco g : giochi) {
            if (g.getId().equalsIgnoreCase(id)) {
                return g;
            }
        }

        return null;
    }

    public List<Gioco> cercaPerPrezzo(double prezzoMassimo) {
        // creo una lista con i giochi trovati
        List<Gioco> risultati = new ArrayList<>();

        for (Gioco g : giochi) {
            if (g.getPrezzo() <= prezzoMassimo) {
                risultati.add(g);
            }
        }

        return risultati;
    }

    public List<GiocoDaTavolo> cercaPerNumeroGiocatori(int numeroGiocatori) {
        // lista solo per i giochi da tavolo trovati
        List<GiocoDaTavolo> risultati = new ArrayList<>();

        for (Gioco g : giochi) {
            if (g instanceof GiocoDaTavolo) {
                GiocoDaTavolo giocoDaTavolo = (GiocoDaTavolo) g;

                if (giocoDaTavolo.getNumeroGiocatori() == numeroGiocatori) {
                    risultati.add(giocoDaTavolo);
                }
            }
        }

        return risultati;
    }

    public int contaVideogiochi() {
        int contatore = 0;

        for (Gioco g : giochi) {
            if (g instanceof Videogioco) {
                contatore++;
            }
        }

        return contatore;
    }

    public int contaGiochiDaTavolo() {
        int contatore = 0;

        for (Gioco g : giochi) {
            if (g instanceof GiocoDaTavolo) {
                contatore++;
            }
        }

        return contatore;
    }

    public Gioco giocoPiuCostoso() {
        // se la lista è vuota
        if (giochi.isEmpty()) {
            return null;
        }

        Gioco piuCostoso = giochi.get(0);

        for (Gioco g : giochi) {
            if (g.getPrezzo() > piuCostoso.getPrezzo()) {
                piuCostoso = g;
            }
        }

        return piuCostoso;
    }

    public double prezzoMedio() {
        // se la lista è vuota
        if (giochi.isEmpty()) {
            return 0;
        }

        double somma = 0;

        for (Gioco g : giochi) {
            somma += g.getPrezzo();
        }

        return somma / giochi.size();
    }

    public boolean rimuoviGioco(String id) {
        // cerco il gioco e lo rimuovo
        for (int i = 0; i < giochi.size(); i++) {
            if (giochi.get(i).getId().equalsIgnoreCase(id)) {
                giochi.remove(i);
                return true;
            }
        }

        return false;
    }

    public boolean aggiornaGioco(String id, Gioco nuovoGioco) {
        if (nuovoGioco == null) {
            return false;
        }

        if (!nuovoGioco.getId().equalsIgnoreCase(id)) {
            return false;
        }

        // cerco il gioco e lo sostituisco
        for (int i = 0; i < giochi.size(); i++) {
            if (giochi.get(i).getId().equalsIgnoreCase(id)) {
                giochi.set(i, nuovoGioco);
                return true;
            }
        }

        return false;
    }

    public List<Gioco> getGiochi() {
        return giochi;
    }
}