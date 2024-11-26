package GPS;

import java.awt.*;

public class Locate{
    private Keeper keeper;
    private Lion lion;
    private Drone drone;
    private LocationSystem system;
    public Locate(Keeper keeper, Lion lion, Drone drone) {
        this.keeper = keeper;
        this.lion = lion;
        this.drone = drone;
    }
    public Point getKeeperLocation(int kID) {
        kID = keeper.getTagID();
        try{return system.getCoords(kID);}
        catch(Exception e){
            return null;
        }
    }
    public Point getLionLocation(int lID) {
        lID = lion.getTagID();
        try{
            return system.getCoords(lID);}
        catch(Exception e){
            return null;

        }
    }
    public Point getDroneLocation(int dID) {
        dID = drone.getTagID();
        try{return system.getCoords(dID);}
        catch(Exception e){
            return null;
        }
    }
}
