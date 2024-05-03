package jeu;

public class ChefElfe extends Elfe{
    public ChefElfe() {
    }

    /**
     * Un Chef Elfe inflige 2 fois plus de dégâts qu'un guerrier classique
     * @return
     */
    public int getForce() {
        return super.getForce()*2;
    }
}
