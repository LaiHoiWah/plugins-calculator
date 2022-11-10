package com.meowu.plugins.calculator.sort;

import com.meowu.commons.utils.AssertUtils;
import com.meowu.plugins.calculator.sort.constants.Direction;

public class SelectionSort{

    public static void byDescending(int[] array){
        sort(array, Direction.DESC);
    }

    public static void byAscending(int [] array){
        sort(array, Direction.ASC);
    }

    private static void sort(int[] array, Direction direction){
        AssertUtils.isNotEmpty(array, "array must not be null");
        AssertUtils.notNull(direction, "direction must not be null");

        for(int i = 0; i < array.length - 1; i++){
            int index = i;

            for(int j = i + 1; j < array.length; j++){
                if(Direction.ASC.equals(direction) ? (array[j] < array[index]) : (array[j] > array[index])){
                    swap(array, j, index);
                }
            }
        }
    }

    private static void swap(int[] array, int index, int swap){
        int temp = array[index];

        array[index] = array[swap];
        array[swap]  = temp;
    }
}
