package GPS;

import java.awt.*;

public class calculateDistance {
    private Locate locate;
    private Keeper keeper;
    private Lion lion;
    public calculateDistance(Keeper keeper, Lion lion) {
        this.keeper = keeper;
        this.lion = lion;

    }
    public double getDistance() {
        Point kp = locate.getKeeperLocation(keeper.getTagID());
        Point lp = locate.getLionLocation(lion.getTagID());
        int x = kp.x - lp.x;
        int y = kp.y - lp.y;
        double d = Math.hypot(x, y);
        return d;
    }
}
