//Вычислить: 1+2+4+8+...+2564)Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.
public class Example13 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 2564; i *= 2) {
            a += i;
        }
        System.out.println(a);
        //A*B
        int b = (int) (Math.random() * 9 + 1);
        int c = (int) (Math.random() * 9 + 1);
        int composition = 0;
        System.out.println(" число а: " + b + " число b: " + c);
        for (int i = 0; i < c; i++) {
            composition += b;
        }
        System.out.println("произведение равно: " + composition);
    }
}

