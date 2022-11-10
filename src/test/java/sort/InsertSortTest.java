package sort;

import com.meowu.plugins.calculator.sort.InsertSort;
import org.junit.Test;

import java.util.Arrays;

public class InsertSortTest{

    public int[] array = {5, 20, 1, 0, 9, 25, 77, 14, 5};

    @Test
    public void byAscending(){
        InsertSort.byAscending(array);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void byDescending(){
        InsertSort.byDescending(array);

        System.out.println(Arrays.toString(array));
    }
}
