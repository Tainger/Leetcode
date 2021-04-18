# 算法

## basic

### 异或


在逻辑学中，逻辑算符异或（exclusive or）是对两个运算元的一种逻辑析取类型，符号为 XOR 或 EOR 或 ⊕（编程语言中常用^）。但与一般的逻辑或不同，异或算符的值为真仅当两个运算元中恰有一个的值为真，而另外一个的值为非真。转化为命题，就是：“两者的值不同。”或“有且仅有一个为真。”总结为，每一位相异则为1。相同则为0.




## leetCode















## 基本算法

### 排序

#### 归并排序

归并排序是一种稳定排序。



**实现1:** 自顶向下的递归

```java
public int[] mergeSort(int[] arr, int l, int r) {
        //递归的终止条件
        if(l == r) {
            return new int[] {l};
        }
        //handle logic
        int mid = l + (r - l) / 2;
        //递归排序是回溯出结果再进行合并处理
        int[] left = mergeSort1(arr, l, mid);
        int[] right = mergeSort1(arr, mid + 1, r);

        int[] res = new int[left.length + right.length];
        int rPos = 0; int i = 0;int j = 0;
        while (i < left.length && j < right.length) {
            res[rPos++] = left[i] <= right[j]?left[i++]:right[j++];
        }
        while (i < left.length) {
            res[rPos++] = left[i++];
        }
        while (j < right.length) {
            res[rPos++] = right[j++];
        }
        return res;
    }
```

**实现2**：自底向上的递归，

```java
public int[] mergeSort2(int[] arr) {
        //递归的终止条件
         for(int size = 2; size < arr.length; size *= 2) {

             for(int j = 0; j < arr.length; j += size) {

                 sort(j,j+size);
             }
         }


        return res;
}
```

