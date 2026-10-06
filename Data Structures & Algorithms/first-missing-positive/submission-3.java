class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int lg = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length;i++)
        {
            table.put(nums[i],1);

            if(nums[i] >lg)
            {
                lg = nums[i];
            }
        }
        int i = 1;
        for(; i <= lg ;i++)
        {
           if (!table.containsKey(i))
           {
            return i ; 
           }
        }


    return i ;


    }
}           