public class Main {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        int enbuyuksayi=sayi1;

        if(enbuyuksayi<sayi2){
            if(sayi2>sayi3){
                enbuyuksayi=sayi2;

            }else if (enbuyuksayi<sayi3){
                enbuyuksayi=sayi3;
            }
        }
        System.out.println("En büyük sayı:"+enbuyuksayi);
    }
}