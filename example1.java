
public class example1 {
    public static void main(String[] args) {
        int seconds = 4500;
        int sec = seconds%60;
        int min = (seconds-sec)/60;
        int m = min%60;
        int hours = (min-m)/60;
        int d = hours%24;
        int days = (hours-d)/24;
        int w = days%7;
        int week = (days-w)/7;

        System.out.println(min + "минут" + sec + "секунд");
        System.out.println(hours + "часов" + m + "минут" + sec + "секунд");
        System.out.println(days + "дней" + hours + "часов" + m + "минут" + sec + "секунд");
        System.out.println(week + "недель" + days + "дней" + hours + "часов" + m + "минут" + sec + "секунд");

    }
}
