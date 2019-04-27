package Test_26_04;

import java.util.Scanner;

public class RecFactor {
    int factorial (int n){
        if (n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        RecFactor re = new RecFactor();
        int f = re.factorial(num);

        System.out.println(f);
    }
}
