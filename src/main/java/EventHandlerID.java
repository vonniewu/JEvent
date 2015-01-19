/**
 * Created by vonniewu on 1/18/15.
 */
public class EventHandlerID {
    private long id;

    /**
     * The constructor of EventHandlerID
     * @param id an id of type long
     */
    public EventHandlerID (long id) {
        this.id = id;
    }

    /**
     * A method that calculates the hash code of the id
     * @return the hash code of the id with type int
     */
    @Override
    public int hashCode() {
        return Long.valueOf(id).hashCode();
    }

    /**
     * A method that compares the two EventHandlerID for value equality.
     * @param otherID
     * @return a boolean
     */
    @Override
    public boolean equals(Object otherID) {
        if (otherID instanceof EventHandlerID) {
            // cast it.
            // then perform a check.
            EventHandlerID other = (EventHandlerID)otherID;
            return id == other.id;
        }

        return false;
    }
}
