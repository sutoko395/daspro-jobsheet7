import java.util.Scanner;
/**
 * PembayaranParkir23
 */
public class PembayaranParkir23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        double total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();

                if (durasi < 0) {
                    System.out.println("Durasi parkir tidak boleh negatif.");
                    continue;
                }
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            }else if (jenis != 0) {
                System.out.println("Input tidak valid. Silakan masukkan 1 untuk Mobil, 2 untuk Motor, atau 0 untuk keluar.");
            }
        } while (true);

        System.out.println("Total pembayaran parkir: Rp " + total);
        System.out.println("Transaksi selesai.");
        sc.close();
    }
}
