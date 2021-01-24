//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 //       полностью закрыть круглой картонкой радиусом r.
public class Example1 {
    public static void main(String[] args) {
        int a = 3;// сторона прямоугольника
        int b = 4;// сторона прямоугольника
        int r = 3;// радиус окружности
        if (2 * r >= Math.sqrt(a * a + b * b)) {
            System.out.println("можно");
        } else {
            System.out.println("нельзя");
        }
    }
}