import java.util.Scanner;

public class basamakSayisiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int sayi,toplam =0 ;
        System.out.println("Bir sayı giriniz :");
        sayi= input.nextInt();
        while(sayi>0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Basamak rakamları toplamı : " +toplam);

    }
}
