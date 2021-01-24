import java.util.Random;

public class Example10 {
    public static void main(String[] args) {

        int x = 102;
        if (x%10==1 & x%100 != 11){
            System.out.println( x + " программист ");
        }
        if (x%10>=2 & x%10 <= 4 & (x%100<10 | x%100>20)){
            System.out.println( x + " программиста ");
        }else {
            System.out.println( x + " программистов ");
        }


    }
}
