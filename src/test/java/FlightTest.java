import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        flight = new Flight("647563HGD", "Berlin");

    }

    @Test
    public void planeCountStartsAtZero() {
        assertEquals(0, flight.planeCount());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("647563HGD", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("Berlin", flight.getDestination());
    }

    @Test
    public void canAddPlane() {
        flight.addPlane(plane);
        assertEquals(1, flight.planeCount());

    }
}
