class Solution {
    public int maxArea(int[] heights) {
        int i  =0;
        int j = heights.length-1;
        int maxVol = 0;
        while(i< heights.length && j >=0 )
        {
            if(heights[i] >= heights[j])
            {
                int width = j-i;
                int height = Math.min(heights[i],heights[j]);
                int vol = width*height;

                maxVol = Math.max(vol,maxVol);
            }
            else if(heights[j] >= heights[i])
            {
                int width = j-i;
                int height = Math.min(heights[i],heights[j]);
                int vol = width*height;

                maxVol = Math.max(vol,maxVol);
            }
            if(heights[i] < heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }
            
           
        }

        return maxVol;
    }
}
