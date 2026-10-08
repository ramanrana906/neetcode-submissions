class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i+1 ;
        
                while (j < nums.length && nums[j] == nums[i]  ) {
                    j++;
                }
                list.add(nums[i]);
               i = j - 1;
            
        }

        

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}