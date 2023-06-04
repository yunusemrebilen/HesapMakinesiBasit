import java.util.Scanner;

public class HesapMakine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,secim;
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        n1 = scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        n2= scan.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz :");
        secim =scan.nextInt();

        switch (secim) {
            case 1:
                System.out.print(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.print(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Hatalı işlem girdiniz..");

        }
    }
}
