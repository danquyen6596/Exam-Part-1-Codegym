package vn.codegym;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final float PI = 3.14159f;
        float dienTich;
        float chuVi;
        float banKinh;

        System.out.printf("Nhập vào bán kính: ");
        banKinh = scn.nextFloat();

        dienTich = banKinh*banKinh*PI;
        chuVi = 2*PI*banKinh;

        System.out.printf("Diện tích hình tròn là: " + dienTich +"\n");
        System.out.println("Chu vi hình tròn là: "+ chuVi);
    }
}
