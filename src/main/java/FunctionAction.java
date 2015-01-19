/**
 * Created by vonniewu on 1/18/15.
 */
public interface FunctionAction<T> {

    /**
     * A method that invokes a FunctionAction with some data.
     * @param data
     */
    public void invoke(T data);
}
