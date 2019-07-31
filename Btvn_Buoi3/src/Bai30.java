public class Bai30 {
    int y, i, j;

    void nhap(int gty) {
        y = gty;
        for (i = 1; i <= y; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");  //in ra màn hình khoảng trắng đến vị trí thứ y-i
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Bai30 so = new Bai30();
        so.nhap(9);
    }
}

