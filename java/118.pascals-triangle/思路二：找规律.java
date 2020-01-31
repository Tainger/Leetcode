class Solution {
  public List<List<Integer>> generate(int numRows) {
        List prelist = new ArrayList();
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==0)
            return res;
        prelist.add(1);
        res.add(prelist);
        for(int i=0;i<numRows-1;i++){
            List list = toNextList(prelist);
            res.add(list);
            prelist = list;
        }
        return res;
    }

    private List toNextList(List<Integer> prelist) {
        List<Integer> copyList = new ArrayList();
        for(int i = 0 ;i<prelist.size();i++){
            copyList.add(null);
        }
        Collections.copy(copyList,prelist);
        copyList.add(0);
        List  list = new ArrayList();
        for(int i=0 ;i<copyList.size();i++){
            list.add(copyList.get(i).intValue()+copyList.get((i+copyList.size()-1)%copyList.size()).intValue());
        }
        return list;
    }
}