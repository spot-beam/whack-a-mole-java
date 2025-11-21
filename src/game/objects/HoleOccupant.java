package game.objects;
import javax.swing.ImageIcon;

public abstract class HoleOccupant {
    private boolean isVisible = false;
    private int lifespan;

    public HoleOccupant(int lifespan) {
        this.lifespan = lifespan;
        this.isVisible = true; //objects start visible when spawned (we assume)
    }

    public abstract int whack();
    public abstract ImageIcon getImage();

    public void tick() {
        if (isVisible) {
            this.lifespan--;
            if (this.lifespan <= 0) {
                hide();
            }
        }
    }

    public void hide() {
        this.isVisible = false;
    }

    public boolean isVisible() {
        return isVisible;
    }
}


