package business;

abstract class BaseCreditManager implements IcreditManager {
//İçi doldurulmamış bir method...
    public abstract void Calculate();
//İçi doldurulmuş bir method...
    @Override
    public void Save() {
        System.out.println("İşlem kaydedildi");
    }
}
