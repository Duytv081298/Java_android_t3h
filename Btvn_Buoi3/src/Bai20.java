public class Bai20 {
    int n;
    int a = 0;

    void nhap(int gtn) {
        n = gtn;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                a = 0;
            } else a = 1;
        }
        if (a == 0) {
            System.out.println(n + " là số chính phương");
        } else System.out.println(n + " không là số chính phương");
    }

    public static void main(String[] args) {
        Bai20 so = new Bai20();
        so.nhap(16);
    }
}
