package Bai_4;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
    private static MayTinhImpl mayTinh;

    public static void main(String[] args) throws Exception {
        mayTinh = new MayTinhImpl();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("MayTinh", mayTinh);
        System.out.println("Dich vu MayTinh da san sang");
    }
}
