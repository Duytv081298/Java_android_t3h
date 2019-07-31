public class Bai16 {
    int n;

    void nhap(int gtn) {
        n = gtn;
        System.out.print("Ước của n là: ");
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Bai16 so = new Bai16();
        so.nhap(10);
    }
}
