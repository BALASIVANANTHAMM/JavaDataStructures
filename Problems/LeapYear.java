import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        leapYear(l);
    }

    private static void leapYear(int l) {
        if (l%4==0 || (l%400==0) && (l%100!=0)){
            System.out.println(l+" is a Leap Year");
        }else {
            System.out.println(l+" is not a Leap Year");
        }
    }
}
