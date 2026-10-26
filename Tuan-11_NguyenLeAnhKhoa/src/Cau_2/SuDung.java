package Cau_2;

public class SuDung {
    static void main() throws InterruptedException {
        Thread t = new Thread(() -> {
            long ketThuc = System.currentTimeMillis() + 100;
            while (System.currentTimeMillis() < ketThuc) { }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { }
        }, "Bố");

        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(300);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
