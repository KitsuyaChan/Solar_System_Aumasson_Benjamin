package main;

public class LanceurMeteorite extends CorpsCeleste {
    private static int compteurId = 0;

    public static void main(String[] args) {
        // Instancier une météorite normale
        Meteorite meteoriteNormale = new Meteorite(++compteurId, Type.NORMAL, new Vitesse(10.0, 5.0),new Position(100.0, 200.0));
        System.out.println("Météorite normale créée avec succès : " + meteoriteNormale);

        // Instancier une météorite tueuse de planète
        Meteorite meteoriteTueuse = new Meteorite(++compteurId, Type.TUEUSE_PLANETE, new Vitesse(20.0, 15.0), new Position(300.0, 400.0));
        System.out.println("Météorite tueuse de planète créée avec succès : " + meteoriteTueuse);
    }
}