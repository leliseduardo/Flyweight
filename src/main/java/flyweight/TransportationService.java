package flyweight;

import java.util.ArrayList;
import java.util.List;

public class TransportationService {

    private List<Truck> transportationServices = new ArrayList<>();

    public void registerService(String truckName, String loadName, boolean isFlammable) {
        Load load = LoadFactory.getLoad(loadName, isFlammable);
        Truck truck = new Truck(truckName, load);
        transportationServices.add(truck);
    }

    public List<String> getTrucks() {
        List<String> output = new ArrayList<>();
        for (Truck truck : this.transportationServices) {
            output.add(truck.getTransportInfo());
        }
        return output;
    }
}
