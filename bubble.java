public class bubble {
    public static void bubble_sort(int arr[])
    {
        for (int turn =0;turn<arr.length-1;turn++)
        {
            for (int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String []args)
    {
        int arr[]={9,4,3,8,7,2};
        bubble_sort(arr);
        for(int i=0;i<arr.length;i++)
{
        System.out.print(arr[i] + "  ");
}
    }
    
}
