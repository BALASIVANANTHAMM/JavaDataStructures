import java.util.Scanner;

public class NeonNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int val=s.nextInt();
        neonNumber(val);
    }

    private static void neonNumber(int val) {
        int square=val*val,sum = 0;
        while (square>0){
            int res=square%10;
            sum+=res;
            square=square/10;
        }
        if (sum==val){
            System.out.println(val+" is Neon Number");
        }else {
            System.out.println(val+" is not Neon Number");
        }
    }
}
