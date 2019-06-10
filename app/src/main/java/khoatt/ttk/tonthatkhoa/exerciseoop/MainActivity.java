package khoatt.ttk.tonthatkhoa.exerciseoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DongVat meo = new DongVat("cat", 4);
        meo.setSochan(0);
        Log.d("BBB", meo.getSochan() + "");
        DongVat cho = new DongVat("dog", 4);

        Chim co = new Chim("Đỏ", 50);
        co.setKichthuoc(7);
        Log.d("BBB",co.getKichthuoc() + "");
        Chim gokien = new Chim("Đen",15);

        Giangvien thayPhat = new Giangvien("Phạm Tấn Phát", 234567);
        thayPhat.hienthi();
        Log.d("BBB", thayPhat.hienthi());
        Giangvien thayKhoa = new Giangvien("Khoa",234567);
    }
}
