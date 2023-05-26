package hesapmakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  System.out.println("bir isim giriniz");
        //String name = scanner.next();
        // System.out.println(" girilen İsim " + name);

        //   System.out.println(" ilk sayıyı giriniz ");
        //   int sayi1 = scanner.nextInt();

        //  System.out.println(" ikinci sayıyı giriniz ");
        //   int sayi2 = scanner.nextInt();

        //  System.out.println(" toplam = " + (sayi1 + sayi2));

        // işlem işaretini giriniz (ben buraya *,/,+,- giricem
        // sonrasında iki adet sayı alıcak ve girdiğim işleme göre sonuç vericek.)

        System.out.println("işlem işaretini giriniz ");
        String isaret = scanner.next();

        System.out.println(" ilk sayıyı giriniz ");
        int sayi1 = scanner.nextInt();

        System.out.println(" ikinci sayıyı giriniz ");
        int sayi2 = scanner.nextInt();

        if(isaret.equals("-")){
            System.out.println("cikarma = " + (sayi1-sayi2));
        } else if (isaret.equals("+")) {
            System.out.println("toplam = " + (sayi1 + sayi2));

        } else if (isaret.equals("/")) {

            System.out.println("bölme = " + (sayi1 / sayi2));

        } else if (isaret.equals("*")) {
            System.out.println("çarpma = " + (sayi1 * sayi2));

        }else{
            System.out.println("yanlış");
        }
    }
}
