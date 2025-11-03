
import java.util.Scanner;

public class paket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input berat paket (kg):");
        int berat = in.nextInt();
        System.out.println("input jarak pengiriman (km):");
        int jarak = in.nextInt();

        System.out.println("Input panjang paket  (cm):");
        int panjang = in.nextInt();
        System.out.println("Input lebar paket (cm):");
        int lebar = in.nextInt();
        System.out.println("(Input tinggi paket (cm):)");
        int tinggi = in.nextInt();

        int volume = panjang * lebar * tinggi;
        int biayaBerat;
        if (jarak <= 10) {
            biayaBerat = 4250;
        } else {
            biayaBerat = 6000;
        }

        int biayaperKg;
        if (jarak <= 10) {
            biayaBerat = 4250;
        } else if (jarak > 10) {
            biayaBerat = 6000;
        }

        int biayaTotal = berat * biayaBerat;

        if (volume > 100) {
            biayaBerat = 50000;

            System.out.println("Berat paket: " + berat + " kg");
            System.out.println("Jarak tempuh: " + jarak + " km");
            System.out.println("Volume paket: " + volume + " cm^3");

        
            System.out.println("Biaya total pengiriman: Rp " + biayaTotal);

            in.close();
        }

    }

}
