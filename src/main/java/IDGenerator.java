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

// When unit testing your code, you'll often fine that testing static classes is near impossible.
// Think about why this is
// If any of your other unit tests use this function, then by the time you get to your
// unit test for this function, it's state will be unspecified.
// You may get false positive or false negatives.
// Instead what you should do is create an "Impl" implementation class that can be instantiated
// run your unit tests on that class and have this static class be a delegate to a static instance
// of that class.
// This way you get the best of both worlds: A unit testable class, and a simple static accessor class.

// public class IDGenerator {
//     private static long currentID = 0;

//     /**
//      * A method that generates an id for event handler.
//      * @return an EventHandlerID
//      */
//     public static EventHandlerID generateId() {
//         return new EventHandlerID (++currentID);
//     }
// }


// Example using a separate implementation class.
public class IDGenerator {
    private static IDGeneratorImpl idGenerator = new IDGeneratorImpl();

    public static EventHandlerID generateId() {
        return new EventHandlerID(idGenerator.generateId());
    }
}
