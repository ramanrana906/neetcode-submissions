class Solution {
    public int[] sortArray(int[] nums) {
        
        return mergeSort(nums, nums.length-1,0);
    }

    public int[] mergeSort(int[] nums , int high , int low )
    {

        if( low >= high)
        {
            return nums;
        }
        int mid = low +(high-low)/2;

        mergeSort( nums,high,mid+1);
        mergeSort( nums ,mid, low);
        return merge(nums, high , low, mid);


        
    }

    public int[] merge(int[] nums, int high, int low, int mid)
{
    int[] arr1 = new int[(mid-low)+1];
    int[] arr2 = new int[high-mid];
    int[] ans = new int[arr1.length+arr2.length];

    for (int i = low; i <= mid; i++) {
        arr1[i - low] = nums[i];
    }
    for (int i = mid+1; i <= high; i++) {
        arr2[i - (mid+1)] = nums[i];
    }

    int i = 0, j = 0, k = 0;
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] <= arr2[j]) { ans[k++] = arr1[i++]; }
        else { ans[k++] = arr2[j++]; }
    }
    while (i < arr1.length) { ans[k++] = arr1[i++]; }
    while (j < arr2.length) { ans[k++] = arr2[j++]; }

    // write back into the original array
    for (int x = 0; x < ans.length; x++) {
        nums[low + x] = ans[x];
    }

    return nums; // return nums, not ans, for consistency
}
}