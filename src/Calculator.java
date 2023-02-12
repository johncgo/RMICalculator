import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    double add(double a, double b) throws RemoteException;
    double subtract(double a, double b) throws RemoteException;
    double multiply(double a, double b) throws RemoteException;
    double divide(double a, double b) throws RemoteException;
    double logE(double a) throws RemoteException;
    double log10(double a) throws RemoteException;
    double power(double a, double b) throws RemoteException;
    double sin(double a) throws RemoteException;
    double cos(double a) throws RemoteException;
    double sqrt(double a) throws RemoteException;
}
