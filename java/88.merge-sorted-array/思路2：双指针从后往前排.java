class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =m-1;    //nums1的指针
        int j =n-1;    //nums2的指针
        int p =m+n-1;  //结果指针
        while(i >= 0 && j >= 0){
            if(nums1[i]>=nums2[j]){
                nums1[p] = nums1[i];
                p--;
                i--;
            }else{
                nums1[p] = nums2[j];
                p--;
                j--;
            }
        }
        while(i>=0){
            nums1[p--] = nums1[i--];
        }
        while(j>=0){
            nums1[p--] = nums2[j--];
        }
    }
}
//时间复杂度O(m+n),空间复杂度O(1)