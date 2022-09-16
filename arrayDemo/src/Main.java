public class Main {
    public static void main(String[] args) {


        String ogrenci1 = "Raymond";
        String ogrenci2 = "Russell";
        String ogrenci3 = "Jackson";

        String[] ogrenciler = {"Raymond", "Russell", "Jackson"};


        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------->>>>>");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }


    }
}