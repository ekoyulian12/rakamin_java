package first_program;

import java.util.Scanner;
public class percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password :");
        String Validpassword = "password";

//        Jika benar maka ("Selamat Datang Bos")
//        Jika salah(else) maka (error message)
        if (password.equals(Validpassword)){
            System.out.println("Selamat Datang Bos");
        } else{
            System.out.println("Password salah, silahkan coba lagi");
        }
        System.out.println("Terima kasih sudah menggunakan aplikasi kami");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
