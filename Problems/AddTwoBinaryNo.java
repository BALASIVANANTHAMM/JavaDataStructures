import java.util.Scanner;

public class AddTwoBinaryNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String x=s.nextLine(),y=s.nextLine();
        addBinaryValues(x,y);
    }

    private static void addBinaryValues(String x, String y) {
        int a=Integer.parseInt(x,2);
        int b=Integer.parseInt(y,2);

        int sum =a+b;

        String r=Integer.toBinaryString(sum);
        System.out.println("Sum of Binary Values are : "+r);

    }
}
