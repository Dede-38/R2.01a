public class Nain extends Guerrier {
    public Nain() {
        super(); // Appel au constructeur de la classe parent Guerrier
    }

    @Override // Annotation pour indiquer que cette méthode remplace la méthode de la classe parent
    protected void subirDegats(int degats) {
        // Calcul des dégâts pour un Nain : on réduit les dégâts de moitié
        int degatsReduits = degats / 2;
        super.subirDegats(degatsReduits); // Appel à la méthode de la classe parent pour soustraire les dégâts réduits
    }
}
