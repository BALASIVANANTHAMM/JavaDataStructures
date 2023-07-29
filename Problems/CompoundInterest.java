import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Principal Amount : ");
        int P=s.nextInt();
        System.out.println("Enter the Time Period : ");
        int T=s.nextInt();
        System.out.println("Enter the Rate of Interest : ");
        float R=s.nextFloat();

        calculateCompoundInterest(P,T,R);
    }

    private static void calculateCompoundInterest(int p, int t, float r) {
        double compoundInterest= p*(Math.pow(1+r/100,t));

        System.out.println("Compound Interest is : "+compoundInterest);
    }
}
