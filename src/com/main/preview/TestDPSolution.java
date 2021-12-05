package com.main.preview;

import com.dytedance.leetcode.editor.cn.*;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author jiazhiyuan
 * @date 2021/12/4 8:07 下午
 */
public class TestDPSolution {


    /**
     * 46. 全排列题
     */
    @Test
    public void test() {
        Solution46 solution46 = new Solution46();
        List<List<Integer>> permute = solution46.permute(new int[]{1, 2, 3, 4});
    }

    /**
     * 最长回文子串
     */
    @Test
    public void testSolution5() {
        Solution5 solution5 = new Solution5();
        String res = solution5.longestPalindrome("babad");
        System.out.println(res);
    }


    /**
     * 连续数组的最大和
     */
    @Test
    public void testSolutionJianzhi42() {
        SolutionJianzhi42 solutionJianzhi42 = new SolutionJianzhi42();
        int res = solutionJianzhi42.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(res);
    }

    /**
     * 连续数组的最大和，第二种解决方案
     */
    @Test
    public void testSolutionJianzhi42_2() {
        SolutionJianzhi42 solutionJianzhi42 = new SolutionJianzhi42();
        int res = solutionJianzhi42.maxSubArray2(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(res);
    }


    @Test
    public void testSolution409() {
        Solution409 solution409 = new Solution409();
        int res = solution409.getLongestPalindromeSubseq( "hahaa");
        System.out.println(res);
    }


    @Test
    public void testSolution1143() {
        Solution1143 solution1143 = new Solution1143();
        int res = solution1143.longestCommonSubsequence( "hahaa", "heihei");
        System.out.println(res);
    }
}



    
