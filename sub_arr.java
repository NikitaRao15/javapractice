public class sub_arr {

    public static void print_subarray(int arr[]) {
        int total_sub_arr = 0;
        int max_sum = 0;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            // int start = i;
            int sum = 0;
            int msum =Integer.MAX_VALUE;
            for (int j = 0; j <= arr.length - 1; j++) {
                int sum1 = 0;
                // int end = j;
                for (int k = i; k <= j; k++) {
                    sum1 = sum1 + arr[k];
                    System.out.print(arr[k] + " ");

                }

                total_sub_arr++;

                if (sum1 > sum) {
                    sum = sum1;
                }
                if(sum1<msum){
                    msum=sum1;
                }
                System.out.println();

            }
            if (max_sum < sum) {
                max_sum = sum;
            }
            if(min_sum>msum)
            {
                min_sum=msum;
            }
            System.out.println("maximum sum of sub array inner :" + sum);
            System.out.println("minimum sum of sub array inner:" + msum);
            System.out.println();
        }
        System.out.println("total sub arrays:" + total_sub_arr);
        System.out.println("maximum sum from sub array :" + max_sum);
        System.out.println("minimum sum from sub array:" + min_sum);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 9, 5, 0, 2, 7 };
        print_subarray(arr);
    }
}