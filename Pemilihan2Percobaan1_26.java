import java.util.Scanner;
/**
 * Pemilihan2Percobaan1_26
 */
public class Pemilihan2Percobaan1_26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan Tahun : ");
        tahun = input26.nextInt();
        if ((tahun % 400) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
        } else
         System.out.println("Bukan Tahun Kabisat");
    }
}