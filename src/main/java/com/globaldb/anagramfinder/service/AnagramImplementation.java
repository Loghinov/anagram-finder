package com.globaldb.anagramfinder.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnagramImplementation {

    public Map<String, List<String>> groupAnagram (List<String> words){
        Map<String, List<String>> result = new LinkedHashMap<>();
        for (String word : words){
            String sorted = sortLetters(word);
            result.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        return result;
    }

    private static  String sortLetters(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public  void printAnagramGroups(Map<String, List<String>> map){
        for (List<String> group : map.values()){
            System.out.println(String.join(" ", group));
        }
    }
}
