class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //多复制一个数组，不用挪了
        int nums1Copy[] = new int [m];
        System.arraycopy(nums1,0,nums1Copy,0,m);

        int i = 0;// nums1Copy指针
        int j = 0;// nums2指针
        int p = 0;// nums1指针

        while(i<m&&j<n){
            if(nums1Copy[i]<nums2[j]){
                nums1[p]=nums1Copy[i];
                p++;
                i++;
            }else{
                nums1[p]=nums2[j];
                p++;
                j++;
            }
        }
        if(i<m)
            System.arraycopy(nums1Copy,i,nums1,p,m+n-1-p+1);
        if(j<n)
            System.arraycopy(nums2,j,nums1,p,m+n-1-p+1);
    }
}

///  时间复杂度O(n+m)    空间复杂度  O(m)