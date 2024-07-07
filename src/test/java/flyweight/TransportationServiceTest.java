package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransportationServiceTest {

    @Test
    void shouldReturnTrucks() {
        TransportationService service = new TransportationService();
        service.registerService("Scania", "Gasoline", true);
        service.registerService("Volvo", "Gasoline", true);
        service.registerService("Mercedes", "Gasoline", true);
        service.registerService("Iveco", "Soybeans", false);

        List<String> expectedOutput = Arrays.asList(
                "Vehicle{name='Scania', load='Gasoline', flammable='true'}",
                "Vehicle{name='Volvo', load='Gasoline', flammable='true'}",
                "Vehicle{name='Mercedes', load='Gasoline', flammable='true'}",
                "Vehicle{name='Iveco', load='Soybeans', flammable='false'}");

        assertEquals(expectedOutput, service.getTrucks());
    }

    @Test
    void shouldReturnTotalLoads() {
        TransportationService service = new TransportationService();
        service.registerService("Scania", "Gasoline", true);
        service.registerService("Volvo", "Gasoline", true);
        service.registerService("Mercedes", "Gasoline", true);
        service.registerService("Iveco", "Soybeans", false);

        assertEquals(2, LoadFactory.getTotalLoads());
    }
}
