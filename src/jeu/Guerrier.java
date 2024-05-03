package jeu;

// Dans le fichier Guerrier.java
public class Guerrier {
    /**
     * Initialisation de la force de base du guerrier
     */
    private final int FORCE_BASE =10;
    private int PV_MAX_BASE =100;

    private final int RESSOURCE_BASE =1;

    public Guerrier() {
    }

    /**
     * Getter: retourne le nombre de points de vie du guerrier de base
     * @return
     */
    public int getPointsDeVie() {
        return PV_MAX_BASE;
    }
    /**
     * Getter: retourne la force du guerrier de base
     * @return
     */
    public int getForce() {
        return FORCE_BASE;
    }
    /**
     * Getter: retourne les ressources pour entraîner le guerrier
     * @return
     */
    public int getRessourcesPourEntrainement() {
        return RESSOURCE_BASE;
    }
    /**
     * prend un paramètre entier pointsDeVie et l'affecte de PV_MAX_BASE
     *
     * @return
     */
    public void setPointsDeVie(int pointsDeVie) {
        this.PV_MAX_BASE = pointsDeVie;
    }

    /**
     * prend en paramètres les pv du guerrier et retourne s'il est en vie ou non
     *
     * @return true ou false
     */
    public boolean estVivant() {
        return PV_MAX_BASE > 0;
    }






    public void attaquer(Guerrier adversaire) {
        int degats = GuerrierUtilitaire.de3faces(this.FORCE_BASE); // Calcul des dégâts
        adversaire.subirDegats(degats);
    }

    protected void subirDegats(int degats) {
        this.PV_MAX_BASE -= degats;
    }


}