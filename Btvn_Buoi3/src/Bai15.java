public class Bai15 {
    int n, gt = 1;

    void nhap(int gtn) {
        n = gtn;
        if(n >= 0){
            if(n==0){
                gt = 1;
                System.out.println(n+"! = " + gt);
            }else {
                for (int i = 1; i <= n; i++) {
                    gt *= i;
                }
                System.out.println(n+"! = " + gt);
            }
        }
    }
    public static void main(String[] args) {
        Bai15 so = new Bai15();
        so.nhap(5);
    }
}
