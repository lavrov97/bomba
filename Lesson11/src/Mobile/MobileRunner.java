package Mobile;

public class MobileRunner {
    public static void main(String[] args) {
         Mobile mobile = new Mobile();
        Mobile.MobileInfo mobileOne = mobile.new MobileInfo();
        Mobile forGame = new Mobile("Игровой");
        Mobile.MobileInfo mobileTwo = mobile.new MobileInfo ("Андроид", 12.5f,
                5600, 5.5f);
        Mobile.MobileInfo mobileThree = mobile.new MobileInfo ("IOS", 15.2f,
                4500, 5.7f);

        mobileOne.getFullInfo();
        System.out.println("****************************");
        mobileTwo.getFullInfo();
        System.out.println("****************************");
        mobileThree.getFullInfo();
    }
}

