public class SinhVien {
    String ten;
    int tuoi;
    String gioiTinh;
    String lop;
    float diem;

    void nhap(String ten1, int tuoi1, String gioiTinh1, String lop1, float diem1){
        ten = ten1;
        tuoi = tuoi1;
        gioiTinh = gioiTinh1;
        lop = lop1;
        diem = diem1;
    }

    void InThongTin(){
        System.out.println("Tên: "+ ten +"\nTuổi: " + tuoi+  "\nGiới Tính: " +gioiTinh+  "\nLớp: " + lop + "\nĐiểm: " + diem);
    }
}
