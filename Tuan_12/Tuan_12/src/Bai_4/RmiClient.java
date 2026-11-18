package Bai_4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        MayTinhRemote mt = (MayTinhRemote) registry.lookup("MayTinh");

        System.out.println("8 + 2 = " + mt.cong(8, 2));
        System.out.println("8 - 2 = " + mt.tru(8, 2));
        System.out.println("8 * 2 = " + mt.nhan(8, 2));
        System.out.println("8 / 2 = " + mt.chia(8, 2));
        try {
            mt.chia(8, 0);
        } catch (ArithmeticException e) {
            System.out.println("8 / 0 -> Loi: " + e.getMessage());
        }
    }
}
