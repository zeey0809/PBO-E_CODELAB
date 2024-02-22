package modul1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n//input\n");
        System.out.print("Masukan nama: ");
        String nama = scanner.nextLine();

        System.out.print("masukan jenis kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = jenisKelaminInput.equals("p") ? "perempuan" : "laki-laki";

        System.out.print("masukan tanggal lahir(yyyy-mm-dd): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate tanggaSekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, tanggaSekarang);
        int umur = periode.getYears();

        System.out.println("\n//output\n");
        System.out.println("nama : " + nama);
        System.out.println("jenis kelamin : " + jenisKelamin);
        System.out.println("umur : " + umur + "Tahun");

        scanner.close();
    }

}