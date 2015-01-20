

public class Test {
    EventConnection<MouseData> connection;

    public void disconnect() {
        connection.disconnect();
    }

    public Test(Event<MouseData> event) {
        this.connection = event.connect(new EventHandler<MouseData>() {
            @Override
            public void invoke(MouseData data) {
                Test.this.disconnect();
            }
        });
    }
}
