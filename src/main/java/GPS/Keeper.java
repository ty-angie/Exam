package GPS;

public class Keeper extends GPStag{
    private String phoneNumber;
    public Keeper(String name, String phoneNumber, int tagID){
        super(tagID, name);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
