public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Trịnh Văn Duy", 22, true);
        sv.inthongtin();
        System.out.println("======================================");
        HocSinh hs = new HocSinh("Tam", 19, true, "Hà Nội", "0369549798", "GCH17645", 9.8f);
        hs.InThongTin();
        System.out.println("======================================");
        NhanVien nv = new NhanVien("Hoa", 25, true, "Hà Nam", "0949086868", "Trưởng lao công", "Dọn rác", 1999999.f );
        nv.InThongTin();
    }
}
