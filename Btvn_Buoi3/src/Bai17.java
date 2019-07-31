public class Bai17 {
    int n, tich = 1, tong = 0;

    void nhap(int gtn) {
        n = gtn;
        System.out.print("Ước của n là: ");
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                tich *= i;
                tong += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTổng các ước của "+  n +" = " + tong);
        System.out.println("Tích các ước của "+  n +" = " + tich);
    }
    public static void main(String[] args) {
        Bai17 so = new Bai17();
        so.nhap(10);
    }
}
