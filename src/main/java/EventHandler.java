/**
 * An abstract class
 * @param <T>
 */
public abstract class EventHandler<T> {

    /**
     * A method that converts a FunctionAction to an EventHandler with
     * given implementation for the invoke method.
     * @param functionAction with final keyword
     * @param <Tt>               // Again, what does this mean? What kind of objects should it be?
     * @return an EventHandler
     */


    // Consider putting your static methods at the bottom of the class.
    // You might want to follow a class method ordering such as this:
    // Public Fields
    // Private Fields
    // Constructors public/private/protected
    // Public Methods
    // Protected Methods
    // Private Methods
    // Public Static Methods
    // Private Static Methods
    // Having a consistent order makes your code easier to read about.
    // This is not an argument about correctness, it's an argument about consistency.
    public static <Tt> EventHandler<Tt> from(final FunctionAction<Tt> functionAction) {
        return new EventHandler<Tt>() {
            @Override
            public void invoke(Tt data) {
                functionAction.invoke(data);
            }
        };
    }

    /**
     * An abstract method that invokes an EventHandler.
     * @param data
     */
    public abstract void invoke(T data);
}
