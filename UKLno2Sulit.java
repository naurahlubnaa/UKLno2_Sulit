import java.util.Scanner;

public class UKLno2Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENJUMLAHAN DUA MATRIKS ===");

        //Input ukuran matriks
        System.out.println("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("A["+ i +"]["+ j +"] = ");
                matriksA[i][j] = input.nextInt();

            }
        }
        //Siapkan matriks B dan matriks hasil
        int [][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("Masukkan elemen-elemen Matriks B: ");
        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++) {
                System.out.print("B["+ i +"]["+ j +"] = ");
                matriksB[i][j] = input.nextInt();
            }
        }

        //Proses penjumlahan
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++){
                hasil[i][j] = matriksA[i][j] +matriksB[i][j];

            }
        }
        //Menampilkan hasil
        System.out.println("=== HASIL PENJUMLAHAN MATRIKS ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
        input.close();
    }    
}
