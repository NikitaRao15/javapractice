public class trapped_water {
    public static int total_trapped_water(int height[]){

        int n = height.length-1;
        //left-maximum auixalary array..
        int left_max[] =new int[height.length];
         left_max[0]=height[0];
        
        for(int i =1;i<=n;i++)
        {
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }

        // right most auixalary array..
        int right_max[] = new int[height.length];
         right_max[n]=height[n];
        for(int i=n-1;i>=0;i--)
        {
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }

        //calculation of trapped water between bar whose height is given by array of height and width is 1 for all
        int trapped_water = 0;
        for(int i=0;i<n;i++)
        {
            //calculation of water level between two bars...
            int water_level=Math.min(left_max[i],right_max[i]) ;
            //total trapped water in two bars...
            trapped_water += water_level - height[i];

        }
        return trapped_water;


    }
    public static void main(String []args)
    {
        int height[]={4,5,6,8,6,3,2};
        System.out.println("trapped water total is :" + total_trapped_water(height));
    }
    
}
