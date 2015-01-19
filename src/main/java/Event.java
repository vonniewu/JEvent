import java.util.ArrayList;
import java.util.HashMap;


public class Event<T> {

    /**
     * A Hashmap that has the event handler id as key and the event handler as value.
     */
    // Making the type of the field an interface/base class of the instance can tell others
    // how you intend to use the instance.
    // For example, you intend to use the HashMap as a Map, and so you don't intend to use any
    // methods specific to HashMap. Of course, only do this if you only want to use the methods in
    // Map (which you happen to do for this class.). Keep this in mind for future refactorings.
    // It might make your life a little easier.
    private final Map<EventHandlerID, EventHandler> eventHandlerMap = new HashMap<EventHandlerID, EventHandler>();

    /**
     * A method that connects an event handler to an event.
     * An event handler ID is generated and stored as the key of the
     * hash map along with the event handler as the value.
     * @param handler EventHandler
     * @return an Event Connection
     */
    public EventConnection<T> connect(EventHandler<T> handler) {
        EventHandlerID id = IDGenerator.generateId();
        eventHandlerMap.put(id, handler);
        return new EventConnection<T>(this, id);
    }

    /**
     * A method that disconnect an event handler from an event
     * by the event handler id. This removes an entry of the
     * event handler hash map by the key.
     * @param id an unique event handler id
     */
    public void disconnect(EventHandlerID id) {
        eventHandlerMap.remove(id);
    }

    /**
     * A method that stores all the event handlers into an
     * ArrayList for future access. It runs through an iteration
     * of all event handlers in the hash map and calls their invoke method.
     * @param data some data with type T
     */
    public void invoke(T data) {
        // Change the type below to List<EventHandler<T>>, for the same reason as stated above.
        List<EventHandler<T>> eventHandlers = new ArrayList<EventHandler<T>>(eventHandlerMap.values());
        for (EventHandler handler : eventHandlers) {
            handler.invoke(data);
        }
    }
}
