/**
 * Created by vonniewu on 1/18/15.
 */
public class IDGenerator {
    private static long currentID = 0;

    /**
     * A method that generates an id for event handler.
     * @return an EventHandlerID
     */
    public static EventHandlerID generateId() {
        return new EventHandlerID (++currentID);
    }
}
