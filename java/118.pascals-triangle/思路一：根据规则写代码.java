class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        int m,n;  //每个待确定区域上第一个指针，第二个指针
        int temp;
        List<Integer> prelist = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
		prelist.add(1);     //虚拟头list
		for(int i = 1;i <= numRows;i++){
            List<Integer> newlist = new ArrayList<>();
            for(int j=0;j<i;j++) {
                m = j;     //第二个指针
                n = j - 1; //第一个指针
                if (n < 0)
                    newlist.add(1);
                else if (j == i-1) {
                    newlist.add(1);
                }else {
                    temp = prelist.get(m) + prelist.get(n);
                    newlist.add(temp);
                }
            }
            prelist = newlist;
            res.add(newlist);
        }
        return res;
    }
}