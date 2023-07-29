import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("No of Rows : ");
        int rows=s.nextInt();
        System.out.println("No of Columns : ");
        int columns=s.nextInt();
        squarePattern(rows,columns);
    }

    private static void squarePattern(int r, int c) {
        for (int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                if (i==1||i==r||j==1||j==c){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
