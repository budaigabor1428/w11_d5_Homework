import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane>hangars;
    private String airportCode;

    public Airport(String airportCode) {

        this.airportCode = airportCode;
        this.hangars = new ArrayList<>();
    }

    public int hangarCount() {
        return this.hangars.size();
    }

    public String getAirportCode() {
        return this.airportCode;
    }
}
