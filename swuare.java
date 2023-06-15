import java.util.Scanner;

public class RoomAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину комнаты (в метрах): ");
        double width = scanner.nextDouble();

        System.out.print("Введите длину комнаты (в метрах): ");
        double length = scanner.nextDouble();

        System.out.print("Введите высоту комнаты (в метрах): ");
        double height = scanner.nextDouble();

        double area = calculateRoomArea(width, length, height);
        System.out.println("Общая площадь комнаты: " + area + " кв. м");

        scanner.close();
    }

    public static double calculateRoomArea(double width, double length, double height) {
        double floorArea = width * length;
        double wallsArea = 2 * (width + length) * height;
        double ceilingArea = width * length;
        double totalArea = floorArea + wallsArea + ceilingArea;
        return totalArea;
    }
}
