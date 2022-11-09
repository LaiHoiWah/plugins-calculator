package com.meowu.plugins.calculator.sort;

import com.meowu.commons.utils.AssertUtils;

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
                switch(direction){
                    case ASC:
                        if(array[j] < array[index])
                            swap(array, j, index);
                        break;

                    case DESC:
                        if(array[j] > array[index])
                            swap(array, j, index);
                        break;

                    default:
                        break;
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
