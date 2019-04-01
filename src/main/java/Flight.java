import java.util.ArrayList;

public class Flight {

    private ArrayList<Plane> planes;
    private String flightNumber;
    private String destination;

    public Flight(String flightNumber, String destination) {

        this.planes = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
    }


    public int planeCount() {
        return this.planes.size();
    }


    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }


    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }
}
