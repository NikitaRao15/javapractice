public class counting {
    public static void counting_sort(int arr[])
    {
        int large=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            large=Math.max( large, arr[i]);
        }

        int count[] = new int[large+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0){
                arr[j]=i;
                j++;
               count[i]--;
            }
        }

    }
    public static void main(String args[])
    {
        int arr[]={8,4,0,9,1,7};
        counting_sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
    
}
