public class Bai26 {
    int n;
    void nhap(int gtn) {
        n = gtn;
        System.out.print("Các số nguyên lẻ nhỏ hơn n là: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Bai26 so = new Bai26();
        so.nhap(10);
    }
}
