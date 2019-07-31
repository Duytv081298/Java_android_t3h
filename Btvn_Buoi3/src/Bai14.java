public class Bai14 {
    int n,x, tong = 0, tich = 1;


    void nhap( int gtx, int gtn) {
        n = gtn;
        x = gtx;
        for (int i = 0; i <= n; i++) {
            tich *= 2*x ;

            tong += tich +x;
        }
        System.out.println("x^(2n+1) = " + tong);
    }
    public static void main(String[] args) {
        Bai14 so = new Bai14();
        so.nhap(2,5);
    }
}
