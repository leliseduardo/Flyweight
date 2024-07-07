package flyweight;

public class Truck {

    private String name;
    private Load load;

    public Truck(String name, Load load) {
        this.name = name;
        this.load = load;
    }

    public String getTransportInfo() {
        return "Vehicle{" +
                "name='" + this.name + '\'' +
                ", load='" + load.getName() + '\'' +
                ", flammable='" + load.isFlammable() + '\'' +
                '}';
    }
}
