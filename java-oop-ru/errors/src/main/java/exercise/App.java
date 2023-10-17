package exercise;

// BEGIN
// main/java/exercise/App.java
public class App {
    public static void printSquare(Circle circle) {
        try {
            double square = circle.getSquare();
            System.out.println(Math.round(square));
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }

    public static void main(String[] args) {
        Point center = new Point(0, 0);

        Circle circle1 = new Circle(center, 5);
        Circle circle2 = new Circle(center, -5);

        printSquare(circle1);
        printSquare(circle2);
    }
}
// END
