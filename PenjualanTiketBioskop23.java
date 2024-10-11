import java.util.Scanner;
/**
 * InnerPenjualanTiketBioskop23
 */
public class PenjualanTiketBioskop23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000,totalTiket = 0;
        double totalPenjualan = 0;
        boolean selesai = false;

        while (!selesai) {
            System.out.print("Masukkan jumlah tiket yang terjual (atau -1 untuk selesai): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == -1) {
                selesai = true;
            } else if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang benar.");
                continue;
            } else {
                totalTiket += jumlahTiket;

                double hargaTotal = jumlahTiket * hargaTiket;
                if (jumlahTiket > 10) {
                    hargaTotal *= 0.85;
                } else if (jumlahTiket > 4) {
                    hargaTotal *= 0.90;
                }

                totalPenjualan += hargaTotal;
                System.out.println("Penjualan untuk " + jumlahTiket + " tiket adalah: Rp " + hargaTotal);
            }
        }

        System.out.println("\nTotal tiket yang terjual hari ini: " + totalTiket);
        System.out.println("Total penjualan tiket hari ini: Rp " + totalPenjualan);

        sc.close();
    }
}