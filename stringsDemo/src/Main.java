import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String metin = "Bugün hava çok güzel!";
        /*System.out.println(metin);

        System.out.println("Eleman sayısı: " + metin.length());
        System.out.println("6. eleman : " + metin.charAt(6));
        System.out.println(metin.concat("Yaşasın"));
        System.out.println(metin.startsWith("Ba"));
        System.out.println(metin.endsWith("güzel!"));
        char[]slice=new char[5];

        metin.getChars(0,5,slice,0);
        System.out.println(slice);
        //ilk buldugu noktanın index numarsını verir!
        System.out.println(metin.indexOf('a'));
        //Boşlukları saymıyor!
        System.out.println(metin.lastIndexOf("a"));*/
        System.out.println(metin.replace(' ','-'));
        System.out.println(metin.substring(2,5));

        for(String kelime:metin.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(metin.toLowerCase());
        System.out.println(metin.toUpperCase());

        System.out.println(metin.trim());
    }
}