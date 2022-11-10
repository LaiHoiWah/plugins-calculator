package sort;

import com.meowu.plugins.calculator.sort.BubbleSort;
import com.meowu.plugins.calculator.sort.SelectionSort;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest{

    public int[] array = {5, 20, 1, 0, 9, 25, 77, 14, 5};

    @Test
    public void byAscending(){
        SelectionSort.byAscending(array);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void byDescending(){
        SelectionSort.byDescending(array);

        System.out.println(Arrays.toString(array));
    }
}
