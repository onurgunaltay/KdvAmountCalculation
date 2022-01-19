package giris;

import java.util.Scanner;


public class KdvAmountCalculation {
    public static void main(String[] args) {

        // Eğer tutar 0 ile 1000tl arsında ise kdvoranı %18
        // Eğer tutar 1000tl ve üzeri ise kdvoranı %8

        double price, kdv, kdvli;

        Scanner input = new Scanner (System.in);
        System.out.print("Tutarı Gırınız :");
        price = input.nextDouble();

        kdv = ( price >1000) ? 0.08 : 0.18;

        kdvli = price + (price * kdv);
        System.out.println("Kdv'siz tutar :" + price);
        System.out.println("Kdvtutarı :" + kdv);
        System.out.println("Kdvli tutar : " + kdvli);









        }
}
