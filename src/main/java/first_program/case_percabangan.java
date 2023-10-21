package first_program;

import java.util.Scanner;
public class case_percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai: ");
        int nilai = scanner.nextInt();
        String grade;

        if (true == nilai > 90){
            grade = "A";
        } else if (true == nilai > 80) {
            grade = "B+";
        } else if (true == nilai > 70) {
            grade = "B";
        } else {
            grade = "F";
        }
        System.out.println("Grade anda adalah = " +  grade);
    }
}
