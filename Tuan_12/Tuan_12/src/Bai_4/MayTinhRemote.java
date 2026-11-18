package Bai_4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MayTinhRemote extends Remote {
    double cong(double a, double b) throws RemoteException;

    double tru(double a, double b) throws RemoteException;

    double nhan(double a, double b) throws RemoteException;

    double chia(double a, double b) throws RemoteException;
}
