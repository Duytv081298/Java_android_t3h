public class Bai12 {
    int n,x, tong = 0, tich = 1;


    void nhap( int gtx, int gtn) {
        n = gtn;
        x = gtx;
        for (int i = 1; i <= n; i++) {
            tich *= x ;
            tong += tich;
        }
        System.out.println("x^n = " + tong);
    }
    public static void main(String[] args) {
        Bai12 so = new Bai12();
        so.nhap(2,5);
    }
}
