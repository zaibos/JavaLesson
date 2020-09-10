package main.java.Stack;

import java.util.Comparator;
import java.util.List;

public class CustomComparator implements Comparator<List<String>> {

    @Override
    public int compare(List<String> o1, List<String> o2) {
        String first =  o1.get(1);
        String second = o2.get(1);
        return first.compareTo(second);
    }
}
