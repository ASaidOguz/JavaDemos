public class Main {
    public static void main(String[] args) {
       sayiBulma(9);
    }
          public static void sayiBulma(int sayi){
              int [] sayilar=new int[]{1,2,3,4,5};

              int aranacak=sayi;
              int num=0;
              for(int i=0;i<sayilar.length;i++){
                  if (sayilar[i]==aranacak){
                     mesaj("Aranan sayı bu dizide bulunmaktadır ve indexi %d",i);
                      break;
                  }
                  num++;
              }
              if(num==sayilar.length){
                 mesaj("Dizide böyle bir sayı mevcut değil!!",0);
              }
          }
          public static void mesaj(String  yazi,int i){
             System.out.println(String.format(yazi,i));

          }


          }





