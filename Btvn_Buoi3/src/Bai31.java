public class Bai31 {
    int y, i, j;

    void nhap(int gty) {
        y = gty;
        for (i = 1; i <= y; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
            if (i == y - 1) {
                for (j = 1; j <= i+1; j++)
                    System.out.print("*");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Bai31 so = new Bai31();
        so.nhap(9);
    }
}

