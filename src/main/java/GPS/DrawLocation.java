package GPS;

import javax.xml.stream.Location;
import java.awt.*;

public class DrawLocation extends Canvas {
    private Color colorP;
    private Color colorL;
    private Color colorD;
    private Locate locate;
    private Keeper keeper;
    private Lion lion;
    private Drone drone;
    private Point keeperP;
    private Point lionP;
    private Point droneP;

    public DrawLocation() {
        colorP = Color.BLUE;
        colorL = Color.RED;
        colorD = Color.BLACK;

        keeperP = locate.getKeeperLocation(keeper.getTagID());
        lionP = locate.getLionLocation(lion.getTagID());
        droneP = locate.getDroneLocation(drone.getTagID());


    }
    public void draw(Graphics g) {
        g.setColor(colorP);
        g.drawOval(keeperP.x, keeperP.y, 2, 2);

        g.setColor(colorL);
        g.drawOval(lionP.x, lionP.y, 3, 3);

        g.setColor(colorD);
        g.drawOval(droneP.x, droneP.y, 3, 3);
    }

}
