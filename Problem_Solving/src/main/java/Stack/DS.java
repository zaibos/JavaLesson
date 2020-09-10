package main.java.Stack;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import main.java.Stack.CustomComparator;

public class DS {

    ArrayList<List<String>> aList = new ArrayList<List<String>>();

    public void zuhaib() {
        List<String> a1 = new ArrayList<String>();
        a1.add("zuhiab");
        a1.add("2");
        aList.add(a1);

        List<String> a2 = new ArrayList<String>();
        a2.add("rizwan");
        a2.add("1");
        aList.add(a2);

        List<String> a3 = new ArrayList<String>();
        a3.add("Adi");
        a3.add("3");
        aList.add(a3);

    }

    public static void main(String[] args) {

        DS obj = new DS();
        obj.zuhaib();

        ArrayList<List<String>> var = obj.aList;
        System.out.println(var.toString());
        //Collections.sort(var,new CustomComparator());

        Stream<List<String>> arrayListStream = var.stream().sorted((o1, o2) -> new CustomComparator().compare(o1, o2));

        System.out.println(arrayListStream.collect(Collectors.toList()));
    }

}
