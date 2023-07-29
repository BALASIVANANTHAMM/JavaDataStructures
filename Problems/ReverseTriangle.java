import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rev=s.nextInt();
        reverseTriangle(rev);
    }

    private static void reverseTriangle(int rev) {
        for (int i=rev;i>=1;i--){
            for (int j=i;j<rev;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
