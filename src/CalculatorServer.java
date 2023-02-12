import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorImpl();
            LocateRegistry.createRegistry(8083);
            Naming.rebind("rmi://localhost:8083/CalculatorService", calculator);
            System.out.println("Calculator Server ready.");
        } catch (Exception e) {
            System.out.println("Calculator Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
