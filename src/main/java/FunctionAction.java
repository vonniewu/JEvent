/**
 * Created by vonniewu on 1/18/15. // Please get rid of this header on every file.
 *                                 // Do copy and paste a copyright statement to each of your source
 *                                 // files and put your name and email in the license.
 *                                 // Here are some common licenses: Apache 2, MIT, BSD, GPL 2 or 3.
 */

// Add a block comment explaining what FunctionAction is.
// Do give some code examples and explain how and where it should be used.
public interface FunctionAction<T> {

    /**
     * A method that invokes a FunctionAction with some data.
     * @param data
     */
    public void invoke(T data); // Data is not a very useful parameter name. Consider calling it
                                // something along the lines of "argument."
}
