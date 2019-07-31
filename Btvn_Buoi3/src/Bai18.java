public class Bai18 {
    int n, tich = 1, tong = 0;
    int count = 0;
    int countc = 0;

    void nhap(int gtn) {
        n = gtn;
        System.out.print("Ước của n là: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tich *= i;
                tong += i;
                count += 1;
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    countc += 1;
                }
            }
        }
        int a = count - countc;
        System.out.println("\nTổng các ước của " + n + " = " + tong);
        System.out.println("Tích các ước của " + n + " = " + tich);
        System.out.println("Số lượng các ước của " + n + " = " + count);
        System.out.println("Số lượng các ước chẵn của " + n + " = " + countc);
        System.out.println("Số lượng các ước lẻ của " + n + " = " + a);
    }

    public static void main(String[] args) {
        Bai18 so = new Bai18();
        so.nhap(15);
    }
}
