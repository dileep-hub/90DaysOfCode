package com.dileep.Day1;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> arrL = new ArrayList<List<Integer>>();
        List<Integer> prevL = null;

        for(int i=0; i<numRows; i++) {
            List<Integer> res = new ArrayList<Integer>();

            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i) {
                    res.add(1);
                } else {
                    res.add(prevL.get(j-1) + prevL.get(j));
                }
            }
            arrL.add(res);
            prevL = res;
        }
        return arrL;

    }
}

//    Your input
//5
//        Output
//        [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//        Expected
//        [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
