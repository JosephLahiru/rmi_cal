package with_registry_library;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorIntf extends Remote {
    public double add(double a, double b) throws RemoteException;
    public double subs(double a, double b) throws RemoteException;
    public double multi(double a, double b) throws RemoteException;
    public double div(double a, double b) throws RemoteException;
}
