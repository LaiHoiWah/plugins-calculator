package sort;

import com.meowu.plugins.calculator.sort.QuickSort;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest{

    public int[] array = {0, 20, 1, 0, 9, 25, 77, 14, 5};

    @Test
    public void byAscending(){
        QuickSort.byAscending(array);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void byDescending(){
        QuickSort.byDescending(array);

        System.out.println(Arrays.toString(array));
    }
}
