package Park;

public class ParkRunner {
    public static void main(String[] args) {
        Park park=new Park();
        Park.AboutOfPark park1=park.new AboutOfPark();
        Park.AboutOfPark park2=park.new AboutOfPark("Чертово колесо",6f,10f);
        Park.AboutOfPark park3=park.new AboutOfPark("Ромашка",3f,20f);
park1.getFullInfo();
        System.out.println("******************");
park2.getFullInfo();
        System.out.println("******************");
park3.getFullInfo();
    }
}
