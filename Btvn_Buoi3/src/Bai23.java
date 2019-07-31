public class Bai23 {
    float b, a, x;

    void nhap(float gta, float gtb) {
        a = gta;
        b = gtb;

        if (a == 0) {
            System.out.println("Phương trình " + (int)a + "x + " + (int)b + " = 0" + " vô nghiệm");
        } else {
            x= -b/a;
            System.out.println("Phương trình " + (int)a + "x + " + (int)b + " = 0" + " có nghiệm là " + x);
        }
    }

    public static void main(String[] args) {
        Bai23 so = new Bai23();
        so.nhap(4, 7);
    }
}
