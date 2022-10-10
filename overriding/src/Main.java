public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java!");

        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new OgretmenKrediManager(),new TarımKrediManager()
        ,new OgrenciKrediManager()};
        for(BaseKrediManager krediManager:krediManagers){
            System.out.println( krediManager.hesapla(1500.00));
            //Aksi söylenmedikçe default olarak overridable
            //Eğer bir fonskiyonu override onlemek istiyorsanız; final anahtar kelimesini
            //example:  public final double  hesapla(double tutar){...}
            //kullanabilirsiniz...

        }


    }
}