public class Bai24 {
    float b, a, c, delta, x, x1, x2;

    void nhap(float gta, float gtb, float gtc) {
        a = gta;
        b = gtb;
        c = gtc;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                x = (-c) / b;
                System.out.println("Phương trình có nghiệm là " + x);
            }
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm là x1 = x2 = " + x);
            } else {
                x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm là: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }

        }
    }

    public static void main(String[] args) {
        Bai24 so = new Bai24();
        so.nhap(0, 0, 0);
    }
}
