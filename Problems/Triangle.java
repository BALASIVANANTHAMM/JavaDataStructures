import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int triangle=s.nextInt();
        leftTriangle(triangle);
    }

    private static void leftTriangle(int triangle) {
        for (int i=0;i<triangle;i++){
            for (int j = 2 * (triangle - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
