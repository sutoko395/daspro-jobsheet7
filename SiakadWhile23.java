import java.util.Scanner;
/**
 * SiakadWhile23
 */
public class SiakadWhile23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i;
        i = 0;

        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + ":");
            nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiawa ke-" + (i+1) + "adalah A");
            } else if (nilai > 73 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + "adalah B+");
            }else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + "adalah B");
            }else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + "adalah C+");
            }else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + "adalah C+");
            }else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + "adalah C");
            }else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + "adalah D");
            }else
                System.out.println("Nilai mahasiswa ke-" + (i+1) + "adalah E");
            }
            i++;

            sc.close();
        }
    }
