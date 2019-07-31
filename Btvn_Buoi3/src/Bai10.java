public class Bai10 {
    int n,x, t =1;


    void nhap( int gtx, int gtn) {
        n = gtn;
        x = gtx;
        for (float i = 1; i <= n; i++) {
            t *= x;
        }
        System.out.println("T(x,n) = " + t);
    }

    public static void main(String[] args) {
        Bai10 so = new Bai10();
        so.nhap(2, 9);
    }
}
