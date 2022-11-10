import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        double radius= scanner.nextDouble();
        Circle circle = new Circle(scanner.nextDouble());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumferen());
    }
}