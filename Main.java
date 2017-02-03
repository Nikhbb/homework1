import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0, b = 0;
        String sign;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sign: ");
        sign = sc.nextLine();

        try {
            System.out.println("Enter number a: ");
            a = sc.nextInt();
            System.out.println("Enter number b: ");
            b = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("ERROR: the number does not integer.");
        }

        Calculator c1 = new Calculator(a, b);

        try {
            System.out.println("Result = " + c1.getResult(sign));
        } catch (MyException e) {
            System.out.println("ERROR: You must enter numbers from -1000 to 1000.");
        }

    }
}
