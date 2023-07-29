import java.util.Scanner;

public class MirrorTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int mir=s.nextInt();
        upperTriangle(mir);
        lowerTriangle(mir);
    }

    private static void lowerTriangle(int m) {
//        for loop for lower triangle
//        for (int i=1;i<=m;i++){
//            for (int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j<=m;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        int i=1;
        while (i<=m){
            int j=1;
            while (j<i){
                System.out.print(" ");
                j++;
            }
            j=i;
            while (j<=m){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    private static void upperTriangle(int m) {
//        for loop for upper triangle
//       for (int i=m-1;i>=0;i--){
//           for (int j=0;j<i;j++){
//               System.out.print(" ");
//           }
//           for (int j=i;j<=m-1;j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
       int i=m-1;
       while (i>=0){
           int j=0;
           while (j<i){
               System.out.print(" ");
               j++;
           }
           j=i;
           while (j<=m-1){
               System.out.print("* ");
               j++;
           }
           i--;
           System.out.println();
       }
    }
}
