package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 13 on 2017/4/7.
 */
public class CollectionSortTest {
    public static void main(String args[]) {

        List<String> list1 = Arrays.asList("peter", "anna", "mike", "xenia");
        sort(list1);
        for (String name : list1
                ) {
            System.out.println(name);
        }

        List<String> list2 = Arrays.asList("peter2", "anna2", "mike2", "xenia2");
        sortByLambda(list2);
        for (String name : list2
                ) {
            System.out.println(name);
        }

    }

    public static void sort(List<String> lists) {
        Collections.sort(lists, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

    }

    public static void sortByLambda(List<String> lists) {
        Collections.sort(lists, (String a, String b) -> a.compareTo(b));
    }
}
