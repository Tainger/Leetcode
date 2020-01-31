class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int [2];
        Map<Integer,Integer> map  = new HashMap<>();
        int temp;
        for(int i = 0;i<numbers.length;i++) {
            temp = target - numbers[i];
            if (!map.containsKey(temp))
                map.put(numbers[i], i);
            else {
                res[0] = map.get(temp)+1;
                res[1] = i+1;
            }
        }
        return res;
    }
}


//时间复杂度为O(n) 空间复杂度为O(n);