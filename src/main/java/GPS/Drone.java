package GPS;

public class Drone extends GPStag{
    private String radioF;
    public Drone(String radioF, int tagID, String name){
        super(tagID, name);
        this.radioF = radioF;
    }
    public String getRadioF() {
        return radioF;
    }
}
