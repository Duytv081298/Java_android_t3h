public class HoatDong {
    int thu;

    void nhap(int gtthu) {
        thu = gtthu;
    }

    void getHoatDong() {
        if (thu == 2) {
            System.out.println("Đây là thứ 2");
        } else if (thu == 3) {
            System.out.println("Đây là thứ 3");
        } else if (thu == 4) {
            System.out.println("Đây là thứ 4");
        } else if (thu == 5) {
            System.out.println("Đây là thứ 5");
        } else if (thu == 6) {
            System.out.println("Đây là thứ 6");
        } else if (thu == 7) {
            System.out.println("Đây là thứ 7");
        } else if (thu == 8) {
            System.out.println("Đây là chủ nhật");
        } else System.out.println("Không phải là thứ");
    }

    void getHoatDongTuan2() {
        switch (thu) {
            case (2):
                System.out.println("Đây là thứ 2");
                break;
            case (3):
                System.out.println("Đây là thứ 3");
                break;
            case (4):
                System.out.println("Đây là thứ 4");
                break;
            case (5):
                System.out.println("Đây là thứ 5");
                break;
            case (6):
                System.out.println("Đây là thứ 6");
                break;
            case (7):
                System.out.println("Đây là thứ 7");
                break;
            case (8):
                System.out.println("Đây là chủ nhật");
                break;
            default:
                System.out.println("Không phải là thứ");
                break;
        }
    }

}
