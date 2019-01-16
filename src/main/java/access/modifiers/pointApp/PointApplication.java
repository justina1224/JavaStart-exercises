package access.modifiers.pointApp;

import access.modifiers.controller.PointController;
import access.modifiers.point.Point;

public class PointApplication {
    public static final int ADD_X = 0;
    public static final int ADD_Y = 1;
    public static final int MINUS_X = 2;
    public static final int MINUS_Y = 3;

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

        System.out.println("Punkt przed zmiana: \n" + point);

        int option = 0;

        switch(option) {
            case ADD_X:
                controller.addX(point);
                break;
            case MINUS_X:
                controller.minusX(point);
                break;
            case ADD_Y:
                controller.addY(point);
                break;
            case MINUS_Y:
                controller.minusY(point);
                break;
            default:
                System.out.println("Podana wartość jest nieprawidlowa");
        }
        System.out.println("Punkt po zmianie: \n" + point);
    }
}
