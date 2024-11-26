package GPS;

import java.awt.*;

public class drawDrone {

    private Color colorD;
   private Locate locate;
    private Lion lion;
    private Drone drone;

    private Point droneP;

    public drawDrone(Drone drone) {

        colorD = Color.BLACK;

        droneP = locate.getDroneLocation(drone.getTagID());

    }
    public void draw(Graphics g) {
        g.setColor(colorD);
        g.drawOval(droneP.x, droneP.y, 3, 3);
        g.drawString(drone.getName(), droneP.x+4, droneP.y+4);
        g.drawString(String.valueOf(drone.getRadioF()), droneP.x+4, droneP.y+6);
    }



}
