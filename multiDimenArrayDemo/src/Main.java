import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Constructor for 2D array !!
        String[][] my2Darray = new String[3][3];

        my2Darray[0][0] = "İstanbul";
        my2Darray[0][1] = "Bursa";
        my2Darray[0][2] = "Nazilli";
        my2Darray[1][0] = "Karamürsel";
        my2Darray[1][1] = "Edirne";
        my2Darray[1][2] = "İnebolu";
        my2Darray[2][0] = "Rize";
        my2Darray[2][1] = "Karaman";
        my2Darray[2][2] = "Tekirdağ";

for(String[] il:my2Darray){
    System.out.println(Arrays.stream(il).toList());
}


    }
}