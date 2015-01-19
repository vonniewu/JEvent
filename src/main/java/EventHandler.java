/**
 * An abstract class
 * @param <T>
 */
public abstract class EventHandler<T> {

    /**
     * A method that converts a FunctionAction to an EventHandler with
     * given implementation for the invoke method.
     * @param functionAction with final keyword
     * @param <Tt>
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

    /**
     * An abstract method that invokes an EventHandler.
     * @param data
     */
    public abstract void invoke(T data);
}
