package com.josef.sort;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Integer head = list.remove(0);
        list.add(head);

        list.forEach(System.out::println);

    }





}
