package flyweight;

import java.util.HashMap;
import java.util.Map;

public class LoadFactory {

    private static Map<String, Load> loads = new HashMap<>();

    public static Load getLoad(String name, boolean isFlammable) {
        Load load = loads.get(name);
        if (load == null) {
            load = new Load(name, isFlammable);
            loads.put(name, load);
        }
        return load;
    }

    public static int getTotalLoads() {
        return loads.size();
    }
}
