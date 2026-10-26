package Models;

public class TaiKhoan {
    private long soDu;

    public TaiKhoan (long soDuBanDau) {
        soDu = soDuBanDau;
    }

    public void napTien (long soTien) {
        long moi = soDu + soTien;
        Thread.yield();
        soDu = moi;
    }

    public boolean rutTien (long soTien){
        if (soDu >= soTien){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { Thread.currentThread().interrupt();}
            soDu = soDu - soTien;
            return true;
        }
        return false;
    }

    public long getSoDu()
    {
        return this.soDu;
    }
}
