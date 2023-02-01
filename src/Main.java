import java.util.Scanner;

/**
 * @since 0.0.1
 * @version 0.0.1
 * @author Süreyya
 * @Date 17.11.2022
 */

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager= new CustomerManager();

        Scanner scanner = new Scanner(System.in);
        String secenekler= "****Lütfen Satışı Yapılacak Telefon Markasını Seçiniz****\n"+
                "<APPLE> için 1'e basınız\n"
                +"<SAMSUNG> için 2'ye basınız\n"
                +"<HUAWEİ> için 3'e basınız\n";
        System.out.println(secenekler);
        System.out.println("--İŞLEM SEÇİNİZ--");
        int secenek= Integer.parseInt(scanner.nextLine());
        if(secenek<1 || secenek>3){
            System.out.println("Lütfen Doğru İşlem Seçtiğinizden Emin Olun!!");
        }else {
            switch (secenek){
                case 1->{
                    customerManager.basePhoneManager= new ApplePhoneManager("IPHONE 11","APPLE");
                }
                case 2->{
                    customerManager.basePhoneManager= new SamsungPhoneManager("Galaxy Z Fold4","SAMSUNG");
                }
                case 3->{
                    customerManager.basePhoneManager= new HuaweiPhoneManager("NOVA 10 PRO","HUAWEİ");
                }
            }
        }
        customerManager.doTheShopping();
    }


}

