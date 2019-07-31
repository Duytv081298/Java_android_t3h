public class Bai1 {
    int so, tong;

    void nhap(int gtso) {
        so = gtso;
    }

    void tinh() {
        if (3 < so && so < 50) {
            for (int i = 0; i <= so; i++) {
                tong += i;
            }
            System.out.println("Tổng = " + tong);
        } else {
            System.out.println("Vui lòng nhập số trong khoảng 3< sô cần nhập < 50");
        }
    }

    public static void main(String[] args) {
        Bai1 so = new Bai1();
        so.nhap(460);
        so.tinh();
    }
}
