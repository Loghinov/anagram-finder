package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnagramImplementation {

    public Map<String, List<String>> findAnagrams(String file){
        Map<String, List<String>> result = new LinkedHashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String word;
            while((word = reader.readLine()) != null){
                word = word.trim();
                if (word.isEmpty()) continue;
                String key = sortLetters(word);
                result.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }
        }catch (IOException e){
            System.out.println("Filed to read file"+ e.getMessage());
        }
        return  result;
    }

    private static  String sortLetters(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
