public List<Integer> getRow(int rowIndex) {
	int m,n;  //每个待确定区域上第一个指针，第二个指针
	int temp;
	List<Integer> prelist = new ArrayList<>();
	prelist.add(1);     //虚拟头list
	for(int i = 1;i <= rowIndex+1;i++){
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
	}
	return prelist;
}