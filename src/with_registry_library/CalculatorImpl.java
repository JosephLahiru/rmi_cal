import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements CalculatorIntf {
    protected CalculatorImpl() throws RemoteException {
    }

    @Override
    public double add(double a, double b) throws RemoteException {
        return a+b;
    }

    @Override
    public double subs(double a, double b) throws RemoteException {
        return a-b;
    }

    @Override
    public double multi(double a, double b) throws RemoteException {
        return a*b;
    }

    @Override
    public double div(double a, double b) throws RemoteException {
        if(b==0){
            return -1;
        }else{
            return a/b;
        }
    }
}
