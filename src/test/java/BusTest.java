import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("destination", 5);
        person = new Person();
        busStop = new BusStop("name");
    }

    @Test
    public void hasDestination() {
        assertEquals("destination", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void hasPassengers() {
        assertEquals(0, bus.getPassengers());
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void hasSpace() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.getPassengers());

    }

    @Test
    public void removePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(2, bus.getPassengers());
    }

    @Test
    public void hasPickUp() {
    busStop.addToQueue(person);
    busStop.addToQueue(person);
    bus.pickUp(busStop);
    assertEquals(1, bus.getPassengers());
    assertEquals(1, busStop.getQueue());
    }

}
