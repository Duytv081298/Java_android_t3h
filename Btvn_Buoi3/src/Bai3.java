public class Bai3 {
    float so, tong;
    int tu = 1, mau = 1;

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
        if (so >= 7) {
            for (float i = 1; i <= so; i++) {
                tong += 1 / i;
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số >= 7");
        }
    }

    void tinh1() {
        if (so >= 7) {
            for (int i = 2; i <= so; i++) {
                tu = tu * i + mau;
                mau *= i;
            }
            tong = (float) tu / (float) mau;
            System.out.println("Tổng = " + tu + "/" + mau);
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số >= 7");
        }
    }

    public static void main(String[] args) {
        Bai3 so = new Bai3();
        so.nhap(7);
        so.tinh();
        so.tinh1();
    }
}
