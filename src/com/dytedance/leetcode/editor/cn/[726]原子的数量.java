package com.dytedance.leetcode.editor.cn;//给定一个化学式formula（作为字符串），返回每种原子的数量。
//
// 原子总是以一个大写字母开始，接着跟随0个或任意个小写字母，表示原子的名字。 
//
// 如果数量大于 1，原子后会跟着数字表示原子的数量。如果数量等于 1 则不会跟数字。例如，H2O 和 H2O2 是可行的，但 H1O2 这个表达是不可行的。
// 
//
// 两个化学式连在一起是新的化学式。例如 H2O2He3Mg4 也是化学式。 
//
// 一个括号中的化学式和数字（可选择性添加）也是化学式。例如 (H2O2) 和 (H2O2)3 是化学式。 
//
// 给定一个化学式 formula ，返回所有原子的数量。格式为：第一个（按字典序）原子的名字，跟着它的数量（如果数量大于 1），然后是第二个原子的名字（按字
//典序），跟着它的数量（如果数量大于 1），以此类推。 
//
// 
//
// 示例 1： 
//
// 
//输入：formula = "H2O"
//输出："H2O"
//解释：
//原子的数量是 {'H': 2, 'O': 1}。
// 
//
// 示例 2： 
//
// 
//输入：formula = "Mg(OH)2"
//输出："H2MgO2"
//解释： 
//原子的数量是 {'H': 2, 'Mg': 1, 'O': 2}。
// 
//
// 示例 3： 
//
// 
//输入：formula = "K4(ON(SO3)2)2"
//输出："K4N2O14S4"
//解释：
//原子的数量是 {'K': 4, 'N': 2, 'O': 14, 'S': 4}。
// 
//
// 示例 4： 
//
// 
//输入：formula = "Be32"
//输出："Be32"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= formula.length <= 1000 
// formula 由小写英文字母、数字 '(' 和 ')' 组成。 
// formula 是有效的化学式。 
// 
// Related Topics 栈 哈希表 字符串 
// 👍 198 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution726 {
    //用于i标记处理哪个字符串
    int i, n;
    //
    String formula;

    //将formula
    public String countOfAtoms(String formula) {
        this.i = 0;
        this.n = formula.length();
        this.formula = formula;

        Deque<Map<String, Integer>> stack = new LinkedList<>();

        while (i < n) {

            if (formula.charAt(i) == '(') {
                i++;
                stack.push(new HashMap<String, Integer>());
            } else if (formula.charAt(i) == ')') {
                i++;

                //获取括号右边的数字
                int num = parseNum();

                Map<String, Integer> popMap = stack.pop();
                Map<String, Integer> peekMap = stack.peek();

                for (Map.Entry entry : popMap.entrySet()) {
                    String key = (String) entry.getKey();
                    Integer value = (Integer) entry.getValue();
                    peekMap.put(key, value + num * value);
                }

            } else {
                String atom = parseAtom();
                int num = parseNum();
                Map<String, Integer> topMap = stack.peek();
                Integer num1 = topMap.get(atom);
                topMap.put(atom, num1 + num);

            }
        }


        Map<String, Integer> map = stack.peek();
        TreeMap<String, Integer> treeMap = new TreeMap<>(map);

        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = (String) entry.getKey();
            int value = (int) entry.getValue();
            sb.append(key);
            if (value > 1) {
                sb.append(value);
            }
        }

        return sb.toString();


    }


    //将字母转换成character
    public String parseAtom() {
        StringBuffer sb = new StringBuffer();
        sb.append(formula.charAt(i++)); //扫描首字母
        while (i < n && Character.isLowerCase(formula.charAt(i))) {
            sb.append(formula.charAt(i++));
        }
        return sb.toString();
    }

    //将字符串数字转换成数字,
    //1.如果是字母的话，那么当前字母的数字就为1
    //2. 如果是数字那么取出。 数字的考虑好进制转换。
    public int parseNum() {
        if (i == n || !Character.isDigit(formula.charAt(i))) {
            return 1;
        }

        int num = 0;

        while (i < n && Character.isDigit(formula.charAt(i))){
            num = num * 10 + formula.charAt(i++) - '0';
        }

        return 0;
    }

    public static void main(String[] args) {
        String formula = "K4(No(SO3)2)2";
        Solution726 solution726 = new Solution726();
        String s = solution726.countOfAtoms(formula);
        System.out.println(s);
    }


}
//leetcode submit region end(Prohibit modification and deletion)
