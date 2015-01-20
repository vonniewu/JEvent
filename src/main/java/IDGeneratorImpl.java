// Here you should define an instantiable class that will generate
// unique ids.


public class IDGeneratorImpl {

    private static long currentID = 0;

    public IDGeneratorImpl() { }

    public long generateId() { return ++currentID; }
}
