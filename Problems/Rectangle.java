import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length of Rectangle : ");
        int length=s.nextInt();
        System.out.println("Enter Breadth of Rectangle : ");
        int breadth=s.nextInt();
        areaOfRectangle(length,breadth);
        System.out.println();
        perimeterOfRectangle(length,breadth);

    }

    private static void perimeterOfRectangle(int length, int breadth) {
        int per=2*(length+breadth);
        System.out.println("Perimeter of Rectangle is : "+per);
    }

    private static void areaOfRectangle(int length, int breadth) {
        int area=length*breadth;
        System.out.println("Area of Rectangle is : "+area);
    }
}
