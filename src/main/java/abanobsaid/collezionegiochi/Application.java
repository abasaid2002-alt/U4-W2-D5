package abanobsaid.collezionegiochi;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Collezione collezione = new Collezione();

        Videogioco v1 = new Videogioco(
                "VG1",
                "Fifa 25",
                2025,
                79.99,
                "PS5",
                60,
                "Sport"
        );

        Videogioco v2 = new Videogioco(
                "VG2",
                "Resident Evil",
                2024,
                49.99,
                "PC",
                20,
                "Horror"
        );

        GiocoDaTavolo g1 = new GiocoDaTavolo(
                "GT1",
                "Monopoly",
                2020,
                29.99,
                4,
                90
        );

        GiocoDaTavolo g2 = new GiocoDaTavolo(
                "GT2",
                "Uno",
                2019,
                9.99,
                4,
                20
        );

        GiocoDaTavolo g3 = new GiocoDaTavolo(
                "GT3",
                "Scacchi",
                2018,
                19.99,
                2,
                60
        );

        // aggiunta giochi
        System.out.println(" AGGIUNTA ");
        System.out.println("Aggiunta v1: " + collezione.aggiungiGioco(v1));
        System.out.println("Aggiunta v2: " + collezione.aggiungiGioco(v2));
        System.out.println("Aggiunta g1: " + collezione.aggiungiGioco(g1));
        System.out.println("Aggiunta g2: " + collezione.aggiungiGioco(g2));
        System.out.println("Aggiunta g3: " + collezione.aggiungiGioco(g3));

        System.out.println();

        // ricerca per id
        System.out.println(" CERCA PER ID ");
        Gioco trovato = collezione.cercaPerId("VG1");
        System.out.println("Gioco trovato: " + trovato);

        System.out.println();

        // ricerca per prezzo
        System.out.println(" CERCA PER PREZZO ");
        List<Gioco> giochiEconomici = collezione.cercaPerPrezzo(30);

        for (Gioco g : giochiEconomici) {
            System.out.println(g);
        }

        System.out.println();

        // ricerca per numero giocatori
        System.out.println(" CERCA PER NUMERO GIOCATORI ");
        List<GiocoDaTavolo> giochiPer4 = collezione.cercaPerNumeroGiocatori(4);

        for (GiocoDaTavolo g : giochiPer4) {
            System.out.println(g);
        }

        System.out.println();

        // statistiche
        System.out.println(" STATISTICHE ");
        System.out.println("Numero videogiochi: " + collezione.contaVideogiochi());
        System.out.println("Numero giochi da tavolo: " + collezione.contaGiochiDaTavolo());
        System.out.println("Gioco più costoso: " + collezione.giocoPiuCostoso());
        System.out.println("Prezzo medio: " + collezione.prezzoMedio());

        System.out.println();

        // rimozione
        System.out.println(" RIMOZIONE ");
        collezione.rimuoviGioco("GT2");

        System.out.println("Lista aggiornata dopo la rimozione:");
        for (Gioco g : collezione.getGiochi()) {
            System.out.println(g);
        }

        System.out.println();

        // aggiornamento
        System.out.println(" AGGIORNAMENTO ");
        Videogioco v1Aggiornato = new Videogioco(
                "VG1",
                "Fifa 25 Updated",
                2025,
                69.99,
                "PS5",
                70,
                "Sport"
        );

        collezione.aggiornaGioco("VG1", v1Aggiornato);

        System.out.println("Lista aggiornata dopo l'aggiornamento:");
        for (Gioco g : collezione.getGiochi()) {
            System.out.println(g);
        }
    }
}