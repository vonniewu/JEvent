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
 * This class does something but does not return anything.
 * @param <T>
 */

// Add a block comment explaining what FunctionAction is.
// Do give some code examples and explain how and where it should be used.
public interface FunctionAction<T> {

    /**
     * A method that invokes a FunctionAction with some data.
     * @param argument
     */
    public void invoke(T argument); // Data is not a very useful parameter name. Consider calling it
                                // something along the lines of "argument."
}
