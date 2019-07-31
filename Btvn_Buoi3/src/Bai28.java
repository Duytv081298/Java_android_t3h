public class Bai28 {
    int x, y, i, j;

    void nhap(int gty) {
        y = gty;
        x = 2 * y - 1;
        for (i = 1; i <= y; i++) {
            for (j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
            if (i == y - 1) {
                for (j = 1; j <= x; j++)
                    System.out.print("*");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Bai29 so = new Bai29();
        so.nhap(9);
    }
}
