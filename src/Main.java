import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        byte islem;
        double a,b,sonuc;

        System.out.print("Birinci sayıyı giriniz: ");
        a= input.nextDouble();
        System.out.print("\nİkinci sayiyi giriniz: ");
        b= input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        islem= input.nextByte();

        switch (islem) {
            case 1:
                sonuc=a+b;
                System.out.println("İşlem sonucu: "+sonuc);
                break;
            case 2:
                sonuc=a-b;
                System.out.println("İşlem sonucu: "+sonuc);
                break;
            case 3:
                sonuc=a*b;
                System.out.println("İşlem sonucu: "+sonuc);
                break;
            case 4:
                sonuc=a/b;
                System.out.println("İşlem sonucu: "+sonuc);
                break;
        }
    }
}