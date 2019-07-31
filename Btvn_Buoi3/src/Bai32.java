public class Bai32 {
    int x,y, i, j;

    void nhap(int gtx,int gty ) {
        x = gtx;
        y = gty;
        for (i = 1; i <= y; i++) {
            if (i == 1) {
                for (j = 1; j <= x; j++)
                    System.out.print("*");
                System.out.print("\n");
            }
            if (i == y - 1) {
                for (j = 1; j <= x; j++)
                    System.out.print("*");
                break;
            }
            for (j = 1; j <= x; j++) {
                if (j == 1 || j == x)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");

        }
    }
    public static void main(String[] args) {
        Bai33 so = new Bai33();
        so.nhap(9,5);
    }
}

