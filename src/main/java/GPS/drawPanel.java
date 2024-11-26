package GPS;

import javax.swing.*;
import java.awt.*;

public class drawPanel extends JPanel {
    private Lion lion;
    private Keeper keeper;
    private Drone drone;
    private drawDrone dD;
    private drawLion dL;
    private drawKeeper dK;

    public drawPanel(Lion lion,Keeper keeper, Drone drone) {
        setBackground(Color.WHITE);
        setSize(600,600);
        this.lion = lion;
        this.keeper = keeper;
        this.drone = drone;
        dD = new drawDrone(drone);
        dL = new drawLion(lion);
        dK = new drawKeeper(keeper);

    }
    public void paint(Graphics g) {
        dD.draw(g);
        dL.draw(g);
        dK.draw(g);
    }
    public drawDrone getDD() {
        return dD;
    }
    public drawLion getDL() {
        return dL;
    }
    public drawKeeper getDK() {
        return dK;
    }

}
