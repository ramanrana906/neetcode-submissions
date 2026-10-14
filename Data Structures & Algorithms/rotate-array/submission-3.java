class Solution {
    public void rotate(int[] nums, int k) {
        int ans[]  = new int[nums.length];

        int l  = 0 ;
        if( k > nums.length)
        {
            k = k%nums.length;
        }
        for(int i = nums.length-k ; i< nums.length; i++)
        {
            ans[l] = nums[i];
            l++;
        }
        for(int i = 0 ; i< nums.length-k; i++)
        {
            ans[l] = nums[i];
            l++;
        }
        for(int i = 0 ; i< nums.length; i++)
        {
            nums[i] = ans[i];
            
        }
    }
}