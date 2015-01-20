/**
 * Copyright [yyyy] Vonnie Wu

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
    public void disconnect() {
        if (event != null) {
            event.disconnect(id);
            event = null;
        }
    }
}
