import java.util.Scanner;
/**
 * Bu sınıf telefon bilgilerinin ekrana yazılmasını sağlayan sınıftır.
 * @author Süreyya
 * @Date 17.11.2022
 * @since 0.0.1
 * @version 0.0.1
 */

public class CustomerManager {
    /**
     * BasePhoneManager tipinde nesne üreterek polimorfizm ile BasePhoneManager sınıfıma erişim sağladım.
     */
    BasePhoneManager basePhoneManager;


    void doTheShopping(){
        System.out.println("*****TELEFON FİYATLANDIRILMASI*****");
        System.out.println("LÜTFEN SATIŞINI YAPACAĞINIZ TELEFONUN FİYAT BİLGİSİNİ GİRİNİZ. ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        System.out.println("Satışını Yapacağınız  Telefon İçin Fiyat Bilgisi: "+ basePhoneManager.buy(price)+  "TL");
        price =  (price+(price*basePhoneManager.otvPrice));
        System.out.println("Satışını Yapacağınız  Telefon İçin Yapılacak Ödeme(Ötv İle Birlikte): "+ basePhoneManager.buy(price)+  "TL");

        System.out.println("****Ürün Bilgileri****\n"
                +"Firma Bilgisi: "+ basePhoneManager.getFirmaBilgileri()+"\n"+
                "Model Bilgisi: "+ basePhoneManager.getModelBilgisi());



    }



}