package core.com.module_7;

import java.util.Arrays;

public class ArrayCleanerTests {
    public static void main(String[] args) {
        //Input data
        String[] items = {"a", "b", "a", "c", "b", "a"};

        //Expected output data - a, b, c
        String[] result = new ArrayCleaner().removeDuplicates(items);

        System.out.println(Arrays.toString(result));
    }
}
