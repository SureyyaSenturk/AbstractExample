/**
 * Bu sınıf Apple telefon markası için bu markaya ait fiyatının hesaplandığı sınıftır.
 * @author Süreyya
 * @Date 17.11.2022
 * @since 0.0.1
 * @version 0.0.1
 * @see {@link BasePhoneManager} BasePhoneManager abstract class extend edilerek abstract metodumu override ettim.
 */
public class ApplePhoneManager extends BasePhoneManager {


    /**
     *
     * @param price  fiyat bilgisini tutabildim.
     * @return ile telefonuma özel indirim tutarını hesaplatıp o değeri döndürebildim.
     */
    @Override
    double buy(double price) {
        return price+(price*20)/100;
    }

    /**
     * Tanımlanan parametreli constructorım ile telefonuma ait markaBilgisi ve fiyatBilgisini tutabildim..
     * @param markaBilgileri
     * @param firmaBilgileri
     */
    public ApplePhoneManager(String markaBilgileri, String firmaBilgileri){
        super(markaBilgileri,firmaBilgileri);

    }


}