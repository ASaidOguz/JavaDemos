public class Main {
    public static void main(String[] args) {

        int [] sayilar=new int[]{1,2,3,4,5};

        int aranacak=9;
        int num=0;
        for(int i=0;i<sayilar.length;i++){
            if (sayilar[i]==aranacak){
                System.out.println(String.format("Aranan sayı bu dizide bulunmaktadır ve indexi %d",i));
                 break;
            }
            num++;
        }
          if(num==sayilar.length){
              System.out.println("Dizide böyle bir sayı mevcut değil!!");
          }
    }
}