class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prefix[]  = new int[nums.length];
        int suffix[]  = new int [nums.length];
        int ans[] = new int[nums.length];

        int prefixProd = 1;
        prefix[0] = prefixProd;
        for(int i = 1 ; i < nums.length;i++)
        {
            prefixProd= prefixProd*nums[i-1];
            prefix[i] = prefixProd;
        }

         int suffixProd = 1;
        suffix[nums.length-1] = suffixProd;
        for(int i = nums.length-2 ; i >= 0 ; i--)
        {
            suffixProd = suffixProd * nums[i+1];
            suffix[i]=suffixProd;
        }


        for(int i = 0; i< nums.length;i++)
        {
            ans[i] = prefix[i] * suffix [i];
        }

        return ans;
    }
}  
