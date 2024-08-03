import java.util.Scanner;

public class Addition {
    public static void main(String[] arg) {
        int num1, num2;
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("Sum of these numbers is:" + (num1 + num2));

    }
}
