public class Bai5 {
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
        if (so >= 2) {
            for (float i = 1; i <= so; i++) {
                tong += 1 / ((2*i)+1);
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số >= 2");
        }
    }

    void tinh1() {
        if (so >= 2) {
            for (int i = 1; i <= so; i++) {
                tu = tu *(2 * i +1) + mau;
                mau = (mau*((i*2)+1));
            }
            tong = (float) tu / (float) mau;
            System.out.println("Tổng = " + tu + "/" + mau);
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số >= 2");
        }
    }

    public static void main(String[] args) {
        Bai5 so = new Bai5();
        so.nhap(4);
        so.tinh();


        so.tinh1();
    }
}
