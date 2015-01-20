import org.junit.*;

import static org.junit.Assert.*;

public class EventTest {

    @org.junit.Test
    public void eventConstructorShouldReturnAnEvent() {

        Event event = new Event();
        assertTrue(event instanceof Event);
    }

    @org.junit.Test
    public void connectShouldReturnEventConnection() {

        Event event = new Event();
    }

    @org.junit.Test
    public void testConnect() throws Exception {

    }

    @org.junit.Test
    public void testDisconnect() throws Exception {

    }

    @org.junit.Test
    public void testInvoke() throws Exception {

    }
}
