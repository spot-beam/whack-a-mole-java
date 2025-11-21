package game.objects;
import javax.swing.ImageIcon;

public class Mole extends HoleOccupant {
    private static final int SCORE = 100;
    private static final ImageIcon MOLE_IMAGE = new ImageIcon("src/mole.png");

    public Mole(int lifespan) {
        super(lifespan);
    }

    @Override
    public int whack() {
        this.hide();
        return SCORE;
    }

    @Override
    public ImageIcon getImage() {
        return MOLE_IMAGE;
    }
}


