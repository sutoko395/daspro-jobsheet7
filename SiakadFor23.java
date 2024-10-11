import java.util.Scanner;
/**
 * SiakadFor23
 */
public class SiakadFor23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jmlhLulus = 0, jmlhTidakLulus = 0,batasKelulusan = 60;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= batasKelulusan) {
                jmlhLulus++;
            } else {
                jmlhTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("Jumlah mahasiswa yang lulus: " + jmlhLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlhTidakLulus);

        sc.close();
    }
}