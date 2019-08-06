public class SinhVien {
    String ten;
    int tuoi;
    boolean gioitinh;

    public SinhVien(String ten, int tuoi, boolean gioitinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }
    public void inthongtin(){
        System.out.println("Tên: "+ ten + "\ntuổi: "+tuoi + "\nGiới tính: " + (gioitinh == true ? "Nam": "Nữ"));
    }
//    class HocSinh{
//        int tuoi = 15;
//
//        public void sstuoi(){
//            if (SinhVien.this.tuoi>tuoi){
//
//            }
//        }
//        class MamNon{
//            int tuoi = 6;
//            public void sstuoi(){
//                SinhVien.this.tuoi>tuoi
//
//
//            }
//        }
//    }
}
