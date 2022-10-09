package business;

public class MilitaryCreditManager extends BaseCreditManager implements IcreditManager {
    @Override
    public void Save() {
       System.out.println("Askeriye kredisi kaydedildi");
    }

    @Override
    public void Calculate() {
        System.out.println("Askeriye kredisi hesaplandı");
    }
}
