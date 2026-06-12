package com.ARK_Project;

import java.util.ArrayList;
import java.util.List;

public class Compresser {
    public int[] compress_numbers(int[] input) {
        if (input.length == 0)
            return new int[0];
        int k = 1;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        list.add(input[0]);


        while (j + k < input.length) {


            if (input[j] == input[j + k])
                k++;

            else {
                j = j + k;
                k = 1;
                list.add(input[j]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
