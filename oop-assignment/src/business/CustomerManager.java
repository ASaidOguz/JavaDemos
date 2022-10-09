package business;

import entities.Customer;

public class CustomerManager extends BaseCreditManager{
    //Adding constructor inside class we add private _customer
    //Classların içinde diğer classların özel instanceları çağırlabilir!!
    //Interface oluşturulunca ;istenilen 2. arguman doğrudan interfacin implemente ettiği
    //classlara yöneliyor.Ardından bu implemente edilmiş fonksiyonları istenilen yerlere
    //aşağıdaki Alltypeofcustomer tarzı bir fonskiyon ile taşıyabiliriz.
    //fonskiyon içinde implemente edilen hangi fonskiyon oldugu belirtiliyor.
    private Customer _customer;
    private IcreditManager _ıcreditmanager;
    public CustomerManager(Customer customer,IcreditManager icreditManager){
        _ıcreditmanager=icreditManager;
        _customer=customer;
    }
    public void CustomerSave(){
        System.out.println("Müşteri kaydedildi!!"+_customer.getFirst_name());
    }
    public void AlltypeofCustomer(){
        _ıcreditmanager.Calculate();
    }
    public void CustomSave(){_ıcreditmanager.Save();}
    @Override
    public void Calculate() {

    }
}
