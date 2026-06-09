class Solution {
    public int[] twoSum(int[] nums, int target) {

      HashMap<Integer,Integer> map  = new HashMap<>();
        int[] ans = new int[2];

      for( int i = 0 ; i < nums.length ;i++)
      {

        if(map.containsKey(nums[i]))
        {
       
            ans[0] = map.get(nums[i]);
            ans[1] = i;
            break;
        }
        else
        {
            int temp = target - nums[i];
            map.put(temp,i);
        }
        

      }  

      return ans;
       
    }
}
