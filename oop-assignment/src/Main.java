import business.*;
import entities.CompanyCustomer;
import entities.Customer;

public class Main {
    public static void main(String[] args) {
//Abstract ve interface arasındaki fark nedir ?
        //creating instance
        CreditManager creditManager=new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        //creating instance
        Customer customer=new Customer();
        customer.setId(1);
        customer.setFirst_name("Ahmet Said");
        customer.setLast_name("Oğuz");
        customer.setNational_id("12345678");
        customer.setAge(37);

        CompanyCustomer companyCustomer=new CompanyCustomer();
        companyCustomer.setFirst_name("Ömer Yakup");

        //creating instance
        //interface aslında bi tür lakab;bu lakaba sahib olan classları aynı
        //çatı altında toplayabiliriz.
        CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());

        customerManager.AlltypeofCustomer();
        customerManager.Save();



    }
}