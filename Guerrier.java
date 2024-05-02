// Dans le fichier Guerrier.java
public class Guerrier {
    private int force;
    private int pointsDeVie;

    public Guerrier() {
        this.force = 10;
        this.pointsDeVie = 100;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getForce() {
        return force;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    public void attaquer(Guerrier adversaire) {
        int degats = GuerrierUtilitaire.de3faces(getForce()); // Calcul des dégâts
        adversaire.subirDegats(degats);
        afficherDegats(degats);
    }

    public void afficherDegats(int degats) {
        System.out.println("Le guerrier a infligé " + degats + " dégâts.");
    }

    protected void subirDegats(int degats) {
        this.pointsDeVie -= degats;
    }


}