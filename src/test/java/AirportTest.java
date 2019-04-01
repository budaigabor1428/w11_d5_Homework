import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;

    @Before
    public void before() {
        airport = new Airport("GLA");
    }

    @Test
    public void hangarCountStartsAtZero() {
        assertEquals(0, airport.hangarCount());
    }

    @Test
    public void canGetAirportCode() {
        assertEquals("GLA", airport.getAirportCode());
    }
}
