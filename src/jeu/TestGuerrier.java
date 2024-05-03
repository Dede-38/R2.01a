package jeu;

// Dans le fichier TestGuerrier.java
public class TestGuerrier {
    public static void main(String[] args) {
        //Initialisation des 2 guerriers
        Guerrier guerrier1 = new Guerrier();
        Guerrier guerriertest = new Guerrier();
        Guerrier guerrier2= new Guerrier();

        // Attaque du guerrier 1 sur le guerrier 2
        System.out.println("---------LE GUERRIER 1 ATTAQUE LE GUERRIER TEST-----------");
        guerrier1.attaquer(guerriertest);
        System.out.println();
        System.out.println("Le guerrier test n'a plus que " + guerriertest.getPointsDeVie()+" Points de vie ");
        System.out.println();

        // Combat entre les deux guerriers jusqu'à qu'il n'en reste plus qu'un
        System.out.println("--------- COMBAT ENTRE LES 2 GUERRIERS ---------");
        while (guerrier1.estVivant() && guerrier2.estVivant()) {
            guerrier1.attaquer(guerrier2);
            System.out.println("Points de vie du guerrier 2 ");
<<<<<<< HEAD
            System.out.println(guerrier2.getPointsDeVie());
            if (!guerrier2.estVivant()) {
=======
            System.out.println(guerrier2.getPointsDeVie()); // Affichage des points de vies du guerrier 2
            if (!guerrier2.estVivant()) { // Si le guerrier 2 est vivant on continue
>>>>>>> 9e0630c (Version test 2)
                break;
            }
            guerrier2.attaquer(guerrier1);
            System.out.println("Points de vie du guerrier 1 ");
<<<<<<< HEAD
            System.out.println(guerrier1.getPointsDeVie());
            if (!guerrier1.estVivant()) {
                break;
            }            System.out.println();
=======
            System.out.println(guerrier1.getPointsDeVie());// Affichage des points de vies du guerrier 1
            if (!guerrier1.estVivant()) { // Si le guerrier 1 est vivant on continue
                break;
            }   System.out.println();
>>>>>>> 9e0630c (Version test 2)
        }

        // Affichage du résultat du combat
        if (guerrier1.estVivant()) {    // Si le guerrier 1 est vivant
            System.out.println("Le guerrier 1 a gagné !");
        } else {    // Si le guerrier 2 est vivant
            System.out.println("Le guerrier 2 a gagné !");
        }
    }
}
