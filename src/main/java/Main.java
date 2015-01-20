import java.awt.event.MouseEvent;

public class Main {
    static Event<MouseData> mouseClicked = new Event<MouseData>();
//    EventConnection<MouseData> selfDestructingConnection;
//
//    public void disconnect() {
//        selfDestructingConnection.disconnect();
//    }

    public static void main(String[] args) {
//        EventConnection<MouseData> connection = mouseClicked.connect(new EventHandler<MouseData>() {
//            @Override
//            public void invoke(MouseData data) {
//                System.out.println(data.x);
//                System.out.println(data.y);
//            }
//        });
//
//
//        EventConnection<MouseData> connection2 = mouseClicked.connect(new EventHandler<MouseData>() {
//            @Override
//            public void invoke(MouseData data) {
//                System.out.println(data.x);
//            }
//        });
//
//        FunctionAction<MouseData> function = new FunctionAction<MouseData>() {
//          @Override
//          public void invoke(MouseData data) {
//              // Do stuff with data.
//              System.out.println(data.x);
//              System.out.println(data.y);
//          }
//        };
//
//        EventConnection<MouseData> connection1 = mouseClicked.connect(EventHandler.from(function));
//
//        connection.disconnect();
//        if (connection.isConnected()) {
//
//        }
//        connection.disconnect();  // NO exception is thrown.
//
//        if (connection.disconnect()) {
//            // It was disconnected!!!
//        }
//
//        // I CANNOT do this: AGain.. cannot!!
//        EventConnection<MouseData> con = new EventConnection<MouseData>(null, null);
//
//        // mouse.currentX, mouse.currentY
//        mouseClicked.invoke(new MouseData(10, 100));

        Test test = new Test(mouseClicked);
        mouseClicked.invoke(new MouseData(6, 7));

    }
}

class MouseData {
    public int x;
    public int y;

    public MouseData(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
