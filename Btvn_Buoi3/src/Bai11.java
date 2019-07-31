public class Bai11 {
    int n, tong = 0, tich = 1;


    void nhap(int gtn) {
        n = gtn;
        for (int i = 1; i <= n; i++) {
            tich *= i;
            tong += tich;
        }
        System.out.println("T(1.2.3.4...n) = " + tong);
    }

    public static void main(String[] args) {
        Bai11 so = new Bai11();
        so.nhap(5);
    }
}
