import java.lang.reflect.Array;
import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private String airline;
    private ArrayList<String> passengers;

    public Plane(PlaneType planeType, String airline) {

        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();

    }

    public PlaneType getType() {
        return this.planeType;
    }


    public String getAirline() {
        return this.airline;
    }

    public int passengerCount() {
        return this.passengers.size();
    }
}
