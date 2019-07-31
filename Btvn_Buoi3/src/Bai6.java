public class Bai6 {
    float so, tong;
    int tu = 0, mau = 1;

    void nhap(float gtso) {
        so = gtso;
    }

    void nhaptu(int gttu) {
        tu = gttu;
    }

    void nhapmau(int gtmau) {
        mau = gtmau;
    }

    void tinh() {
        if (so > 6) {
            for (float i = 1; i <= so; i++) {
                tong += 1 / ((i+1)*i);
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số > 6");
        }
    }

    void tinh1() {
        if (so > 6) {
            for (int i = 1; i <= so; i++) {
                tu = tu *(i *(i +1) ) + mau;
                mau = (mau*((i+1)*i));
            }
            tong = (float) tu / (float) mau;
            System.out.println("Tổng = " + tu + "/" + mau);
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số > 6");
        }
    }

    public static void main(String[] args) {
        Bai6 so = new Bai6();
        so.nhap(8);
        so.tinh();


        so.tinh1();
    }
}
