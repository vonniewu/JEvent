/**
 * Copyright 2015 Vonnie Wu <vonniew@uci.edu>

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
 * An abstract class that represents a function that should be run when an event is invoked.
 * @param <T>
 */
public abstract class EventHandler<T> {

    /**
     * An abstract method that invokes an EventHandler.
     * @param data
     */
    public abstract void invoke(T data);

    /**
     * A method that converts a FunctionAction to an EventHandler with
     * given implementation for the invoke method.
     * @param functionAction with final keyword
     * @param <Tt>               // Again, what does this mean? What kind of objects should it be?
     * @return an EventHandler
     */
    public static <Tt> EventHandler<Tt> from(final FunctionAction<Tt> functionAction) {
        return new EventHandler<Tt>() {
            @Override
            public void invoke(Tt data) {
                functionAction.invoke(data);
            }
        };
    }
}
