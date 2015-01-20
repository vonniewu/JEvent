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
