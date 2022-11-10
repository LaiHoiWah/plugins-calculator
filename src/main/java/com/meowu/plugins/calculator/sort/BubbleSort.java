package com.meowu.plugins.calculator.sort;

import com.meowu.commons.utils.AssertUtils;
import com.meowu.plugins.calculator.sort.constants.Direction;

public class BubbleSort{

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
            for(int j = 0; j < array.length - 1; j++){
                if(Direction.ASC.equals(direction) ? (array[j] > array[j + 1]) : (array[j] < array[j + 1])){
                    swap(array, j);
                }
            }
        }
    }

    private static void swap(int[] array, int index){
        int temp = array[index + 1];

        // swap positions
        array[index + 1] = array[index];
        array[index]     = temp;
    }
}
