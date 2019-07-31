public class Bai2 {
    int so, tong;

    void nhap(int gtso) {
        so = gtso;
    }

    void tinh() {
        if (3 < so && so < 50) {
            for (int i = 0; i <= so; i++) {
                tong += i*i;
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số trong khoảng 3< sô cần nhập < 50");
        }
    }

    public static void main(String[] args) {
        Bai2 so = new Bai2();
        so.nhap(5);
        so.tinh();
    }
}
