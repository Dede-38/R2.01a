package jeu;

import java.util.ArrayList;
import java.util.List;

public class Chateau {
    private static final int RESSOURCES_INITIAL = 3;
    private static final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private int ressources;
    private Couleur couleur;
    private List<Guerrier> guerriersNovices;

    public Chateau(Couleur couleur) {
        this.ressources = RESSOURCES_INITIAL;
        this.couleur = couleur;
        this.guerriersNovices = new ArrayList<>();
    }

    public void ajoutGuerrierNovice(Guerrier guerrier) {
        guerriersNovices.add(guerrier);
    }

    public Guerrier[] getGuerriersNovices() {
        return guerriersNovices.toArray(new Guerrier[0]);
    }

    public  Guerrier[] entrainer() {
        List<Guerrier> guerriersEntraines = new ArrayList<>();

        for (Guerrier guerrier : guerriersNovices) {
            if (guerrier.getRessourcesPourEntrainement() <= ressources) {
                ressources -= guerrier.getRessourcesPourEntrainement();
                guerriersEntraines.add(guerrier);
            }
        }

        guerriersNovices.removeAll(guerriersEntraines);

        return guerriersEntraines.toArray(new Guerrier[0]);
    }

    public void incrementerRessources() {
        ressources += RESSOURCE_AJOUTEE_PAR_TOUR;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public boolean estBleu() {
        return couleur == Couleur.BLEU;
    }

    public boolean estRouge() {
        return couleur == Couleur.ROUGE;
    }
}