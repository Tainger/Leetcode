class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int [2];
        for(int i = 0;i<numbers.length-1;i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    res[0] = i + 1;
                    res[1] = j + 1;
                }
            }
        }
        return res;
    }
}


//时间复杂度为O(n*n) 空间复杂度为O(1);