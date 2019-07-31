public class Bai33 {
    int x,y, i, j;

    void nhap(int gtx,int gty ) {
        x = gtx;
        y = gty;
        for (i = 1; i <= y; i++) {

            for (j = 1; j <= x; j++) {
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Bai32 so = new Bai32();
        so.nhap(9,5);
    }
}

