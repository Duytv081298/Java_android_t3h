public class Bai25 {
    int n;

    void nhap(int gtn) {
        n = gtn;
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println("Năm " + n + " là năm nhuận.");
                } else {
                    System.out.println("Năm " + n + " không phải là năm nhuận.");
                }
            } else {
                System.out.println("Năm " + n + " là năm nhuận.");
            }
        } else {
            System.out.println("Năm " + n + " không phải là năm nhuận.");
        }
    }

    public static void main(String[] args) {
        Bai25 so = new Bai25();
        so.nhap(2004);
        so.nhap(2017);
    }
}
