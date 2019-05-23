package lessons.lesson12.practice;

public class Triangle extends Figure {
    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;

    public Triangle(double firstSideLength, double secondSideLength, double thirdSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
    }

    @Override
    public double areaFigure() {
        double p = ((firstSideLength + secondSideLength + thirdSideLength) / 2);

        return Math.sqrt(p * (p - firstSideLength) * (p - secondSideLength) * (p - thirdSideLength));
    }

    @Override
    double perimeterFigure() {
        return firstSideLength + secondSideLength + thirdSideLength;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public void setFirstSideLength(double firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(double secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    public double getThirdSideLength() {
        return thirdSideLength;
    }

    public void setThirdSideLength(double thirdSideLength) {
        this.thirdSideLength = thirdSideLength;
    }
}
