import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.
//Шестнадцатеричное значение задается с помощью символов "0x" или "0X",
// за которым значение числа (цифры 0-9 и буквы A-F или a-f), например: 0x7FFF.
public class Example5 {
    public static void main(String[] args) {
        String str = (" hjdsjfgdia 1233333333333335 jhlkj 0x6ag  1233333333333335   1233333333333335 ");
        String regex = " 0[Xx]\\d[A-Fa-f]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
