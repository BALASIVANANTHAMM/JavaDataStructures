import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int fact=s.nextInt();
        checkFactorialValue(fact);
    }

    private static void checkFactorialValue(int fact) {
        int r=1;
        for (int i=2;i<=fact;i++){
            r*=i;
        }
        System.out.println("Factorial of "+fact+" is "+r);
    }
}
