package com.meowu.plugins.calculator.sort;

import com.meowu.commons.utils.AssertUtils;
import com.meowu.plugins.calculator.sort.constants.Direction;

public class InsertSort{

    public static void byDescending(int[] array){
        sort(array, Direction.DESC);
    }

    public static void byAscending(int [] array){
        sort(array, Direction.ASC);
    }

    private static void sort(int[] array, Direction direction){
        AssertUtils.isNotEmpty(array, "array must not be null");
        AssertUtils.notNull(direction, "direction must not be null");

        for(int i = 1; i < array.length; i++){
            int k = array[i];
            int j = i - 1;

            while(j >= 0 && (Direction.ASC.equals(direction) ? array[j] > k : array[j] < k)){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = k;
        }
    }
}
