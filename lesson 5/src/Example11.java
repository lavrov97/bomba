//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
  //      Какой суммарный путь пробежит спортсмен за 7 дней?
public class Example11 {
    public static void main(String[] args) {
    double distance = 10;
    double sum = 0;
    for (int i = 0; i < 7; i++) {
        sum += distance;
        distance = distance + (distance * 0.1);
    }
    System.out.println("пробежал за 7 дней: " + (int) sum);
}
}
