import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String nama;
    int sks;
    String nilaiHuruf;
    double nilaiAngka;

    MataKuliah(String nama, int sks, String nilaiHuruf){
        this.nama = nama;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
        this.nilaiAngka = konversiNilai(nilaiHuruf);
    }

    double konversiNilai(String huruf){
        switch (huruf) {
            case "A":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "B-":
                return 2.7;
            case "C+":
                return 2.3;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    double hitungMutu(){
        return sks * nilaiAngka;
    }
}

public class HitungIPS {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<MataKuliah> daftarMK = new ArrayList<>();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for(int i = 0; i < jumlah; i++){
            System.out.println("\nData Mata Kuliah ke-" + (i+1));

            System.out.print("Nama Mata Kuliah : ");
            String nama = input.nextLine();

            System.out.print("Jumlah SKS : ");
            int sks = input.nextInt();
            input.nextLine();

            System.out.print("Nilai Huruf : ");
            String nilai = input.nextLine();

            MataKuliah mk = new MataKuliah(nama, sks, nilai);
            daftarMK.add(mk);
        }

        double totalMutu = 0;
        int totalSKS = 0;

        for(MataKuliah mk : daftarMK){
            totalMutu += mk.hitungMutu();
            totalSKS += mk.sks;
        }

        double ips = totalMutu / totalSKS;

        System.out.println("\nTotal SKS : " + totalSKS);
        System.out.println("Total Nilai Mutu : " + totalMutu);
        System.out.println("IPS Semester : " + String.format("%.2f", ips));
    }
}