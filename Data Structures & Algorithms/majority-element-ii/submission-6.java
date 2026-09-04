class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
ArrayList<Integer> list = new ArrayList<>();
int count = 0;              // ab 0, kuch gina nahi
for(int i = 0; i < nums.length; i++)
{
    if(i > 0 && nums[i] == nums[i-1])
        count++;
    else
        count = 1;          // naya group (ya pehla element)
    
    if(count > nums.length/3 && !list.contains(nums[i]))
        list.add(nums[i]);
}
return list;
    }
}