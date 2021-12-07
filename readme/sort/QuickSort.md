
#### 快速排序

每次选一个数，然后每次把比这个节点小的数排在它的左边， 比这个节点大的数排在它的右边。
然后再左分区和右分区继续上面的步骤。


#### 代码

```java
public  void quickSort(int[] num, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }
        //设置最左边的元素为基准值
        int key=num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i=left;
        int j=right;
        while(i<j){
            //j向左移，直到遇到比key小的值
            while(num[j]>=key && i<j){
                j--;
            }
            //i向右移，直到遇到比key大的值
            while(num[i]<=key && i<j){
                i++;
            }
            //i和j指向的元素交换
            if(i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        num[left]=num[i];
        num[i]=key;
        quickSort(num,left,i-1);
        quickSort(num,i+1,right);
    }
```

#### 如何实现一个稳定的快速排序
快速排序不稳定的原因是有两个
- 在划分分区的时候，是忽略顺序的。
- 在分区划分完毕后，准中间元素替换中间元素也是忽略顺序的。

```java



```