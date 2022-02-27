import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to our little app!");

        System.out.println("Would you like to add, subtract, multiply, divide, fibonacci, or convert to binary?");
        String action = scanner.nextLine();

        if (action.equals("add") || action.equals("subtract") || action.equals("multiply") || action.equals("divide")) {
            System.out.println("Enter two numbers separated by space");
            int a = parseInt(scanner.next());
            int b = parseInt(scanner.next());

            switch (action) {
                case "add":
                    System.out.print(calculator.add(a, b));
                    break;
                case "subtract":
                    System.out.print(calculator.subtract(a, b));
                    break;
                case "multiply":
                    System.out.print(calculator.multiply(a, b));
                    break;
                case "divide":
                    System.out.print(calculator.divide(a, b));
                    break;
                default:
                    System.out.println("Sorry. Wrong input");
            }
        } else {
            System.out.println("Enter a number");
            int n = Integer.parseInt(scanner.next());

            switch (action) {
                case "fibonacci":
                    System.out.print(calculator.fibonacciNumberFinder(n));
                    break;
                case "convert to binary":
                    System.out.print(calculator.intToBinaryNumber(n));
                    break;
                default:
                    System.out.print("Input not recognized");
            }
        }
    }
}
