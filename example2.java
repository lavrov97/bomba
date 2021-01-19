public class example2 {
    public static void main(String[] args) {
        int num=8453 ;
        int a = num%10;
        int b =((num-a)/10)%10;
        int c = ((((num-a)/10)-b)/10)%10;
        int d = (((((num-a)/10)-b)/10)/10)%10;

        System.out.println(a*1000+b*100+c*10+d);
    }
}
