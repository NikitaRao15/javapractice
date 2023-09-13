public class elementiteration {
    public static void noofseven(int arr[][])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==7)
                count++;
            }
        
            
        }
        System.out.println("no of seven in 2D array is " + count);
    }

    public static void transpose(int arr[][])
    {
        int trans[][]=new int[arr[0].length -1][arr.length-1];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                trans[j][i]=arr[i][j];
            }
        }


        for(int i=0;i<trans.length;i++)
        {
            for(int j=0;j<trans[0].length;j++)
            {
                System.out.println(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int[][] arr={
            {4,7,8},
            {8,8,7}
        };
        noofseven(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.println(arr[i][j] + "  ");
            }
            System.out.println();
        }
        transpose(arr);

    }
    
}
