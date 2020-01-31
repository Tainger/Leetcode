class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int minHeight;
        int res =0;
        for(int i=0;i<heights.length;i++){
            minHeight = Integer.MAX_VALUE;
            for(int j =i;j< heights.length;j++){
                    minHeight = Math.min(heights[j],minHeight);
                res = Math.max(res,minHeight*(j-i+1));
            }
        }
        return res;
    }
}

//时间复杂度O(n*n)
//空间复杂度O(1)