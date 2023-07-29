import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int num=s.nextInt();
        checkEvenOrOdd(num);
    }

    private static void checkEvenOrOdd(int num) {
        if (num%2==0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
    }
}
