public class NhanVien extends ConNguoi {
    String chucVu;
    String ngheNghiep;
    float luong;
    public NhanVien(String ten, int tuoi, boolean gioitinh, String diachi, String sdt, String chucVu,String ngheNghiep,float luong) {
        super(ten, tuoi, gioitinh, diachi, sdt);
        this.chucVu = chucVu;
        this.ngheNghiep = ngheNghiep;
        this.luong = luong;
    }

    @Override
    void InThongTin() {
        super.InThongTin();
        System.out.println("Chức Vụ: "+ chucVu);
        System.out.println("Nghề nghiệp: "+ ngheNghiep);
        System.out.println("Lương: "+ luong);
    }
}
