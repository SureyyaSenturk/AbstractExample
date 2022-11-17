/**
 * @since 0.0.1
 * @version 0.0.1
 * @author Süreyya
 * @Date 17.11.2022
 */

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager= new CustomerManager();
        customerManager.basePhoneManager= new ApplePhoneManager("IPHONE 11","APPLE");
      // customerManager.basePhoneManager= new SamsungPhoneManager("Galaxy Z Fold4","SAMSUNG");
      //  customerManager.basePhoneManager= new HuaweiPhoneManager("NOVA 10 PRO","HUAWEİ");
        customerManager.doTheShopping();
    }


}