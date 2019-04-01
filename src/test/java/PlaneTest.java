import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {

        plane = new Plane(PlaneType.AIRBUSA320, "Emirates");
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.AIRBUSA320, plane.getType());
    }

    @Test
    public void canGetAirline() {
        assertEquals("Emirates", plane.getAirline());
    }

    @Test
    public void canGetPassengers() {
        assertEquals(0, plane.passengerCount());
    }

}
