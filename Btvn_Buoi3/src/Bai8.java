public class Bai8 {
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
        if (so > 5) {
            for (float i = 0; i <= so; i++) {
                tong += ((2*i +1) /(2*i+2));
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số > 5");
        }
    }

    void tinh1() {
        if (so > 5) {
            for (int i = 1; i <= so; i++) {
                tu = tu*(2*i+2) +mau*(2*i +1);
                mau = mau*(2*i+2);
            }
            tong = (float) tu / (float) mau;
            System.out.println("Tổng = " + tu + "/" + mau);
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số > 5");
        }
    }

    public static void main(String[] args) {
        Bai8 so = new Bai8();
        so.nhap(8);
        so.tinh();

        so.tinh1();
    }
}
