package com.rss;

public class SingleNumberFinding {
    //finding non repeating integer from int[]

    public int check(int [] nums){
        int si = 0;
        for (int i = 0; i < nums.length; i++){
            si = si ^ nums[i];
        }
        return si;
    }

    public static void main(String[] args) {
        int [] hi = new int[6];
        hi[0] = 34;
        hi[1] = 14;
        hi[2] = 44;
        hi[3] = 54;
        hi[4] = 24;
        hi[5] = 34;

        int [] nu = {34, 45, 34};

        SingleNumberFinding testing = new SingleNumberFinding();
        int y = testing.check(hi);
        int x = testing.check(nu);
        System.out.println(x);
        System.out.println(y);

    }
}
