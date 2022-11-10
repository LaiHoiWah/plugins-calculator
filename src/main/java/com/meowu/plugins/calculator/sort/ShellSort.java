package com.meowu.plugins.calculator.sort;

import com.meowu.commons.utils.AssertUtils;
import com.meowu.plugins.calculator.sort.constants.Direction;

public class ShellSort{

    public static void byDescending(int[] array){
        sort(array, Direction.DESC);
    }

    public static void byAscending(int [] array){
        sort(array, Direction.ASC);
    }

    private static void sort(int[] array, Direction direction){
        AssertUtils.isNotEmpty(array, "array must not be null");
        AssertUtils.notNull(direction, "direction must not be null");

        int count = array.length / 2;

        for(int i = count; i >= 1; i /= 2){
            for(int j = i; j < array.length; j++){
                int x = array[j];
                int k = j - i;

                while(k >= 0 && (Direction.ASC.equals(direction) ? array[k] > x : array[k] < x)){
                    array[k + i] = array[k];
                    k -= i;
                }

                array[k + i] = x;
            }
        }
    }
}
