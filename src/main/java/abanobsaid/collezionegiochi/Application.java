package abanobsaid.collezionegiochi;

public class Application {
    public static void main(String[] args) {

        Collezione collezione = new Collezione();

        // creo un videogioco
        Videogioco v1 = new Videogioco(
                "VG1",
                "Fifa 25",
                2025,
                79.99,
                "PS5",
                60,
                "Sport"
        );

        // creo un gioco da tavolo
        GiocoDaTavolo g1 = new GiocoDaTavolo(
                "GT1",
                "Monopoly",
                2020,
                29.99,
                4,
                90
        );

        // test aggiunta
        System.out.println(" TEST AGGIUNTA ");
        System.out.println("Aggiunta v1: " + collezione.aggiungiGioco(v1));
        System.out.println("Aggiunta g1: " + collezione.aggiungiGioco(g1));

        // provo ad aggiungere di nuovo lo stesso id
        System.out.println("Aggiunta duplicato v1: " + collezione.aggiungiGioco(v1));

        System.out.println();

        // stampo tutti i giochi inseriti
        System.out.println(" GIOCHI PRESENTI ");
        for (Gioco g : collezione.getGiochi()) {
            System.out.println(g);
        }

        System.out.println();

        // test ricerca per id esistente
        System.out.println(" TEST CERCA PER ID ");
        Gioco trovato1 = collezione.cercaPerId("VG1");
        if (trovato1 != null) {
            System.out.println("Gioco trovato: " + trovato1);
        } else {
            System.out.println("Gioco non trovato");
        }

        // test ricerca per id non esistente
        Gioco trovato2 = collezione.cercaPerId("ABC");
        if (trovato2 != null) {
            System.out.println("Gioco trovato: " + trovato2);
        } else {
            System.out.println("Gioco non trovato");
        }
    }
}