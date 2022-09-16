public class Main {
    public static void main(String[] args) {

       char harf='k';

        char[]inceSesli={'e','i','ü','ö'};
        char[]kalinsesli={'a','ı','o','u'};

        for(char diziharf:inceSesli){
            if(diziharf==harf){
                System.out.println("Bu harfimiz inceseslidir!!");
                return;
            }
        }

        for(char diziharf:kalinsesli){
            if(diziharf==harf){
                System.out.println("Bu harfimiz kalın seslidir!!");
                return;
            }
        }
        System.out.println("Bu harfimiz sessiz harftir!!");
    }
}