package jeu;

public class ChefNain extends Nain{
    public ChefNain() {
    }

    /**
     * Un Chef Nain  peut subir les dégâts 2 fois plus qu'un Nain
     * @param degats
     */
    protected void subirDegats(int degats) {
        degats /=2 ;
        super.subirDegats(degats);
    }
}
