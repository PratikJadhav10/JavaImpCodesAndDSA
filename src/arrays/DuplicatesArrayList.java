package arrays;

import java.util.*;

public class DuplicatesArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,2,6,7);

        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}
