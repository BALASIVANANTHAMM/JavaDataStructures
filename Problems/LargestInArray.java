public class LargestInArray {
    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 98};
        System.out.println(Largest(arr));
    }

    private static int Largest(int[] arr) {
        int lar=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }
}
