package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Comparator<String> comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);

        int value1 = 5 * x1 * x1 + 3;
        int value2 = 5 * x2 * x2 + 3;

        if (value1 == value2) {
            return Integer.compare(x1,x2);
        }
        else{
            return Integer.compare(value1,value2);
        }
    }
}
