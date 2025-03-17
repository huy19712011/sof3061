package org.example.sof3061.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingStream {

    public static void main(String[] args) {

        // List
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        list.stream()
                .forEach(integer -> System.out.println(integer));

        // Arrays
        int[] arr = {1, 2, 3};
        Arrays.stream(arr)
                .forEach(i -> System.out.println(i));
    }


}

