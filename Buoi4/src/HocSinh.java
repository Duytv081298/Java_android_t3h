public class HocSinh extends ConNguoi {
    String mSV;
    float diem;
    public HocSinh(String ten, int tuoi, boolean gioitinh, String diachi, String sdt, String mSV, float diem) {
        super(ten, tuoi, gioitinh, diachi, sdt);
        this.mSV = mSV;
        this.diem = diem;
    }

    @Override
    void InThongTin() {
        super.InThongTin();
        System.out.println("Mã Sinh Viên: "+ mSV);
        System.out.println("Điểm: "+ diem);
    }
}
