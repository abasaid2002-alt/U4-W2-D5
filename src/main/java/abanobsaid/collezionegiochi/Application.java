package abanobsaid.collezionegiochi;

public class Application {
    public static void main(String[] args) {

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

        // stampo gli oggetti per vedere se funziona
        System.out.println(v1);
        System.out.println(g1);
    }
}