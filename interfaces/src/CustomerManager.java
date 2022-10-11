public class CustomerManager {
   private ICustomerDal _customerdal;
   public CustomerManager(ICustomerDal customerDal){
       this._customerdal=customerDal;
   }
    public void add(){
        //iş kodları yazılır...

     _customerdal.Add();
    }
}
