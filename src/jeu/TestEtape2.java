package jeu;

public class TestEtape2 {
    public static void main(String[] args) {
        //Initialisation des personnages
        Guerrier guerrier1 = new Guerrier();
        Guerrier elfe1 = new Elfe();
        Guerrier nain1= new Nain();
        Guerrier chefElfe = new ChefElfe();
        Guerrier chefNain = new ChefNain();

        //Affichage des personnages
        System.out.println("---------CARACTERISTIQUES DU GUERRIER---------");
        GuerrierUtilitaire.afficherGuerrier(guerrier1);
        System.out.println("---------CARACTERISTIQUES DU ELFE---------");
        GuerrierUtilitaire.afficherGuerrier(elfe1);
        System.out.println("---------CARACTERISTIQUES DU CHEF ELFE ---------");
        GuerrierUtilitaire.afficherGuerrier(chefElfe);
        System.out.println("---------CARACTERISTIQUES DU NAIN---------");
        GuerrierUtilitaire.afficherGuerrier(nain1);
        System.out.println("---------CARACTERISTIQUES DU CHEF NAIN---------");
        GuerrierUtilitaire.afficherGuerrier(chefNain);
        // Combat entre les deux guerriers jusqu'à qu'il n'en reste plus qu'un
        System.out.println("--------- COMBAT ENTRE LE GUERRIER ET L'ELFE ---------");
            guerrier1.attaquer(elfe1);
            System.out.println("Points de vie de l'elfe");
            System.out.println(elfe1.getPointsDeVie());
            elfe1.attaquer(guerrier1);
            System.out.println("Points de vie du guerrier 1 ");
            System.out.println(guerrier1.getPointsDeVie());

    }
}
