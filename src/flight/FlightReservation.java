package flight;
//Job: 

import java.util.ArrayList;

public class FlightReservation {

    private ArrayList<String> availableFlights = new ArrayList<String>();

    public boolean isFlightAvailable(String flightNumber) {
        return availableFlights.contains(flightNumber);
    }

    public void addFlight(String flightNumber) {
        availableFlights.add(flightNumber);
    }
}
