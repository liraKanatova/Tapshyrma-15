public class Circle {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;

    }

    public double getR() {
        return radius;
    }

    public void setR(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getCircumferen() {
        return Math.PI * 2 * radius;
    }
}