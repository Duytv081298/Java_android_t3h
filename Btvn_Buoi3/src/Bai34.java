public class Bai34 {
    float toan, ly, hoa;
    float avg;
    String  msv, ten;
    void nhap (String gtmsv, String gtten, float gttoan, float gtly, float gthoa){
        toan = gttoan;
        ly = gtly;
        hoa = gthoa;
        msv = gtmsv;
        ten = gtten;
        if (ly <= 10&& toan<= 10&& hoa<=10){
            avg = (toan + ly + hoa)/3;
            if (avg <4){
                System.out.println("Học sinh "+ ten + "\nCó điểm các môn như sau: ");
                System.out.println("Toán: "+ toan+ "\nLý: "+ ly + "\nHóa: " +hoa );
                System.out.println("=> Điểm trung bình: "+ avg );
                System.out.println("=> Học lực yếu");
            }else if (avg <6){
                System.out.println("Học sinh "+ ten + "\nCó điểm các môn như sau: ");
                System.out.println("Toán: "+ toan+ "\nLý: "+ ly + "\nHóa: " +hoa );
                System.out.println("=> Điểm trung bình: "+ avg );
                System.out.println("=> Học lực trung bình");
            }else if (avg <8){
                System.out.println("Học sinh "+ ten + "\nCó điểm các môn như sau: ");
                System.out.println("Toán: "+ toan+ "\nLý: "+ ly + "\nHóa: " +hoa );
                System.out.println("=> Điểm trung bình: "+ avg );
                System.out.println("=> Học lực khá");
            }else if (avg <=10){
                System.out.println("Học sinh "+ ten + "\nCó điểm các môn như sau: ");
                System.out.println("Toán: "+ toan+ "\nLý: "+ ly + "\nHóa: " +hoa );
                System.out.println("=> Điểm trung bình: "+ avg );
                System.out.println("=> Học lực giỏi");
            }
        }else {
            System.out.println("Nhập các điểm <=10");
        }
    }
    public static void main(String[] args) {
        Bai34 so = new Bai34();
        so.nhap("GCH17645","Trịnh Văn Duy", 9,9,5);
    }
}
