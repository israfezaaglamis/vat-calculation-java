import java.util.Scanner;

public class VatCalculation {
    public static void main(String[] args) {
        double amount, vatIncluded,vatAmount, vatRate = 0.18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fiyat giriniz.");
        amount = scanner.nextDouble();

         vatIncluded = amount * vatRate;
         vatAmount = amount + vatIncluded;

        System.out.println(" Kdv'siz tutar : " +amount);
        System.out.println(" Kdv'li tutar : " +vatAmount);
        System.out.println(" Kdv tutarı : " +vatIncluded);
        System.out.println(" Kdv oranı : " + vatRate);



    }
}
