/**
 * Created by vonniewu on 1/18/15.
 */
public class EventHandlerID {
    private long id;         // Make this a final field. It shouldn't be reassigned.

    /**
     * The constructor of EventHandlerID
     * @param id an id of type long
     */
    // This method does not need to be multiple lines. Remember that code density is a good thing.
    public EventHandlerID (long id) { this.id = id; }

    /**
     * A method that calculates the hash code of the id
     * @return the hash code of the id with type int
     */
    @Override
    // Same here.
    public int hashCode() { return Long.valueOf(id).hashCode(); }

    /**
     * A method that compares the two EventHandlerID for value equality.
     * @param an event handler id object         // This goes for all your @param comments. The purpose of @param is not to state
     *                                           // the name of the parameter (parsers can easily figure this out for you).
     *                                           // Their purpose is to EXPLAIN WHAT the parameter IS, not what it does.
     * @return a boolean that is true when the given instance is equal to this instance.
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
