package jeu;

/**
 *
 * @author fbm rev hb
 */
public class ChateauUtilitaire {
    public static void afficherChâteau(Chateau chateau) {
        System.out.println("-----------------------------------------");
        // Affichage de la couleur du château
        System.out.println("ORDRE D'ENTRAINEMENT Château " + chateau.getCouleur());
        // Affichage des guerriers du château
        for (Guerrier guerrier : chateau.getGuerriersNovices()) {
            System.out.println(guerrier.getClass().getSimpleName()+"_"+ chateau.getCouleur() + "[PV " + guerrier.getPointsDeVie() + "], cout : " + guerrier.getRessourcesPourEntrainement());
        }
    }
}
