package com.meowu.plugins.calculator.sort;

import com.meowu.commons.utils.AssertUtils;
import com.meowu.plugins.calculator.sort.constants.Direction;

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
            int index = position(array, low, high, direction);

            doSort(array, low, index - 1, direction);
            doSort(array, index + 1, high, direction);
        }
    }

    private static int position(int[] array, int low, int high, Direction direction){
        int i = low;
        int j = high;
        int x = array[low];

        while(i < j){
            while(Direction.ASC.equals(direction) ? (array[j] >= x && i < j) : (array[j] <= x && i < j)){
                j--;
            }

            if(i < j){
                array[i] = array[j];
                i++;
            }

            while(Direction.ASC.equals(direction) ? (array[i] < x && i < j) : (array[i] > x && i < j)){
                i++;
            }

            if(i < j){
                array[j] = array[i];
                j--;
            }
        }

        array[i] = x;

        return i;
    }
}
