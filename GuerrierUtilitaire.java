import java.util.Random;

public class GuerrierUtilitaire {
    public static void afficherGuerrier(Guerrier guerrier) {
        System.out.println("Force de personnage :"+ guerrier.getForce());
        System.out.println("Points de vie du guerrier : " + guerrier.getPointsDeVie());

    }

    public static int de3faces() {
        Random dé = new Random();
        return dé.nextInt(3) + 1;
    }

    public static int de3faces(int nombreLance) {
        int somme = 0;
        for (int i = 0; i < nombreLance; i++) {
            somme += de3faces();
        }
        return somme;
    }
}