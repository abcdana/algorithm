package com.test.columbus.string_math;

import java.io.*;
import java.util.*;

public class B20291 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> extensionCount = new TreeMap<>();

        for (int i = 0; i < num; i++){
            String fileName = br.readLine();
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

            extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
        }

        for (String ext : extensionCount.keySet()){
            System.out.println(ext + " " + extensionCount.get(ext));
        }

        br.close();
    }
}
