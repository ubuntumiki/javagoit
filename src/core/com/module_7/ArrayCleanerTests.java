package core.com.module_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCleanerTests {
    public static void main(String[] args) {
        //Input data
        String[] items = {"a", "b", "a", "c", "b", "a"};

        //Expected output data - a, b, c
//        String[] result = new ArrayCleaner().removeDuplicates(items);
//
//        System.out.println(Arrays.toString(result));

        List<String> unique = Arrays.stream(items).distinct().toList();
        String[] uniqueArray = unique.toArray(new String[0]);

        System.out.println(Arrays.toString(uniqueArray));
    }
}
