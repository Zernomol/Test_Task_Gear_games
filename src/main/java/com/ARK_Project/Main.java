package com.ARK_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        Compresser compresser = new Compresser();
        int[] result = compresser.compress_numbers(read());
        System.out.println(write(result));


    }

    //Ввод через пробел в консоль (не используется в тестах)
    public static int[] read() throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String console = reader.readLine();
        String[] sResult = console.split(" ");
        int count = sResult.length;

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = Integer.parseInt(sResult[i]);
        }


        return result;

    }

    public static String write(int[] input) {
        String result = "";
        for (int i : input) {
            result+=i+" ";
        }
        return result.trim();
    }


}