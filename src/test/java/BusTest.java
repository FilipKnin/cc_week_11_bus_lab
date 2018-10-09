import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    @Before
    public void before(){
        bus = new Bus("destination", 20);
    }

    @Test
    public void hasDestination() {
        assertEquals("destination", bus.getDestination());
    }


}
