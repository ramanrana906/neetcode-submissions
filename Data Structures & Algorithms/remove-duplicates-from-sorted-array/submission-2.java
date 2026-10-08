class Solution {
    public int removeDuplicates(int[] nums) {
        int lastSwapped = nums[0];

         int i = 1;
         int j = i;
        while(i < nums.length && j < nums.length)
        {
           if( lastSwapped == nums[j])
           {
                j++;
           }
           else
           {
                 int temp = nums[i];
                 nums[i] = nums[j];
                 nums[j] = temp;
                 lastSwapped = nums[i];
                 i++;
                 j++;
           }
        }

        return i;
    }
}