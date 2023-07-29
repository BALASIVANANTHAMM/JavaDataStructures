import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Principal Amount : ");
        int P=s.nextInt();
        System.out.println("Enter the Time Period : ");
        int T=s.nextInt();
        System.out.println("Enter the Rate of Interest : ");
        int R=s.nextInt();

        calculateSimpleInterest(P,T,R);
    }

    private static void calculateSimpleInterest(int p, int t, int r) {
        float simpleInterest= (float) (p * t * r) /100;

        System.out.println("Simple Interest is : "+simpleInterest);
    }
}
