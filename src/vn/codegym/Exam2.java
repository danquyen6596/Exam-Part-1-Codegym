package vn.codegym;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float doC;
        float doF;

        System.out.printf("Nhập vào độ C: ");
        doC = scn.nextFloat();

        doF = (9*doC)/5 + 32;

        System.out.printf("Độ F sau khi đổi là: " + doF);
    }
}
