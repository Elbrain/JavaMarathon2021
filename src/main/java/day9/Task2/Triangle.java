package day9.Task2;

public class Triangle extends Figure {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree, String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double area() {
        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = s * (s - sideOne) * (s - sideTwo) * (s - sideThree);
        return Math.sqrt(area);
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
