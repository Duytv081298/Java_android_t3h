public class SoNguyen {
    int so;
    void nhap(int gtso){
        so = gtso;
    }
    /**
     *  Nội dung cần ghi chú
     * Kiểm tra số có phải số nguyên tố không
     * @return trả về giá trị true nếu là số nguyên tố
     * false nếu không là số nguyên tố
     * */
    boolean kiemta(){
        for (int i = 2; i < so; i++) {
            if(so%i ==0 ){
                return false;
            }
        }
        return true;
    }

    void inKetQua(){
        boolean check = kiemta();
        if (check == true){
            System.out.println(so + " là số nguyên tố");
        }else System.out.println(so + " không là số nguyên tố");
    }


}
