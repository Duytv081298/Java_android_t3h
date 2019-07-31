public class Bai13 {
    int n,x, tong = 0, tich = 1;


    void nhap( int gtx, int gtn) {
        n = gtn;
        x = gtx;
        for (int i = 1; i <= n; i++) {
            tich *= 2*x ;
            tong += tich;
        }
        System.out.println("x^2n = " + tong);
    }
    public static void main(String[] args) {
        Bai13 so = new Bai13();
        so.nhap(2,5);
    }
}
