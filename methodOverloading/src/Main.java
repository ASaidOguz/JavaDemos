public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem=new DortIslem();


        //Method overloading ; aynı isimde methodların imzalarını yani
        //aldıkları parametre değerlerini değiştirerek tekrar kullanabılrsın
        //bu işleme method overloding denmektedir.
        System.out.println(dortIslem.topla(3,5));
        System.out.println(dortIslem.topla(3,5,5));

    }
}