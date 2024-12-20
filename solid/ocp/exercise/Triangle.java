package solid.ocp.exercise;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
