import java.util.Scanner;

public class FindLargestOfThree {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();
        findLargest(x,y,z);
    }

    private static void findLargest(int x, int y, int z) {
        if (x>y){
            if (x>z){
                System.out.println(x+" is Greatest Number");
            }else {
                System.out.println(z+" is Greatest Number");
            }
        }else {
            if (y>z){
                System.out.println(y+" is Greatest Number");
            }else {
                System.out.println(z+" is Greatest Number");
            }
        }
        System.out.println();
        System.out.println("Another Method Of Finding Largest Number");
        int l=z>(x>y?x:y) ? z:((x>y)?x:y);
        System.out.println(l+" is Greatest Number");
    }
}
