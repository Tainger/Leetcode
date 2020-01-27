public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        int resToJudge;
        int jump=1;
        while(i>=0){
            resToJudge=digits[i];
            resToJudge = resToJudge+jump;//
            digits[i]=resToJudge%10;
            jump=resToJudge/10;
            i--;
        }
        if (jump==1){
            int res[] = new int[digits.length+1];
            System.arraycopy(digits,0,res,1,digits.length);
            res[0]=1;
            return res;
        }
        return  digits;
    }