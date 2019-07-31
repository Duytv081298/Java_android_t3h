public class Bai35 {
    int namsinh, tuoi;
    String  ten;
    void nhap (String gtten, int gtnamsinh){
        namsinh = gtnamsinh;
        ten = gtten;
        int nam = cal.get(Calendar.YEAR);
        if (namsinh <= Date().getTime()){
            tuoi = Date().getTime() - namsinh;
            System.out.println(ten + " có số tuổi là: "+ tuoi);
        }
    }
    public static void main(String[] args) {
        Bai35 so = new Bai35();
        so.nhap("Trịnh Văn Duy", 1998);
    }
}

