public class SwapTwoValues {
        public static void main(String[] args) {
            int m=5,n=9;
            swapValues(m,n);
        }

        private static void swapValues(int m, int n) {
            int temp=m;
            m=n;
            n=temp;
            System.out.println("Value of m : "+m+" Value of n : "+n);
        }
}
