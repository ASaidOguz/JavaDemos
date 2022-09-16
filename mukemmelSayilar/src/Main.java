public class Main {
    public static void main(String[] args) {

        int x=6;
        int sum=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
               sum=(sum+i);
            }
        }

if(sum==x){
    System.out.println("Bu mükemmel bir sayıdır!!");
}else{
    System.out.println("Bu sayı normal bir sayıdır!!");
}

    }
}