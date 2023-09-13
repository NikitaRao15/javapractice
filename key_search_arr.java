public class key_search_arr {
    public static boolean key_search(int arr[][] ,int key)
    {
        int row =0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0)
        {
            if(arr[row][col]==key)
            {

            System.out.println("key found at "+ row +"th row " + col +"th col");
            return true;

            }

            else if(arr[row][col]>key)
             { 
                col--;
             }

            else
            {
            row++;
            }

        }

        System.out.println("key not found");

        int rowx=arr.length-1;
        int colx=0;
        while(rowx>=0 &&colx<arr[0].length-1)
        {
            if(key==arr[rowx][colx])
            {
                System.out.println("key found at "+ row +"th row " + col +"th col");
            return true;
            }
            else if(key<arr[rowx][colx])
            {
                rowx--;
            }
            else
            {
                colx++;
            }
        }


        System.out.println("key not found");
        return false;
        

    }
    public static void main(String args[])
    {
        int arr[][]={
            {2,3,4},
            {13,14,15},
            {24,25,26}
        };
        key_search(arr,276);
    }
    
}
