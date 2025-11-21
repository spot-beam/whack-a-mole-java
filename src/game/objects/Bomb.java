package game.objects;
import javax.swing.ImageIcon;

public class Bomb extends HoleOccupant {
    private static final int PENALTY = -500;
    private static final ImageIcon BOMB_IMAGE = new ImageIcon("src/bomb.png");

    public Bomb(int lifespan) {
        super(lifespan);
    }

    @Override
    public int whack() {
        this.hide();
        return PENALTY;
    }

    @Override
    public ImageIcon getImage() {
        return BOMB_IMAGE;
    }
}

