public class Main {

    //void işlemler veri geri
    // döndürmeyen işlemlerdir
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String mesaj="Bugün hava çok güzel!";
        String yeniMesaj=mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        System.out.println(toplam(5,7));

    }


public static void ekle(){
System.out.println("Eklendi!!");
}

public static void sil(){
    System.out.println("Silindi!!");
}

public static void guncelle(){
    System.out.println("Güncellendi!!");
}

// ... operatörü sayesinde array tarzı bir işlem yapılabilir.
// for ve while döngüleri vasıtasıyla işlem yapabilir.
public static int toplam(int... sayilar){

        return sayilar[0]+sayilar[1];
}

}