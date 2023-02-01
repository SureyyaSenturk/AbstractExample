/**
 * BasePhoneManager abstract sınıfım ile abstract metod tanımlayarak çeşitli telefon markalarımın kendine ait fiyat bilgisini hesaplayabildim.
 * @author Süreyya
 * @Date 17.11.2022
 * @since 0.0.1
 * @version 0.0.1
 */
public abstract class BasePhoneManager {
    /**
     * @param price
     * @return
     */

    abstract double buy(double price);

    protected  double otvPrice=0.18;


    private String modelBilgisi;
    private String firmaBilgileri;

    public BasePhoneManager(){

    }
    public BasePhoneManager(String markaBilgileri,String firmaBilgileri){
        this.modelBilgisi = markaBilgileri;
        this.firmaBilgileri=firmaBilgileri;
    }



    public String getModelBilgisi() {
        return modelBilgisi;
    }

    public void setModelBilgisi(String modelBilgisi) {
        this.modelBilgisi = modelBilgisi;
    }

    public String getFirmaBilgileri() {
        return firmaBilgileri;
    }

    public void setFirmaBilgileri(String firmaBilgileri) {
        this.firmaBilgileri = firmaBilgileri;
    }
}