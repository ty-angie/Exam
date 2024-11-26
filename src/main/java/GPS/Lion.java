package GPS;

public class Lion extends GPStag{
    private int age;
    public Lion(int age, String name, int tagID) {
        super(tagID, name);
        this.age = age;

    }
    public int getAge() {
        return age;
    }
}
