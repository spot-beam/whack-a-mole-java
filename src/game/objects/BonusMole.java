package game.objects;
import javax.swing.ImageIcon;

public class BonusMole extends HoleOccupant {

    private static final int BONUS_SCORE = 1000;
    private static final ImageIcon BONUS_IMAGE = new ImageIcon("src/bonus.png");

    public BonusMole(int lifespan) {
        super(lifespan);
    }

    @Override
    public int whack() {
        this.hide();
        return BONUS_SCORE;
    }

    @Override
    public ImageIcon getImage() {
        return BONUS_IMAGE;
    }
}