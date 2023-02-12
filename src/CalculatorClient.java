import java.rmi.Naming;
import java.util.Scanner;

public class CalculatorClient {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static Calculator calculator;

    public static void main(String[] args) {
        try {
            calculator = (Calculator) Naming.lookup("rmi://localhost:8083/CalculatorService");
        } catch (Exception e) {
            System.err.println("CalculatorClient exception: " + e.getMessage());
            e.printStackTrace();
        }
        int option = 0;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Logarithm (base e)");
            System.out.println("6. Logarithm (base 10)");
            System.out.println("7. Power");
            System.out.println("8. Sine");
            System.out.println("9. Cosine");
            System.out.println("10. Square root");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            option = Integer.parseInt(SCANNER.nextLine());
            switch (option) {
                case 1:
                    calculateTwoOperands("add");
                    break;
                case 2:
                    calculateTwoOperands("subtract");
                    break;
                case 3:
                    calculateTwoOperands("multiply");
                    break;
                case 4:
                    calculateTwoOperands("divide");
                    break;
                case 5:
                    calculateSingleOperand("logE");
                    break;
                case 6:
                    calculateSingleOperand("log10");
                    break;
                case 7:
                    calculateTwoOperands("power");
                    break;
                case 8:
                    calculateSingleOperand("sine");
                    break;
                case 9:
                    calculateSingleOperand("cosine");
                    break;
                case 10:
                    calculateSingleOperand("squareRoot");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 0);
    }

    private static void calculateTwoOperands(String operation) {
        System.out.print("Enter first number: ");
        double a = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Enter second number: ");
        double b = Double.parseDouble(SCANNER.nextLine());
        try {
            switch (operation) {
                case "add":
                    System.out.println("Result: " + calculator.add(a, b));
                    break;
                case "subtract":
                    System.out.println("Result: " + calculator.subtract(a, b));
                    break;
                case "multiply":
                    System.out.println("Result: " + calculator.multiply(a, b));
                    break;
                case "divide":
                    System.out.println("Result: " + calculator.divide(a, b));
                    break;
                case "power":
                    System.out.println("Result: " + calculator.power(a, b));
                    break;
                default:
                    System.err.println("Invalid operation");
            }
        } catch (Exception e) {
            System.err.println("CalculatorClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private static void calculateSingleOperand(String operation) {
        System.out.print("Enter number: ");
        double a = Double.parseDouble(SCANNER.nextLine());
        try {
            switch (operation) {
                case "logE":
                    System.out.println("Result: " + calculator.logE(a));
                    break;
                case "log10":
                    System.out.println("Result: " + calculator.log10(a));
                    break;
                case "sine":
                    System.out.println("Result: " + calculator.sin(a));
                    break;
                case "cosine":
                    System.out.println("Result: " + calculator.cos(a));
                    break;
                case "squareRoot":
                    System.out.println("Result: " + calculator.sqrt(a));
                    break;
                default:
                    System.err.println("Invalid operation");
            }
        } catch (Exception e) {
            System.err.println("CalculatorClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
