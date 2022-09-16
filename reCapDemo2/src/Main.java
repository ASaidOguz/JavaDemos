public class Main {
    public static void main(String[] args) {


        Double[] myList = {23.43, 65.42, 25.34, 50.02};
        Double total = 0.0;
        Double max = myList[0];
        for (Double sayi : myList) {
            if (max < sayi) {
                max = sayi;
            }

            total = total + sayi;
            System.out.println(sayi);
        }
        System.out.println("Dizimizin toplam degeri: " + total);
        System.out.println("En büyük double deger " + max);


    }
}