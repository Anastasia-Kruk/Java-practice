package by.stormnet.hw_3.Task_4;

public class MathExp {
    public static void main(String[] args) {
        // переменная degree не нужна, ты ее передаешь в Math.toRadians 
        double degree = 180;
        double radians = Math.toRadians(180);
        double cos = Math.cos(radians);


        // эти переменные тоже не нужны. Через какое-то время поймешь где нужно выносить, а где можно пренебречь
        int num1 = 256;
        int num2 = 8;
        int num3 = 2;
        int num4 = 3;

        double math = (cos + num1/num2 - Math.pow(num3,num4))* Math.PI ;

        System.out.println("Mathematical expression = " + math);

    }
}
