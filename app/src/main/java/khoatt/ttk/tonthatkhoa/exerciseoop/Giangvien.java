package khoatt.ttk.tonthatkhoa.exerciseoop;

public class Giangvien {
    private String ten;
    private int giolam;

    public Giangvien(String Ten, int Giolam) {
        this.ten = Ten;
        this.giolam = Giolam;
    }

    public void setTen(String Ten) {
        this.ten = Ten;
    }
    public String getTen() {
        return ten;
    }
    public void setGiolam(int Giolam) {
        this.giolam = Giolam;
    }
    public int getGiolam() {
        return giolam;
    }
    public String hienthi() {
        return ten + " " + giolam;
    }
}
