package jeu;

public class Elfe extends Guerrier{
    public Elfe() {
    }

    /**
     * Un Elfe inflige 2 fois plus de dégâts qu'un Guerrier
     * @return
     */
    public int getForce() {

        return super.getForce()*2;
    }
}
