package access.modifiers.pointApp;

import access.modifiers.controller.PointController;
import access.modifiers.point.Point;

public class PointApplication {
    public static void main(String[] args) {
        PointController controller = new PointController();
        Point point = new Point (3, 5);
        System.out.println(point);

        controller.addX(point);
        System.out.println("Wspolrzedna x zwiekszona o 1 \n" + point);

        controller.minusX(point);
        System.out.println("Wspolrzedna x zmniejszona o 1 \n" + point);

       controller.addY(point);
        System.out.println("Wspolrzedna y zwiekszona o 1 \n" + point);

        controller.minusY(point);
        System.out.println("Wspolrzedna y zmniejszona o 1 \n" + point);
    }
}
