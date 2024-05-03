package jeu; /**package ...;

import data.Chateau;
import data.Guerrier;
import utils.ChateauUtilitaire;
import utils.GuerrierUtilitaire;
import java.util.List;
 **/

/**
 *
 * @author fbm
 */
public class TestJeuEtape3 {

    public static void main(String[] args) {
        
        // étape 2 : tester les méthodes de bases
        // étape 4 : tester les affichages
        // étape 5 : tester l'entrainement 
        
        // A COMPLETER : Création d'un objet chateau

        Chateau chateauBleu = new Chateau(Couleur.BLEU);
        Chateau chateaurouge = new Chateau(Couleur.ROUGE);

        // A COMPLETER : Ajouter les guerriers au chateau
        chateauBleu.ajoutGuerrierNovice(new Guerrier());
        chateauBleu.ajoutGuerrierNovice(new Elfe());
        chateauBleu.ajoutGuerrierNovice(new Nain());

        chateaurouge.ajoutGuerrierNovice(new Guerrier());
        chateaurouge.ajoutGuerrierNovice(new Nain());
        chateaurouge.ajoutGuerrierNovice(new ChefElfe());

        // A COMPLETER : Afficher les guerriers contenu dans le chateau (dans l'ordre d'entrainement)

        ChateauUtilitaire.afficherChâteau(chateauBleu);
        ChateauUtilitaire.afficherChâteau(chateaurouge);
        // A COMPLETER : Réaliser un premier entrainement puis afficher les guerriers prets aux combats
        Guerrier[] guerrierEntrainesRouge= chateaurouge.entrainer();
        Guerrier[] guerrierEntrainesBleu = chateauBleu.entrainer();
        chateauBleu.ajoutGuerrierNovice(new Guerrier());
        chateaurouge.ajoutGuerrierNovice(new Guerrier());
        for (Guerrier guerrier : guerrierEntrainesBleu) {
            System.out.println(guerrier);
        }

        for (Guerrier guerrier : guerrierEntrainesRouge) {
            System.out.println(guerrier);
        }
        ChateauUtilitaire.afficherChâteau(chateauBleu);
        ChateauUtilitaire.afficherChâteau(chateaurouge);

        // A COMPLETER : Incrementer les ressources dans un chateau (simuler la fin d'un tour et donc l'ajout de ressources supplémentaires)
        // dans notre cas l'incrémentation se fait directement dans la méthode entrainement
        chateaurouge.incrementerRessources();
        chateauBleu.incrementerRessources();

        
        // A COMPLETER : Réaliser un deuxième entrainement puis afficher les guerriers prets aux combats
        
        // A COMPLETER : Réaliser une itération pour simuler 10 tours : entrainement, affichage des guerriers prets et incrementation des ressources
        // N'hésitez pas à rajouter des guerriers au chateau pour tester votre chateau

        
    }
}
