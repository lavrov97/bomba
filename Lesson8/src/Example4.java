//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
public class Example4 {
    public static void main(String[] args) {
        String str = " good job ";
        for (int i = 0; i < 100000; i++) {
            str += (" good job ");
        }
        long timestr = System.currentTimeMillis();
        System.out.println(timestr);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(" good job  ");
        }
        long timeStringBuilder = System.currentTimeMillis();
        System.out.println(timeStringBuilder);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(" good job ");
        }
        long timeStringBuffer = System.currentTimeMillis();
        System.out.println(timeStringBuffer);
    }
}

