package vn.codegym;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Exam4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int namSinh;
        int tuoi;
        Calendar cal = Calendar.getInstance();

        System.out.print("Nhập vào năm sinh: ");
        namSinh = scn.nextInt();

        tuoi = cal.get(Calendar.YEAR) - namSinh;
        System.out.println("Tuổi của bạn là: " + tuoi);
    }
}
