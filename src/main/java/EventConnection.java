/**
 * An Event Connection class.
 * @param <T>
 */
public class EventConnection<T> {

    private Event event;
    private EventHandlerID id;

    /**
     * The constructor for EventConnection class.
     * @param event
     * @param id an unique event handler id
     */
    public EventConnection(Event<T> event, EventHandlerID id) {
        this.event = event;
        this.id = id;
    }

    /**
     * A method to check to see whether a event and event handler are connected
     * @return a boolean value
     */
    public boolean isConnected() {
        return event != null;
    }

    /**
     * A method to check whether a event and event handler are disconnected.
     * If they are not, disconnect them and return true.
     * @return a boolean value
     */
    public boolean disconnect() {
        if (event == null) {
            return false;
        }

        event.disconnect(id);
        event = null;
        return true;
    }
}
