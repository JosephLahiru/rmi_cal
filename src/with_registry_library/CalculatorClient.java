import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            CalculatorIntf calc = (CalculatorIntf) registry.lookup("Calculator");

            Scanner scanner = new Scanner(System.in);
            String operation = "";

            do {
                System.out.print("Enter the first number:");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number:");
                double num2 = scanner.nextDouble();

                System.out.println("Choose an operation\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
                operation = scanner.next();

                switch (operation) {
                    case "1":
                        System.out.println("Addition: " + calc.add(num1, num2));
                        break;
                    case "2":
                        System.out.println("Subtraction: " + calc.subs(num1, num2));
                        break;
                    case "3":
                        System.out.println("Multiplication: " + calc.multi(num1, num2));
                        break;
                    case "4":
                        System.out.println("Division: " + calc.div(num1, num2));
                        break;
                    case "5":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid operation. Please choose a number between 1 and 5.");
                        break;
                }
            } while (!operation.equals("5"));

            scanner.close();
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
