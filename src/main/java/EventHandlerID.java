/**
 * Copyright 2014 Vonnie Wu <vonniew@uci.edu>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */


/**
 * This class initializes an EventHandlerID and the HashCode of the id.
 */
public class EventHandlerID {
    private final long id;

    /**
     * The constructor of EventHandlerID
     * @param id an id of type long
     */
    public EventHandlerID (long id) { this.id = id; }

    /**
     * A method that calculates the hash code of the id
     * @return the hash code of the id with type int
     */
    @Override
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
            EventHandlerID other = (EventHandlerID)otherID;
            return id == other.id;
        }

        return false;
    }
}
