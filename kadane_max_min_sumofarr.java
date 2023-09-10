public class kadane_max_min_sumofarr {

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
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]<0){
                arr[k]=0;
            }
            System.out.print(arr[k] +"  ");
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
        int arr[]={9,-32,7,45,-14,-1,88};
        prifix_sum(arr);
       }

    
}

    

