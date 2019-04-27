package Test_26_04;

public class Numbers {
    static int twoNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int num1 = 83;
        int num2 = 64;

        int check = twoNumbers(num1, num2);

        System.out.println("Number " + check + " " + "is bigger.");
    }
}

