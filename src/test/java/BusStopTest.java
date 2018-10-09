import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;


    @Before
    public void before() {
        busStop = new BusStop("name");
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("name", busStop.getName());
    }

    @Test
    public void hasQueue() {
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void hasAddToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueue());

    }


}
