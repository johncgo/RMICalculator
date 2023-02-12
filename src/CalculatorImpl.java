import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double add(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }

    @Override
    public double logE(double a) throws RemoteException {
        return Math.log(a);
    }

    @Override
    public double log10(double a) throws RemoteException {
        return Math.log10(a);
    }

    @Override
    public double power(double a, double b) throws RemoteException {
        return Math.pow(a, b);
    }

    @Override
    public double sin(double a) throws RemoteException {
        return Math.sin(a);
    }

    @Override
    public double cos(double a) throws RemoteException {
        return Math.cos(a);
    }

    @Override
    public double sqrt(double a) throws RemoteException {
        return Math.sqrt(a);
    }
}
