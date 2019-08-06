import java.util.Calendar;

public class Bai35 {
    int namsinh, tuoi;
    String  ten;
    void nhap (String gtten, int gtnamsinh){
        namsinh = gtnamsinh;
        ten = gtten;
        int nam = Calendar.getInstance().get(Calendar.YEAR);
        if (namsinh <= nam){
            tuoi = nam - namsinh;
            System.out.println(ten + " có số tuổi là: "+ tuoi);
        }
    }
    public static void main(String[] args) {
        Bai35 so = new Bai35();
        so.nhap("Trịnh Văn Duy", 1998);
    }
}

