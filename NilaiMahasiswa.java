import java.util.ArrayList;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> daftarNilai = new ArrayList<>();

        int jumlah;

        try {
            System.out.print("Masukkan jumlah mahasiswa: ");
            jumlah = input.nextInt();

            for (int i = 0; i < jumlah; i++) {
                try {
                    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                    int nilai = input.nextInt();

                    if (nilai < 0 || nilai > 100) {
                        System.out.println("Nilai harus antara 0 - 100!");
                        i--;
                        continue;
                    }

                    daftarNilai.add(nilai);

                } catch (Exception e) {
                    System.out.println("Input harus berupa angka!");
                    input.next(); 
                    i--;
                }
            }

            System.out.println("\nDaftar Nilai Mahasiswa:");
            for (int nilai : daftarNilai) {
                System.out.println(nilai);
            }

        } catch (Exception e) {
            System.out.println("Input jumlah mahasiswa harus berupa angka!");
        }

        input.close();
    }
}