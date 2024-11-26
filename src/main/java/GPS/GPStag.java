package GPS;

public class GPStag {
    protected int tagID;
    protected String name;
    public GPStag(int tagID, String name) {
        this.tagID = tagID;
        this.name = name;
    }
    public int getTagID() {
        return tagID;
    }
    public String getName() {
        return name;
    }
}
