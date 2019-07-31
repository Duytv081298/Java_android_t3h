public class Bai9 {
    int so, tich;
    void nhap(int gtso) {
        so = gtso;
    }


    void tinh() {
        if (so > 6) {
            for (float i = 0; i <= so; i++) {
                tich += i;
            }
            System.out.println("Tổng = " + tich);
        } else {
            System.out.println("Vui lòng nhập số > 6");
        }
    }

    public static void main(String[] args) {
        Bai9 so = new Bai9();
        so.nhap(8);
        so.tinh();
    }
}
