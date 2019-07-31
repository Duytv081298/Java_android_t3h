public class Bai27 {
    int n;

    void nhap(int gtn) {
        n = gtn;
        System.out.print("Các số nguyên lẻ nhỏ hơn n là: ");
        for (int i = 1; i <= n; i += 2) {
            if (i == 7) {
                continue;
            } else if (i == 21) {
                continue;
            } else if (i == 41) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Bai27 so = new Bai27();
        so.nhap(50);
    }
}
