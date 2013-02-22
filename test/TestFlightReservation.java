//Job:

import flight.FlightReservation;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestFlightReservation {

    @Test
    public void shouldKnowWhenThereIsAnAvailableFlight() {
        FlightReservation reservation = new FlightReservation();
        reservation.addFlight("FN1");
        boolean isAvailable = reservation.isFlightAvailable("FN1");
        assertTrue(isAvailable);
    }

    @Test
    public void shouldKnowWhenThereIsNoAvailableFlight() {
        FlightReservation reservation = new FlightReservation();
        boolean isAvailable = reservation.isFlightAvailable("FN1");
        assertFalse(isAvailable);
    }
}
