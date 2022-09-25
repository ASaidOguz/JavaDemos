public class Main {
    public static void main(String[] args) {
        //classes are refernce type!!
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager1=new CustomerManager();
        //Stack ve Heap ===>Stack içinde ayrılan değer bir pointer olarak heapte olan işlemi gösteriyor.
        //new yapıları bellekte yer kaplar ve kullanılırken dikkat edilmelidir.
        System.out.println(customerManager);
        System.out.println(customerManager1);

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        //Referance type example as shown below!!!
        int Sayilar[]=new int[]{1,2,3,4,5};
        int Sayilar1[]=new int[]{6,7,8,9,10};
        Sayilar1=Sayilar;
        Sayilar[0]=10;
        System.out.println(Sayilar1[0]);
    }
}