public class Bai19 {
    int n;
    int a = 0;

    void nhap(int gtn) {
        n = gtn;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
            } else a = 1;
        }
        if (a == 0) {
            System.out.println(n + " là số nguyên tố");
        } else System.out.println(n + " không là số nguyên tố");
    }

    public static void main(String[] args) {
        Bai19 so = new Bai19();
        so.nhap(10);
    }
}
