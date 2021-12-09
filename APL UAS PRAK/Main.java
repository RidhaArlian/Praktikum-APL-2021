//mengimport scanner
import java.util.Scanner;

//Class Main yang merupakan tempat dimana semua file dan class dieksekusi
public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Silahkan Pilih Server yang tersedia: \n1. Superior\n2. Joyfull");
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        StrategyPattern user = new StrategyPattern();

        if (input == 1) {
            user.setIndonesiaReg(new Superior());
        
        }else if (input == 2) {
            user.setIndonesiaReg(new Joyfull());
        }

        System.out.println("\nServer yang anda pilih adalah: " + user.getIndonesiaReg());


        ThailandReg thailand = new Thailand();

        System.out.print("Server " + user.getIndonesiaReg() + " masuk ke dalam Region awal ");
        user.server();

        IndonesiaReg regionServer = new AdapterPattern(thailand);
        System.out.print("\nServer " + user.getIndonesiaReg() + " yang merupakan region awal Indonesia telah diubah menjadi server");
        regionServer.server();
    }
}
