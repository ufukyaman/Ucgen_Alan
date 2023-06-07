import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int a,b,c;
        double u,alan;

        //Scanner sınıfı
        Scanner imp=new Scanner(System.in);

        //Kullanıcıdan değer alınıp değişkenlere aktarılması
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        a= imp.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b= imp.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        c= imp.nextInt();

        //Üçgenin alanının hesaplanıp ekrana yazdırılması
        u=(a+b+c)/2;
        alan=Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Üçgenin çevresi: "+ 2*u);
        System.out.println("Üçgenin alanı: "+ alan);
    }
}