public class buy_sell_stock {
    public static void profit_by_stock(int prices[])
    {
        int buying_stock[]=new int[prices.length];
        buying_stock[0]=prices[0];
        int n=prices.length;
        for(int i=1;i<n;i++)
        {
            buying_stock[i]=Math.min(prices[i],buying_stock[i-1]);
        }
        int profit =0;
        int max_profit =0;
        for(int i=0;i<n;i++)
        {
            profit=prices[i]-buying_stock[i];
            if(max_profit<profit)
            {
                max_profit=profit;
            }
            System.out.print(profit + " ");
        }
        System.out.println();
        System.out.println("maximum profit from stock is :" + max_profit);
    }
        

    
    public static void main(String []args)
    {
        int prices[]={1,9,5,13,6,4};
        profit_by_stock(prices);
    }
    
}
