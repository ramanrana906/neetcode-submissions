class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int maxProfit=0;
        while(i < prices.length-1)
        {
            if(prices[i] < prices[i+1])
            {
                int basePrice = prices[i];
                int j = i+1;
                int sellingPrice = prices[j];
                while( j< prices.length )
                {
//System.out.println("I am here"+prices[i]);
                    if(prices[j] < prices[j-1])
                    {
                       
                        break;
                    }
                    if(prices[j] > sellingPrice)
                    {
                        sellingPrice = prices[j];
                        
                    }
                    j++;
                   
                }
                int profit = sellingPrice - basePrice;
               // System.out.println(sellingPrice + " " + basePrice);
                maxProfit = maxProfit + profit;
                i = (j-1);
                             System.out.println(i + " " );
  
            }
            else
            {
                i++;
            }
           

        }
        return maxProfit;
    }
}