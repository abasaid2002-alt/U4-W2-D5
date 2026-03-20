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

    public List<Gioco> getGiochi() {
        return giochi;
    }
}