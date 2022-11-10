package sort;

import com.meowu.plugins.calculator.sort.ShellSort;
import org.junit.Test;

import java.util.Arrays;

public class ShellSortTest{

    public int[] array = {5, 20, 1, 0, 9, 25, 77, 14, 5};

    @Test
    public void byAscending(){
        ShellSort.byAscending(array);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void byDescending(){
        ShellSort.byDescending(array);

        System.out.println(Arrays.toString(array));
    }
}
