package Models;

public class TaiKhoanAnToan {
    private long soDu;

    public TaiKhoanAnToan (long soDuBanDau) {
        soDu = soDuBanDau;
    }

    public synchronized void napTien (long soTien) {
        long moi = soDu + soTien;
        Thread.yield();
        soDu = moi;
    }

    public synchronized boolean rutTien (long soTien){
        if (soDu >= soTien){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { Thread.currentThread().interrupt();}
            soDu = soDu - soTien;
            return true;
        }
        return false;
    }

    public synchronized long getSoDu()
    {
        return this.soDu;
    }
}
