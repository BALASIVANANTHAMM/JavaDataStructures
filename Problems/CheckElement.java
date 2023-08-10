import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={5, 1, 1, 9, 7, 2, 6, 10};
        int key=s.nextInt();
        Find(key,arr);
    }

    private static void Find(int key, int[] arr) {
        boolean val=false;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]==key){
                val=true;
            }
        }
        System.out.println(val);
    }

}
