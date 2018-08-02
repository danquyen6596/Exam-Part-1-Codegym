package vn.codegym;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        float diemHoa;
        float diemLy;
        float diemSinh;
        float diemTB;
        float tong;

        Scanner scn = new Scanner(System.in);

        System.out.println("Nhập vào điểm Hóa: ");
        diemHoa = scn.nextFloat();

        System.out.println("Nhập vào điểm Lý: ");
        diemLy = scn.nextFloat();

        System.out.println("Nhập vào điểm Sinh: ");
        diemSinh = scn.nextFloat();

        diemTB = (diemHoa + diemLy + diemSinh)/3;
        tong = diemHoa + diemLy + diemSinh;

        System.out.println("Điểm trung bình là: " + diemTB);
        System.out.println("Tổng điểm là: "+ tong);
    }
}
