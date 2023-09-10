public class prefix_sum_arr {
    public static void prifix_sum(int arr[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
             int sum =0;

            for( int j=0;j<=i;j++)
            {
                sum=sum+arr[j];

            }
           arr[i]=sum;
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

         //maximum and minimum value prefix array....
        int pre_maxsum = Integer.MIN_VALUE;
        int pre_minsum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           if(pre_maxsum<arr[i])
           {
            pre_maxsum=arr[i];
           }
           if(pre_minsum>arr[i])
           {
            pre_minsum=arr[i];
           }
        
        }
        System.out.println("maximum sum of sub-array :" + pre_maxsum);
        System.out.println("minimum sum of sub-array :" + pre_minsum);
   

    }
    public static void main( String args[])
    {
        int arr[]={-9,-32,-7,-11,-4,-1};
        prifix_sum(arr);
       }

    
}
