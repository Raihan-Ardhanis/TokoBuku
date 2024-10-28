package Perulangan.Array;

import java.util.Scanner;
public class tokoBuku {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
    String genreBuku[] = { "Novel", "Ensiklopedia", "Kamus", "Pemrograman" };
    int stock [] = { 24, 34, 78, 102 };

    System.out.println("Pilih Genre Buku : ");
    System.out.println("1. Novel\n2. Ensiklopedia\n3. Kamus\n4. Pemrograman");
    String genre = r.nextLine();

    if (genre.equalsIgnoreCase("1")) {
      System.out.println();
     System.out.println("Stock buku " + genreBuku[0] + " : " + stock[0]);
     System.out.println();
    } else if (genre.equalsIgnoreCase("2")) {
      System.out.println();
      System.out.println("Stock buku " + genreBuku[1] + " : " + stock[1]);
      System.out.println();
    } else if (genre.equalsIgnoreCase("3")) {
      System.out.println();
      System.out.println("Stock buku " + genreBuku[2] + " : " + stock[2]);
      System.out.println();
    } else if (genre.equalsIgnoreCase("4")) {
      System.out.println();
      System.out.println("Stock buku " + genreBuku[3] + " : " + stock[3]);
      System.out.println();
    } else {
      System.out.println("Genre buku yang anda pilih tidak tersedia");
    }r.close();
        
    }

    
}
