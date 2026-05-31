import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class tebak {
    public static void main(String[] args) {
        LinkedList<Integer> histori = new LinkedList<>();
        String[] data = new String[100];
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int index = 0;
        int tebakan;
        int salah = 0;
        String response;

        System.out.println("----------Permainan Tebak Angka----------");
        System.out.println("Tebaklah sebuah angka antara 0 hingga 100");

        do {
            System.out.print("\nMasukkan nama kamu: ");
            data[index] = input.nextLine();
            int randomNum = rand.nextInt(101);
            index++;

            while (true) {
                System.out.print("Masukkan tebakan Anda: ");
                tebakan = input.nextInt();
                input.nextLine();
                if (tebakan < 0 || tebakan > 100) {
                    System.out.println("Tebakan diluar dari angka yang ditentukan. Coba lagi.");
                    continue;
                }
                histori.add(tebakan);
                if (tebakan > randomNum) {
                    System.out.println("Tebakanmu terlalu tinggi. Coba lagi.");
                    salah++;
                    continue;
                } else if (tebakan < randomNum) {
                    System.out.println("Tebakanmu terlalu rendah. Coba lagi.");
                    salah++;
                    continue;
                } else if (tebakan == randomNum) {
                    System.out.println();
                    System.out.println("Selamat! Kamu berhasil menebak angka yang benar setelah " + salah + " kali percobaan");

                    if (salah > 10) {
                        System.out.println("Skill issue lu awokwkwk");
                    }
                }
                break;
            }
            data[index] = histori.toString();
            index++;
            histori.clear();
            System.out.print("\nMau main tebak lagi? (jawab 'YA' jika ingin)\n> ");
            response = input.nextLine();
        } while (response.equalsIgnoreCase("YA"));

        System.out.println("\nHasil permainan:");
        for (int i = 0; i < index; i+=2) {
            System.out.println("Pemain ke-" + ((i / 2) + 1));
            System.out.println("Nama: " + data[i]);
            System.out.println("Histori tebakan: " + data[i + 1]);
            System.out.println();
        }

        input.close();
    }
}