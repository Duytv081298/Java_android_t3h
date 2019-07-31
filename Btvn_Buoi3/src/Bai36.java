public class Bai36 {
    float a, b, c;
    String pheptoan;

    void nhap(float gta, String gtpheptoan, float gtb) {
        a = gta;
        b = gtb;
        pheptoan = gtpheptoan;
        switch (pheptoan) {
            case "+":
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case "-":
                if (a >= b) {
                    c = a - b;
                    System.out.println(a + " - " + b + " = " + c);
                } else {
                    c = b - a;
                    System.out.println(b + " - " + a + " = " + c);
                }
                break;
            case "*":
                c = a * b;
                System.out.println(b + " * " + a + " = " + c);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Nhập số chia khác 0");
                } else {
                    c = a / b;
                    System.out.println(b + " / " + a + " = " + c);
                }
                break;
        }
    }

    public static void main(String[] args) {
        Bai36 so = new Bai36();
        so.nhap(8, "/", 4);
    }

}
