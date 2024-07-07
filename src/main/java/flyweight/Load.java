package flyweight;

public class Load {

    private String name;
    private boolean isFlammable;

    public Load(String name, boolean isFlammable) {
        this.name = name;
        this.isFlammable = isFlammable;
    }

    public String getName() {
        return name;
    }

    public boolean isFlammable() {
        return isFlammable;
    }
}
