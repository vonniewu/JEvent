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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Event<T> {

    /**
     * This HashMap instance stores EventHandlerID as key and
     * EventHandler as value.
     */
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
        List<EventHandler<T>> eventHandlers = new ArrayList<EventHandler<T>>(eventHandlerMap.values());
        for (EventHandler handler : eventHandlers) {
            handler.invoke(data);
        }
    }
}
