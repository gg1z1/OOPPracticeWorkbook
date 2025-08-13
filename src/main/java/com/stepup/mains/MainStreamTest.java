package com.stepup.mains;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStreamTest {
    public static void main(String[] args){
        System.out.println(getStringFromStream(Stream.of("Hello", "world", "from", "Java")));
    }

    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream
                .collect(Collectors.joining(" "));
    }
}
