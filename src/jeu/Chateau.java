package jeu;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class Chateau {
    private static final int RESSOURCES_INITIAL = 3;
    private static final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private int ressources;
    private Couleur couleur;
    private List<Guerrier> guerriersNovices;

=======
/**
 * Classe Chateau représente un château dans un jeu.
 */
public class Chateau {
    private static final int RESSOURCES_INITIAL = 0;
    private static final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;

    private int ressources;
    private Couleur couleur;
    private ArrayList<Guerrier> guerriersNovices;

    /**
     * Constructeur de la classe Chateau.
     * @param couleur La couleur du château.
     */
>>>>>>> 9e0630c (Version test 2)
    public Chateau(Couleur couleur) {
        this.ressources = RESSOURCES_INITIAL;
        this.couleur = couleur;
        this.guerriersNovices = new ArrayList<>();
    }

<<<<<<< HEAD
=======
    /**
     * Ajoute un guerrier novice à la liste des guerriers du château.
     * @param guerrier Le guerrier novice à ajouter.
     */
>>>>>>> 9e0630c (Version test 2)
    public void ajoutGuerrierNovice(Guerrier guerrier) {
        guerriersNovices.add(guerrier);
    }

<<<<<<< HEAD
=======
    /**
     * Récupère la liste des guerriers novices du château.
     * @return Un tableau contenant les guerriers novices.
     */
>>>>>>> 9e0630c (Version test 2)
    public Guerrier[] getGuerriersNovices() {
        return guerriersNovices.toArray(new Guerrier[0]);
    }

<<<<<<< HEAD
    public  Guerrier[] entrainer() {
=======
    /**
     * Entraîne les guerriers novices du château.
     * @return Un tableau contenant les guerriers entraînés.
     */
    public Guerrier[] entrainer() {
>>>>>>> 9e0630c (Version test 2)
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

<<<<<<< HEAD
=======
    /**
     * Incrémente les ressources du château.
     */
>>>>>>> 9e0630c (Version test 2)
    public void incrementerRessources() {
        ressources += RESSOURCE_AJOUTEE_PAR_TOUR;
    }

<<<<<<< HEAD
=======
    /**
     * Récupère la couleur du château.
     * @return La couleur du château.
     */
>>>>>>> 9e0630c (Version test 2)
    public Couleur getCouleur() {
        return couleur;
    }

<<<<<<< HEAD
=======
    /**
     * Vérifie si le château est de couleur bleue.
     * @return True si le château est bleu, sinon False.
     */
>>>>>>> 9e0630c (Version test 2)
    public boolean estBleu() {
        return couleur == Couleur.BLEU;
    }

<<<<<<< HEAD
=======
    /**
     * Vérifie si le château est de couleur rouge.
     * @return True si le château est rouge, sinon False.
     */
>>>>>>> 9e0630c (Version test 2)
    public boolean estRouge() {
        return couleur == Couleur.ROUGE;
    }
}