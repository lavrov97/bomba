//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.
public class Example3 {
public static void main(String[] args) {
        String str = "any many money more";
        StringBuilder res = new StringBuilder();

        String [] words = str.split("\\s+");
    System.out.println(str);
        for ( String word : words )
        res.append(word.toCharArray()[word.length()-1 ]);
        System.out.println("Result: " + res.toString());
        }

        }
