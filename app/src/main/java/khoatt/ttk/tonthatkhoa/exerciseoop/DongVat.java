package khoatt.ttk.tonthatkhoa.exerciseoop;

import android.util.Log;

public class DongVat {
    private String ten;
    private int sochan;

    public DongVat(String Ten, int Sochan) {
        this.ten = Ten;
        this.sochan = Sochan;
    }

    public void setTen(String Ten) {
        this.ten = Ten;
    }

    public String getTen() {
        return ten;
    }

    public void setSochan(int Sochan) {
        if (Sochan >= 1) {
            this.sochan = Sochan;
        } else {
            Log.d("BBB", "Số chân nhập vào không được bé hơn 1");
        }
    }

    public int getSochan() {
        return sochan;
    }
}
