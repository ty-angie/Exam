package GPS;

import java.awt.*;

public class drawKeeper {
    private Color colorP;

    private Locate locate;
    private Keeper keeper;

    private Point keeperP;


    public drawKeeper(Keeper keeper) {
        this.keeper = keeper;
        colorP = Color.BLUE;
        keeperP = locate.getKeeperLocation(keeper.getTagID());

    }
    public void draw(Graphics g) {
        g.setColor(colorP);
        g.drawOval(keeperP.x, keeperP.y, 2, 2);
        g.drawString(keeper.getName(), keeperP.x+4, keeperP.y+4);
        g.drawString(keeper.getPhoneNumber(), keeperP.x+4, keeperP.y+6);

    }

}
