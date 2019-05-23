package lessons.lesson12.practice;

public class Circle extends Figure {
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeterFigure() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
