package com.stepup.mains;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStreamTest {
    public static void main(String[] args){
        //System.out.println(getStringFromStream(Stream.of("Hello", "world", "from", "Java")));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        printList(list1);
    }

    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream
                .collect(Collectors.joining(" "));
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(System.out::println);
    }

    //    public static void printList(ArrayList<Integer> list) {
    //        list.forEach(element -> System.out.println(element));
    //    }
}
