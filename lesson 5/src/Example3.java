//Имеется целое число, определить является ли это число простым, т.е.
  //      делится без остатка только на 1 и себя.
public class Example3 {
    public static void main(String[] args) {
        int n = 9;
        int i;
        boolean a = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                a = true;
                break;
            }
        }
        if (a) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}
