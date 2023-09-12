import java.util.Scanner;

public class concat {
    public static void concatarray(int arr[])
    {
        int ans[]=new int[(2*arr.length)];
        int j=arr.length;
        for(int i=0;i<arr.length;i++){
            ans[i]=ans[j]=arr[i];
            j++;
        }
        for(int k=0;k<ans.length;k++)
        {
            System.out.print(ans[k] + "  ");
        }

    }
    public static void main(String args[])
    {
       Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array no.");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        concatarray(arr);
    }
    
}
