package business;

public class TeacherCreditManager extends BaseCreditManager implements IcreditManager {

    @Override
    public void Save() {
        System.out.println("Öğretmen kredisi kaydedildi");
    }

    @Override
    public void Calculate() {
        System.out.println("Öğretmen kredisi kaydedildi");
    }
}
