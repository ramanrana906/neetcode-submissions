class Solution {
  public int firstMissingPositive(int[] nums) {
 
    int largest = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      largest = Math.max(largest,nums[i]);
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    for (int i = 1; i < largest; i++) {
      
    if (!map.containsKey(i)) 
     {
        return i ;
     } 
    }

   return largest+1;
  }
}