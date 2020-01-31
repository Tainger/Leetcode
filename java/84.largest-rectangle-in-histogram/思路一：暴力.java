class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int minHeight;
        int res =0;
        for(int i=0;i<heights.length;i++){
            for(int j =i;j< heights.length;j++){
                //找到这个区域最小高度
				//  i，j是左右指针。
                minHeight = Integer.MAX_VALUE;  //这个可放在上面也可以放在下面
                for(int k=i;k<=j;k++){
                    minHeight = Math.min(heights[k],minHeight);
                }
                res = Math.min(res,minHeight*(j-i+1));
            }
        }
        return res;
    }
}
// 时间复杂度：O(n*n)的复杂度找到最小高度复杂度O(n)
// 空间复杂度为O(1)