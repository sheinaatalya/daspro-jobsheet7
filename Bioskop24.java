
import java.util.Scanner;

public class Bioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan ulang!");
                continue;
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga = totalHarga - (totalHarga * diskon);

            totalTiket += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Harga sebelum diskon: Rp"
                    + (jumlahTiket * HARGA_TIKET));
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total pembayaran: Rp" + totalHarga);
            System.out.println();
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp" + totalPendapatan);

        sc.close();
    }
}
