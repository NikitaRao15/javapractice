public class diagonal_matrix_sum {
    public static void diagonal_sum(int arr[][])
    {
        int diag1_sum =0;
        int diag2_sum =0;
        for(int i=0;i<arr.length;i++)
        {
            int j=0;
            for( j=0;j<arr[0].length;j++)
            {
                if(i==j)
                {
                    diag1_sum=diag1_sum+arr[i][j];
                    
                }
                // else if(i+j==arr.length-1)
                // {
                //    diag2_sum=diag2_sum+arr[i][arr.length -1-i];
                // }
            }
            diag2_sum=diag2_sum+arr[i][arr.length -1-i];
            
        }
        System.out.println(diag1_sum);
        System.out.println(diag2_sum);
        
        if(arr.length%2==0)
        {
          System.out.println(diag1_sum+diag2_sum);
        }
        else{
            int sum=diag1_sum+diag2_sum -arr[arr.length/2][arr.length/2];
            System.out.println(sum);
        }



        // method 2...
         
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i][i];
            if(i!= arr.length -1-i)
            sum+=arr[i][arr.length-1-i];
        }
        System.out.println(sum);
        
    }
    public static void main(String args[])
    {
        int arr[][]={
            {1,2,3,4,9},
            {4,3,8,0,9},
            {3,7,2,4,2},
            {0,9,2,5,7},
            {8,4,2,6,0}
        };
        diagonal_sum(arr);
    }
    
    
}
