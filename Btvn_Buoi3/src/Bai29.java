public class Bai29 {
    int x, y, i, j;

    void nhap(int gty) {
        y = gty;
        x = 2 * y - 1;
        for (i = 1; i <= y; i++) {
            for (j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Bai28 so = new Bai28();
        so.nhap(9);
    }
}
