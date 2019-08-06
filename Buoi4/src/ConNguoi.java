import java.sql.SQLOutput;

public class ConNguoi {
    String ten;
    int tuoi;
    boolean gioitinh;
    String diachi;
    String sdt;

    public ConNguoi(String ten,int tuoi,boolean gioitinh,String diachi,String sdt){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
    }
    void InThongTin(){
        System.out.println("Tên: "+ ten);
        System.out.println("Tuổi: "+ tuoi);
        System.out.println("Địa Chỉ: "+ diachi);
        System.out.println("Giới Tính: "+ (gioitinh == true ? "Nam":"Nữ"));
        System.out.println("Số Điện Thoại: "+ sdt);

    }
}
