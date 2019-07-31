public class KiemTraSoNguyenTo {
    int so;
    SoNguyen sn = new SoNguyen();
    void nhap(int gtso){
        so = gtso;
    }
    void lietke(){
        for (int i =2; i <= so; i++) {

            sn.nhap(i);
            boolean check = sn.kiemta();
            if (check == true){
                System.out.print(i +" ");
            }

//            boolean check = true;
//            for (int j = 2; j < i; j++) {
//                if(i % j == 0 ){
//                    check = false;
//                    break;
//                }
//            }if (check == true){
//                System.out.print(i +" ");
//            }
        }
    }
}

