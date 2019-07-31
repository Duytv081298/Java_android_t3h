public class Bai7 {
    float so, tong;
    int tu = 1, mau = 2;

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
        if (so >= 1) {
            for (float i = 1; i <= so; i++) {
                tong += i /(i+1);
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số >= 1");
        }
    }

    void tinh1() {
        if (so >= 1) {
            for (int i = 2; i <= so; i++) {
                tu = tu*(i+1) +mau*i;
                mau = mau*(i+1);
            }
            tong = (float) tu / (float) mau;
            System.out.println("Tổng = " + tu + "/" + mau);
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số >= 1");
        }
    }

    public static void main(String[] args) {
        Bai7 so = new Bai7();
        so.nhap(8);
        so.tinh();


        so.tinh1();
    }
}
