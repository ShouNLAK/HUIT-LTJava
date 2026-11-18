package Bai_4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MayTinhImpl extends UnicastRemoteObject implements MayTinhRemote {
    public MayTinhImpl() throws RemoteException {
        super();
    }

    @Override
    public double cong(double a, double b) {
        System.out.println("cong(" + a + ", " + b + ")");
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        System.out.println("tru(" + a + ", " + b + ")");
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        System.out.println("nhan(" + a + ", " + b + ")");
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        System.out.println("chia(" + a + ", " + b + ")");
        if (b == 0) {
            throw new ArithmeticException("Khong chia duoc cho 0");
        }
        return a / b;
    }
}
