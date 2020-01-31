class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int sum;
        while(i<j){
            sum = numbers[i]+numbers[j];
            if(target == sum){
               return  new int[]{i+1,j+1};
            }else if(sum>target){
                j--;
            }else {
                i++ ;
            }
        }
        return  null;
    }
}


//时间复杂度为O(n) 空间复杂度为O(1);