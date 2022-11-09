package com.meowu.plugins.calculator.sort;

import com.meowu.commons.utils.AssertUtils;

public class QuickSort{

    public static void byDescending(int[] array){
        sort(array, Direction.DESC);
    }

    public static void byAscending(int [] array){
        sort(array, Direction.ASC);
    }

    private static void sort(int[] array, Direction direction){
        AssertUtils.isNotEmpty(array, "array must not be null");
        AssertUtils.notNull(direction, "direction must not be null");

        int low  = 0;
        int high = array.length - 1;

        doSort(array, low, high, direction);
    }

    private static void doSort(int[] array, int low, int high, Direction direction){
        if(low < high){
            switch(direction){
                case ASC:
                    int index = positionByAscending(array, low, high);
                    break;

                case DESC:
                    break;

                default:
                    break;
            }

            doSort(array, low, index - 1, direction);
            doSort(array, index + 1, high, direction);
        }
    }

    private static int positionByAscending(int[] array, int low, int high){

    }
}
