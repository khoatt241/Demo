package khoatt.ttk.tonthatkhoa.exerciseoop;

import android.util.Log;

public class Chim {
    private String maulong;
    private int kichthuoc;

    public Chim(String Maulong, int Kichthuoc) {
        this.maulong = Maulong;
        this.kichthuoc = Kichthuoc;
    }

    public void setMaulong(String Maulong) {
        this.maulong = Maulong;
    }
    public String getMaulong() {
        return maulong;
    }
    public void setKichthuoc(int Kichthuoc) {
        if(Kichthuoc >= 1) {
            this.kichthuoc = Kichthuoc;
        } else {
            Log.d("BBB","Kích thước nhập vào không được bé hơn 1");
        }
    }
    public int getKichthuoc() {
        return kichthuoc;
    }
}
