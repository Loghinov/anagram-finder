package com.globaldb.anagramfinder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.AnagramImplementation;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class AnagramFinderApplication {

    public static void main(String[] args) {

        if (args.length < 1){
            return;
        }
        String inputFile = args[0];
        AnagramImplementation anagram = new AnagramImplementation();
        Map<String, List<String>> map = anagram.findAnagrams(inputFile);

        for(List<String> list:map.values()){
            System.out.println(list);
        }
    }
}
