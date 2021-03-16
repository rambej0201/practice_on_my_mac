package com.rss;

//import sun.jvm.hotspot.utilities.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class KindOfTwoDimArray {

    //two dimension array

    /*
    Input: [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

    Example 2:
    Input: [[1,4],[4,5]]
    Output: [[1,5]]
    Explanation: Intervals [1,4] and [4,5] are considered overlapping.
     */
    public int [][] testMerg(int [][] testInput){
        //integer array is rutinring

        if (testInput.length <= 1)
            return testInput;

        //sorting is required to merging
        Arrays.sort(testInput,(m1, m2) -> Integer.compare(m1[0], m2[0]));


        List<int[]> resList = new ArrayList<int[]>();
        int[] newInput = testInput[0];
        resList.add(newInput);
        for(int[] test : testInput){
            if(test[0] <= newInput[1])
                newInput[1] = Math.max(newInput[1], test[1]);
            else {
                newInput = test;
                resList.add(newInput);
            }
        }
        return resList.toArray(new int[resList.size()][]);

    }

    public static void main(String[] args) {

        KindOfTwoDimArray testObj = new KindOfTwoDimArray();

        //[[1,3],[2,6],[8,10],[15,18]]

        int [][] givenList = {{1,3},{2,6},{8,10},{15,18}};

        //System.out.println(testObj.testMerg(givenList));

        //printing

        for (int [] t1: testObj.testMerg(givenList)){
            System.out.println(Arrays.toString(t1));
        }
        //testObj.testMerg(givenList);

    }


}
