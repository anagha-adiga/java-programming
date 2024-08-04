import java.util.Scanner;

public class SumStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second number:");
        String s2 = scanner.nextLine();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int sum = num1 + num2;
        System.out.println("sum=" + sum);
        scanner.close();
    }
}



