public class Bai4 {
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
        if (so > 9) {
            for (float i = 1; i <= so; i++) {
                tong += 1 / (2*i);
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số > 9");
        }
    }

    void tinh1() {
        if (so > 9) {
            for (int i = 1; i <= so; i++) {
                tu = 2*tu * i + mau;
                mau *= i*2;
            }
            tong = (float) tu / (float) mau;
            System.out.println("Tổng = " + tu + "/" + mau);
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số > 9");
        }
    }

    public static void main(String[] args) {
        Bai4 so = new Bai4();
        so.nhap(10);
        so.tinh();


        so.tinh1();
    }
}
