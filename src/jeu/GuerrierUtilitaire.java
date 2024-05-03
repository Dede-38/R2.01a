package jeu;

import java.util.Random;

public class GuerrierUtilitaire {
    public static void afficherGuerrier(Guerrier guerrier) {
        System.out.println("Force de personnage :"+ guerrier.getForce());
        System.out.println("Points de vie du personnage : " + guerrier.getPointsDeVie());

    }

    /**
     * Initialisation d'un dé qui retourne un resultat aléatoire grâce à la méthode random
     * @return
     */
    public static int de3faces() {
        Random dé = new Random();
        return dé.nextInt(3) + 1;
    }
    /**
     * Initialisation d'un dé qui retourne un resultat aléatoire grâce à la méthode random et d'un nombre de lancés
     * @return
     */
    public static int de3faces(int nombreLance) {
        int somme = 0;
        for (int i = 0; i < nombreLance; i++) {
            somme += de3faces();
        }
        return somme;
    }
}