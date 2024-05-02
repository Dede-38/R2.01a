public class TestEtape2 {
    public static void main(String[] args) {
        //Initialisation des personnages
        Guerrier guerrier1 = new Guerrier();
        Guerrier elfe1 = new Elfe();
        Guerrier nain1 = new Nain();
        Guerrier chefElfe = new ChefElfe();
        Guerrier chefNain = new ChefNain();

        //Affichage des personnages
        GuerrierUtilitaire.afficherGuerrier(guerrier1);
        GuerrierUtilitaire.afficherGuerrier(elfe1);
        GuerrierUtilitaire.afficherGuerrier(nain1);
        GuerrierUtilitaire.afficherGuerrier(chefElfe);
        GuerrierUtilitaire.afficherGuerrier(chefNain);
        // Attaque du guerrier 1 sur le nain
        System.out.println("---------LE GUERRIER 1 ATTAQUE LE NAIN-----------");
        guerrier1.attaquer(nain1);
        System.out.println();
        // Affichage des pv du nain
        System.out.println("L'elfe n'a plus que " + nain1.getPointsDeVie() + " Points de vie ");
        System.out.println();
        System.out.println("---------L'ELFE ATTAQUE LE GUERRIER-----------");
        elfe1.attaquer(guerrier1);
        System.out.println();
        // Affichage des pv du guerrier
        System.out.println("Le guerrier n'a plus que  " + guerrier1.getPointsDeVie() + "Points de vie");
    }
}
