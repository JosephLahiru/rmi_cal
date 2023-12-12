package without_registry_library;

import java.rmi.Naming;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            CalculatorImpl calc = new CalculatorImpl();
            Naming.rebind("rmi:///Calculator", calc);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e);
            e.printStackTrace();
        }
    }
}
