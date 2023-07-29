import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        primeNo(N);
    }

    private static void primeNo(int n) {
        int prime;
        for (int i=1;i<=n;i++){
            if (i==1||i==0) continue;
            prime=1;
            for (int j=2;j<=i/2;++j){
                if (i%j==0){
                    prime=0;
                    break;
                }
            }
            if (prime==1) System.out.println(i + " ");
        }
    }
}
