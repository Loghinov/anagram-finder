package com.globaldb.anagramfinder;


import com.globaldb.anagramfinder.service.AnagramImplementation;
import com.globaldb.anagramfinder.service.FileReader;

import java.util.List;
import java.util.Map;


public class AnagramFinderApplication {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        List<String> words = FileReader.readWords(fileName);
        AnagramImplementation anagramImplementation = new AnagramImplementation();
        Map<String, List<String>> map = anagramImplementation.groupAnagram(words);
        anagramImplementation.printAnagramGroups(map);
    }
}
