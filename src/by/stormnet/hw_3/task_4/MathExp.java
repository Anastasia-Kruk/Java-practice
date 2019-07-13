package by.stormnet.hw_3.task_4;

public class MathExp {
    public static void main(String[] args) {
        double degree = 180;
        double radians = Math.toRadians(degree);
        double cos = Math.cos(radians);

        double math = (cos + 256/8 - Math.pow(2,3))* Math.PI ;

        System.out.println("Mathematical expression = " + math);
    }
}
