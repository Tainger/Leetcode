#### 剑指 Offer 42. 连续子数组的最大和

输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

要求时间复杂度为O(n)。

 

示例1:

输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。


提示：

1 <= arr.length <= 10^5
-100 <= arr[i] <= 100


#### (自研)强行二维状态数组
由于内存限制，有几个case过不了。
```java
 public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int m = nums.length;
        int[][] dp = new int[m][m];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    dp[i][i] = nums[i];
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    max = Math.max(dp[i][j], max);
                    continue;
                }

                if (i - 1 < j + 1) {
                    dp[i][j] = dp[j][j] + nums[i];
                } else {
                    dp[i][j] = dp[i - 1][j + 1] + nums[j] + nums[i];
                }

                max = Math.max(dp[i][j], max);
            }
        }

        return max;

    }
```

- 时间复杂度 O(n*n)
- 空间复杂度 O(n*n)


初始化参数 是 i= 0 ， j = 0。 注意和最长回文子串比较下



#### 状态数组

```java
 public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (0 == n) return 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++)
            dp[i] = Integer.MIN_VALUE; // 初始化状态
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
```

- 时间复杂度 O(n)
- 空间复杂度 O(n)

#### 每次dp做决策的时候只需要记住上一次状态就可以了1

```java
 public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (0 == n) return 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++)
            dp[i] = Integer.MIN_VALUE; // 初始化状态
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
```

- 时间复杂度 O(n)
- 空间复杂度 O(n)