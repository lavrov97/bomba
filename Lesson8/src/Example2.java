
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
public class Example2 {
    public static void main(String[] args)  {
        String str = "  This is simple that contains phone number";
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int сount = 0;
        while (matcher.find()) {
            сount++;
        }
        System.out.println(сount);
    }
}
