package lessons.lesson12.practice;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        System.out.println("1. \t Circle: R = " + circle.getRadius());
        System.out.println("\t Area = " + circle.areaFigure());
        System.out.println("\t Perimeter = " + circle.perimeterFigure());
        System.out.println();

        Triangle triangle = new Triangle(10, 20, 20);
        System.out.println("2. \t Triangle with sides: " + triangle.getFirstSideLength() + "; " + triangle.getSecondSideLength() + "; " + triangle.getThirdSideLength());
        System.out.println("\t Area = " + triangle.areaFigure());
        System.out.println("\t Perimeter = " + triangle.perimeterFigure());
        System.out.println();

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("1. \t Rectangle with sides: " + rectangle.getFirstSideLength() + "; " + rectangle.getSecondSideLength() );
        System.out.println("\t Area = " + rectangle.areaFigure());
        System.out.println("\t Perimeter = " + rectangle.perimeterFigure());



    }
}
